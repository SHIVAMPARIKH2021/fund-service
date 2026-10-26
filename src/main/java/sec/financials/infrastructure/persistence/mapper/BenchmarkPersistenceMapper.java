package sec.financials.infrastructure.persistence.mapper;

import sec.financials.domain.benchmark.model.Benchmark;
import sec.financials.infrastructure.persistence.benchmark.BenchmarkJpaEntity;

public class BenchmarkPersistenceMapper {

    BenchmarkJpaEntity toEntity(Benchmark benchmark) {
        return new BenchmarkJpaEntity();
    }

    Benchmark toDomain(BenchmarkJpaEntity benchmarkJpaEntity) {
        return new Benchmark();
    }
}
