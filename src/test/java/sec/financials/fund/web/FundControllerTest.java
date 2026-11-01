package sec.financials.fund.web;

import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundControllerTest {

    public ResponseEntity<@NonNull FundResponseDto> fetchFundInformation(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(new FundResponseDto(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
        ));
    }
}
