package sec.financials.fund.persistence;

import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import sec.financials.fund.persistence.entity.FundJpaEntity;

import java.util.Optional;


public interface FundJpaRepository extends JpaRepository<@NonNull FundJpaEntity, @NonNull Long> {

    Optional<FundJpaEntity> findBySeriesId(String seriesId);

    @NonNull
    Page<@NonNull FundJpaEntity> findAll(@NonNull Pageable pageable);
}
