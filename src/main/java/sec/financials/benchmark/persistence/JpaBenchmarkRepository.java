package sec.financials.benchmark.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaBenchmarkRepository extends JpaRepository<BenchmarkJpaEntity, Long> {
}
