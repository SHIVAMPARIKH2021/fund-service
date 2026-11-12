package sec.financials.fund.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class FundBenchmarkAssociation {
    private Integer id;
    private String seriesId;
    private Integer benchmarkId;
    private String benchmarkName;
    private Boolean isPrimary;
    private String accessionNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
