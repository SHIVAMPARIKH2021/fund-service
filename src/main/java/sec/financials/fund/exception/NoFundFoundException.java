package sec.financials.fund.exception;

public class NoFundFoundException extends RuntimeException {
    public NoFundFoundException(String message) {
        super(message);
    }
}
