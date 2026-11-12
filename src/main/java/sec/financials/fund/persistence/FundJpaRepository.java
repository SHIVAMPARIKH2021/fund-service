package sec.financials.fund.persistence;

import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


interface FundJpaRepository extends JpaRepository<@NonNull FundJpaEntity, @NonNull Long> {

    Optional<FundJpaEntity> findBySeriesId(String seriesId);

    @NonNull
    Page<@NonNull FundJpaEntity> findAll(@NonNull Pageable pageable);
}
