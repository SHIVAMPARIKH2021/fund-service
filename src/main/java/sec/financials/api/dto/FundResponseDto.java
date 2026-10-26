package sec.financials.api.dto;

public record FundResponseDto(
        Integer fundId,
        String fundName,
        String fundFamily,
        String strategyType,
        String strategyNarrative,
        String investmentObjective,
        String cik,
        String seriesId,
        String accessionNumber,
        Boolean hasDailyPricing,
        Boolean hasQuarterlyHoldings
) {
}
