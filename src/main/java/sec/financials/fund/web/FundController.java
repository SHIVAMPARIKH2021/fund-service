package sec.financials.fund.web;

import ch.qos.logback.core.util.StringUtil;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import sec.financials.fund.domain.Fund;
import sec.financials.fund.exception.InvalidFundException;
import sec.financials.fund.service.FundService;


@Slf4j
@RestController
@RequestMapping("/v1")
@Validated
class FundController {

    @Value("${fund.series.format}")
    private String seriesFormat;

    private final FundService fundService;

    public FundController(FundService fundService) {
        this.fundService = fundService;
    }

    @GetMapping("/fund/{series}/overview")
    ResponseEntity<@NonNull FundResponseDto> fetchFundInformationBySeries(
            @PathVariable("series")
            String seriesId
    ) {
        if(StringUtil.isNullOrEmpty(seriesId) || !seriesId.matches(seriesFormat)) {
            throw new InvalidFundException("Invalid Series Id: " + seriesId);
        }
        var response = fundService.fetchFundBySeries(seriesId);
        log.info("Successfully fetched fund with series id {}", seriesId);
        return ResponseEntity.ok(FundWebMapper.toFundResponseDto(response));
    }

    @GetMapping("/funds")
    ResponseEntity<@NonNull PageResponseDto<Fund>> getAllFunds(
            @PageableDefault(
                    size = 20,
                    sort = "fundId",
                    direction = Sort.Direction.ASC
            ) Pageable pageable
    ) {
        PageResponseDto<Fund> pagedFunds = FundWebMapper.toPageResponseDto(fundService.findAll(pageable));
        log.info("Successfully fetched funds...");
        return ResponseEntity.ok(pagedFunds);
    }
}
