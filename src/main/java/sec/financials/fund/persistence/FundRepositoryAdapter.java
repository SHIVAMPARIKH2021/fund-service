package sec.financials.fund.persistence;

import org.springframework.stereotype.Repository;
import sec.financials.fund.domain.Fund;
import sec.financials.fund.domain.FundRepository;

import java.util.Optional;

@Repository
public class FundRepositoryAdapter implements FundRepository {

    private final JpaFundRepository jpaFundRepository;

    public FundRepositoryAdapter(JpaFundRepository jpaFundRepository) {
        this.jpaFundRepository = jpaFundRepository;
    }

    @Override
    public Optional<Fund> findById(Integer id) {
        return jpaFundRepository.findById(Long.valueOf(id))
                .map(FundPersistenceMapper::toDomain);
    }
}
