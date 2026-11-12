package sec.financials.fund.persistence;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import sec.financials.fund.domain.Fund;
import sec.financials.fund.domain.FundRepository;

import java.util.Optional;

@Slf4j
@Repository
class FundRepositoryAdapter implements FundRepository {

    private final FundJpaRepository fundJpaRepository;

    public FundRepositoryAdapter(FundJpaRepository fundJpaRepository) {
        this.fundJpaRepository = fundJpaRepository;
    }

    @Override
    public Optional<Fund> findBySeriesId(String seriesId) {
        log.info("Fetching data from database for series id {}", seriesId);
        return fundJpaRepository.findBySeriesId(seriesId)
                .map(FundPersistenceMapper::toDomain);
    }

    @Override
    public Page<@NonNull Fund> findAll(Pageable pageable){
        log.info("Fetching the funds from data base.");
        return fundJpaRepository.findAll(pageable).map(FundPersistenceMapper::toDomain);
    }
}
