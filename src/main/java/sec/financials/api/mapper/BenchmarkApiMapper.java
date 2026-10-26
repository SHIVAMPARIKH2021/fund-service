/**
 * Only maps Web JSON <-> Application DTO
 */
package sec.financials.api.mapper;

import sec.financials.api.dto.BenchmarkRequestDto;
import sec.financials.api.dto.BenchmarkResponseDto;
import sec.financials.application.dto.BenchmarkDto;

public class BenchmarkApiMapper {

    BenchmarkDto toBenchmarkDto(BenchmarkRequestDto requestDto) {
        return new BenchmarkDto();
    }

    BenchmarkResponseDto toBenchmarkResponseDto(BenchmarkDto dto) {
        return new BenchmarkResponseDto();
    }
}
