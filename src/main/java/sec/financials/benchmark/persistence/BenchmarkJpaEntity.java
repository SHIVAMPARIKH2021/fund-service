package sec.financials.benchmark.persistence;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Schema(name = "analytics")
@Table(name = "benchmark_master")
public class BenchmarkJpaEntity {

    @Column(name = "benchmark_id", nullable = false)
    private Integer benchmarkId;

    @Column(name = "benchmark_name", nullable = false)
    private String benchmarkName;

    @Column(name = "benchmark_provider", nullable = false)
    private String benchmarkProvider;

    @Column(name = "benchmark_type", nullable = false)
    private String benchmarkType;

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
}
