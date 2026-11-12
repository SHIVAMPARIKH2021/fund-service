package sec.financials.benchmark.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface JpaBenchmarkRepository extends JpaRepository<BenchmarkJpaEntity, Long> {
}
