package sec.financials.fund.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "fund_master", schema = "analytics")
public class FundJpaEntity {

    @Id
    @Column(name = "fund_id", nullable = false)
    private Integer fundId;

    @Column(name = "fund_name", nullable = false)
    private String fundName;

    @Column(name = "fund_family", nullable = false)
    private String fundFamily;

    @Column(name = "strategy_narrative", nullable = false)
    private String strategyNarrative;

    @Column(name = "investment_objective", nullable = false)
    private String investmentObjective;

    @Column(name = "strategy_type", nullable = false)
    private String strategyType;

    @Column(name = "cik", nullable = false)
    private String cik;

    @Column(name = "series_id", nullable = false)
    private String seriesId;

    @Column(name = "benchmark_name", nullable = false)
    private String benchmarkName;

    @Column(name = "benchmark_id", nullable = false)
    private Integer benchmarkId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "accession_number", nullable = false)
    private String accessionNumber;

    @Column(name = "has_daily_pricing", nullable = false)
    private Boolean hasDailyPricing;

    @Column(name = "has_quarterly_holdings", nullable = false)
    private Boolean hasQuarterlyHoldings;
}
