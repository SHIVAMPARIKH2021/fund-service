package sec.financials.fund.web;

import lombok.NonNull;
import org.springframework.data.domain.Page;
import sec.financials.fund.domain.Fund;

public class FundWebMapper {

    public static FundResponseDto toFundResponseDto(Fund fund) {
       return new FundResponseDto(
               fund.getFundId(),
               fund.getFundName(),
               fund.getFundFamily(),
               fund.getTicker(),
               fund.getFundType(),
               fund.getPrimaryBenchmarkName(),
               fund.getPrimaryBenchmarkId(),
               fund.getStrategyNarrative(),
               fund.getInvestmentObjective(),
               fund.getCik(),
               fund.getSeriesId(),
               fund.getFilingNumber(),
               fund.getHasDailyPricing(),
               fund.getHasQuarterlyHoldings()
       );
    }

    public static <T> PageResponseDto<T> toPageResponseDto(Page<@NonNull T> result) {
        return new PageResponseDto<>(
                result.getContent(),
                result.getNumber(),
                result.getSize(),
                result.getTotalElements(),
                result.getTotalPages(),
                result.isFirst(),
                result.isLast()
        );
    }
}
