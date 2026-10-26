package sec.financials.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sec.financials.api.dto.FundResponseDto;

@RestController
public class FundController {

    public ResponseEntity<FundResponseDto> getFundById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(new FundResponseDto(
                null, null, null, null, null, null, null, null, null, null, null
        ));
    }
}
