package sec.financials.fund.web;

public record FundResponseDto(
        Integer fundId,
        String fundName,
        String fundFamily,
        String ticker,
        String fundType,
        String benchmark,
        Integer benchmarkId,
        String strategyNarrative,
        String investmentObjective,
        String cik,
        String seriesId,
        String accessionNumber,
        Boolean hasDailyPricing,
        Boolean hasQuarterlyHoldings
) {
}
