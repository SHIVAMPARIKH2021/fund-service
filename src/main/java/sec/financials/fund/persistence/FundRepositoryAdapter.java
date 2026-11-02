package sec.financials.fund.persistence;

import org.springframework.stereotype.Repository;
import sec.financials.fund.domain.Fund;
import sec.financials.fund.domain.FundRepository;

import java.util.Optional;

@Repository
public class FundRepositoryAdapter implements FundRepository {

    private final FundJpaRepository fundJpaRepository;

    public FundRepositoryAdapter(FundJpaRepository fundJpaRepository) {
        this.fundJpaRepository = fundJpaRepository;
    }

    @Override
    public Optional<Fund> findById(Integer id) {
        return fundJpaRepository.findById(Long.valueOf(id))
                .map(FundPersistenceMapper::toDomain);
    }
}
