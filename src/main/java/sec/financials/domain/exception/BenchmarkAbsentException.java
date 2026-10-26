package sec.financials.domain.exception;

public class BenchmarkAbsentException extends RuntimeException {
    public BenchmarkAbsentException(String message) {
        super(message);
    }
}
