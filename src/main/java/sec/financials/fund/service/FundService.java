package sec.financials.fund.service;


import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sec.financials.fund.domain.Fund;
import sec.financials.fund.domain.FundRepository;
import sec.financials.fund.exception.NoFundFoundException;
import sec.financials.fund.web.FundResponseDto;
import sec.financials.fund.web.FundWebMapper;
import sec.financials.fund.web.PageResponseDto;

@Service
public class FundService {

    private final FundRepository fundRepository;

    public FundService(FundRepository fundRepository) {
        this.fundRepository = fundRepository;
    }

    public Fund fetchFundBySeries(String seriesId) {
        return fundRepository.findBySeriesId(seriesId)
                .orElseThrow(() ->
                        new NoFundFoundException("No fund found for series: " + seriesId)
                );
    }

    public Page<@NonNull Fund> findAll(Pageable pageable) {
        return fundRepository.findAll(pageable);
    }

}
