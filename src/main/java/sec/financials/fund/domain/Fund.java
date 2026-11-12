package sec.financials.fund.domain;

import ch.qos.logback.core.util.StringUtil;
import lombok.*;
import org.springframework.context.annotation.Bean;
import sec.financials.fund.exception.RegulatoryInvariantViolationException;

import java.time.LocalDateTime;

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
    private String ticker;
    private String filingNumber;//adsh
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
    private String reportingCadence;
    private Boolean hasDailyPricing;
    private Boolean hasQuarterlyHoldings;
    private Integer effectiveFromQuarter;
    private Integer effectiveFromYear;

    /**
     * A passive fund type must have a primary benchmark.
     * A newer fund - less than one year of filing history is exempted by SEC for not to have benchmark.
     * @param fundType - ACTIVE, PASSIVE, UNKNOWN
     */
    public void classifyStrategyRule(String fundType) {
        if(fundType.equalsIgnoreCase("PASSIVE")) {
            if(this.primaryBenchmarkId == null || StringUtil.notNullNorEmpty(this.primaryBenchmarkName)) {
                throw new RegulatoryInvariantViolationException("Primary Benchmark Not Found");
            }
        }
    }
}
