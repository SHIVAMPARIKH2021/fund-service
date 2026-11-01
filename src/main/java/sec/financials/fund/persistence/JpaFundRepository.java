package sec.financials.fund.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaFundRepository extends JpaRepository<FundJpaEntity, Long> {
}
