/**
 * Only maps Web JSON <-> Application DTO
 */
package sec.financials.api.mapper;

import sec.financials.api.dto.FundRequestDto;
import sec.financials.api.dto.FundResponseDto;
import sec.financials.application.dto.FundDto;

public class FundApiMapper {

    FundDto toFundDto(FundRequestDto requestDto) {
        return new FundDto();
    }

    FundResponseDto toFundResponseDto(FundDto dto) {
        return new FundResponseDto(
                null, null, null, null, null, null, null, null, null, null, null
        );
    }
}
