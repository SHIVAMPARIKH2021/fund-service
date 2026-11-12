/**
 * This class act as an orchestrator to determine which methods of @FundRepository.java to call.
 */

package sec.financials.fund.service;


import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sec.financials.fund.domain.Fund;
import sec.financials.fund.domain.FundRepository;
import sec.financials.fund.exception.NoFundFoundException;


@Service
public class FundService {

    private final FundRepository fundRepository;

    public FundService(FundRepository fundRepository) {
        this.fundRepository = fundRepository;
    }

    public Fund fetchFundBySeries(String seriesId) {
        var fund = new Fund();
        var fetchedFund = fundRepository.findBySeriesId(seriesId)
                .orElseThrow(() ->
                        new NoFundFoundException("No fund found for series: " + seriesId)
                );
        fund.classifyStrategyRule(fetchedFund.getFundType());
        return fetchedFund;
    }

    public Page<@NonNull Fund> findAll(Pageable pageable) {
        return fundRepository.findAll(pageable);
    }

}
