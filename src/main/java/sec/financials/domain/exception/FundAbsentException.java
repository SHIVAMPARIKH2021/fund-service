package sec.financials.domain.exception;

public class FundAbsentException extends RuntimeException {
    public FundAbsentException(String message) {
        super(message);
    }
}
