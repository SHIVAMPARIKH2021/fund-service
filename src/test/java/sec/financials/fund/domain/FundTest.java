package sec.financials.fund.domain;

import lombok.*;
import sec.financials.benchmark.domain.Benchmark;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class FundTest {
    private Integer fundId;
    private String fundName;
    private String fundFamily;
    private String fundType;//Active, Passive, Unknown
    private String investmentObjective;
    private String strategyNarrative;
    private String seriesId;
    private String cik;
    private List<Benchmark> associatedBenchmarks;
    private String primaryTicker;
    private String filingNumber;//adsh
    private Integer effectiveFromQuarter;
    private Integer effectiveFromYear;
}
