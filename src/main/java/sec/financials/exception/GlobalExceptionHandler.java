package sec.financials.exception;

import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;
import sec.financials.fund.exception.InvalidFundException;
import sec.financials.fund.exception.NoFundFoundException;
import sec.financials.fund.exception.RegulatoryInvariantViolationException;

import java.security.InvalidParameterException;
import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final String FUND_ERROR = "Fund Error";
    private static final String VALIDATION_ERROR = "Validation Error";
    private static final String INTERNAL_SERVER_ERROR = "Internal Server Error";

    public record ErrorResponse(
            String timestamp,
            int status,
            String error,
            String message
    ) {
    }

    @ExceptionHandler(InvalidFundException.class)
    public ResponseEntity<@NonNull ErrorResponse> invalidFundRequestException(InvalidFundException ex) {
        return buildErrorResponse(HttpStatus.BAD_REQUEST, FUND_ERROR, ex.getMessage());
    }

    @ExceptionHandler(NoFundFoundException.class)
    public ResponseEntity<@NonNull ErrorResponse> noFundFoundException(NoFundFoundException ex) {
        return buildErrorResponse(HttpStatus.NOT_FOUND,FUND_ERROR, ex.getMessage());
    }

    @ExceptionHandler(HandlerMethodValidationException.class)
    public ResponseEntity<@NonNull ErrorResponse> handleMethodValidation(HandlerMethodValidationException ex) {
        return buildErrorResponse(HttpStatus.BAD_REQUEST, VALIDATION_ERROR, ex.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<@NonNull ErrorResponse> handleRuntimeException(RuntimeException ex) {
        return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, INTERNAL_SERVER_ERROR, ex.getMessage());
    }

    @ExceptionHandler(InvalidParameterException.class)
    public ResponseEntity<@NonNull ErrorResponse> handleInvalidParameterException(InvalidParameterException ex) {
        return buildErrorResponse(HttpStatus.BAD_REQUEST, VALIDATION_ERROR, ex.getMessage());
    }

    @ExceptionHandler(RegulatoryInvariantViolationException.class)
    public ResponseEntity<@NonNull ErrorResponse> handleRegulatoryInvariantViolationException(RegulatoryInvariantViolationException ex) {
        return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, INTERNAL_SERVER_ERROR, ex.getMessage());
    }

    private ResponseEntity<@NonNull ErrorResponse> buildErrorResponse(
            HttpStatus status,
            String error,
            String message) {

        return ResponseEntity
                .status(status)
                .body(new ErrorResponse(
                        Instant.now().toString(),
                        status.value(),
                        error,
                        message
                ));
    }
}
