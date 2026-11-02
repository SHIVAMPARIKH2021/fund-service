package sec.financials.fund.web;

import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sec.financials.fund.service.FundService;

@RestController
public class FundController {

    private final FundService fundService;

    public FundController(FundService fundService) {
        this.fundService = fundService;
    }

    @GetMapping("/v1/fund/{fundId}")
    public ResponseEntity<@NonNull FundResponseDto> fetchFundInformation(@PathVariable("fundId") Integer fundId) {
        var response = fundService.fetchFundById(fundId);
        return ResponseEntity.ok(
            new FundResponseDto(
                        response.getFundId(),
                        response.getFundName(),
                        response.getFundFamily(),
                        response.getFundType(),
                        response.getPrimaryBenchmarkName(),
                        response.getPrimaryBenchmarkId(),
                        response.getStrategyNarrative(),
                        response.getInvestmentObjective(),
                        response.getCik(),
                        response.getSeriesId(),
                        response.getFilingNumber(),
                        response.getHasDailyPricing(),
                        response.getHasQuarterlyHoldings()
            )
        );
    }
}
