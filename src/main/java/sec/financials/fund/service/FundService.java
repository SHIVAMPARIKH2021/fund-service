package sec.financials.fund.service;


import org.springframework.stereotype.Service;
import sec.financials.fund.domain.Fund;
import sec.financials.fund.domain.FundRepository;

@Service
public class FundService {

    private final FundRepository fundRepository;

    public FundService(FundRepository fundRepository) {
        this.fundRepository = fundRepository;
    }

    public Fund fetchFundById(Integer id) {
        return fundRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Fund not found: " + id)
                );
    }

}
