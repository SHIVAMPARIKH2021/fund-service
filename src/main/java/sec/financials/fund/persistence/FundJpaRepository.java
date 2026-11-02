package sec.financials.fund.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FundJpaRepository extends JpaRepository<FundJpaEntity, Long> {
}
