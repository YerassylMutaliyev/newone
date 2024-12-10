package lab5.iitu.exception;
import java.util.List;
import java.util.StringJoiner;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerUser {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handler(MethodArgumentNotValidException e) {

        StringJoiner errorResponse = new StringJoiner("\n");
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        for (ObjectError error : errors) {
            errorResponse.add(error.getDefaultMessage());
        }

        return ResponseEntity.badRequest().body(errorResponse.toString());
    }
}
