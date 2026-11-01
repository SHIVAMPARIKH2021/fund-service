package sec.financials.fund.domain;

import java.util.Optional;

public interface FundRepository {

    Optional<Fund> findById(Integer id);
}
