package sec.financials.benchmark.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Benchmark {
    private Integer benchmarkId;
    private String benchmarkName;
    private String benchmarkProvider;
    private String benchmarkType;
    private String filingNumber;//adsh
    private Boolean isPrimary;
}
