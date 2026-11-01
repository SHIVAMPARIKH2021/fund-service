package sec.financials.fund.domain;

import lombok.*;
import sec.financials.benchmark.domain.Benchmark;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Fund {
    private Integer fundId;
    private String fundName;
    private String fundFamily;
    private String fundType;//Active, Passive, Unknown
    private String investmentObjective;
    private String strategyNarrative;
    private String seriesId;
    private String cik;
    private String primaryBenchmarkName;
    private Integer primaryBenchmarkId;
    private String primaryTicker;
    private String filingNumber;//adsh
    private Boolean hasDailyPricing;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
    private Boolean hasQuarterlyHoldings;
    private Integer effectiveFromQuarter;
    private Integer effectiveFromYear;
}
