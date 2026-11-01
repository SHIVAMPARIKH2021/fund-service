package sec.financials.benchmark.persistence;

import sec.financials.benchmark.domain.Benchmark;

public class BenchmarkPersistenceMapper {

    public static Benchmark toDomain(BenchmarkJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        Benchmark benchmark = new Benchmark();
        benchmark.setBenchmarkId(entity.getBenchmarkId());
        benchmark.setBenchmarkName(entity.getBenchmarkName());
        return benchmark;
    }
}
