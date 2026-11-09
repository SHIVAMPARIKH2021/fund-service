package sec.financials.fund.persistence;

import sec.financials.fund.domain.Fund;
import sec.financials.fund.persistence.entity.FundJpaEntity;

public class FundPersistenceMapper {

    public static Fund toDomain(FundJpaEntity fundEntity) {
        if (fundEntity == null) {
            return null;
        }
        Fund fund = new Fund();
        fund.setFundId(fundEntity.getFundId());
        fund.setFundName(fundEntity.getFundName());
        fund.setFundFamily(fundEntity.getFundFamily());
        fund.setTicker(fundEntity.getPrimaryTicker());
        fund.setFundType(fundEntity.getStrategyType());
        fund.setInvestmentObjective(fundEntity.getInvestmentObjective());
        fund.setStrategyNarrative(fundEntity.getStrategyNarrative());
        fund.setCik(fundEntity.getCik());
        fund.setSeriesId(fundEntity.getSeriesId());
        fund.setFilingNumber(fundEntity.getAccessionNumber());
        fund.setPrimaryBenchmarkId(fundEntity.getBenchmarkId());
        fund.setPrimaryBenchmarkName(fundEntity.getBenchmarkName());
        fund.setReportingCadence(fundEntity.getReportingCadence());
        fund.setHasDailyPricing(fundEntity.getHasDailyPricing());
        fund.setHasQuarterlyHoldings(fundEntity.getHasQuarterlyHoldings());
        fund.setCreatedAt(fundEntity.getCreatedAt());
        fund.setUpdatedAt(fundEntity.getUpdatedAt());
        fund.setCreatedBy(fundEntity.getCreatedBy());
        fund.setUpdatedBy(fundEntity.getUpdatedBy());
        return fund;
    }
}
