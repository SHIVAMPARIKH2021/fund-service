package sec.financials.fund.domain;

import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface FundRepository {

    Optional<Fund> findBySeriesId(String seriesId);

    Page<@NonNull Fund> findAll(Pageable pageable);
}
