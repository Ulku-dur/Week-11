package dev.patika.libraryAppWeek11.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
// hata mesajını konsolda görmek için kullandığımız anatasyon
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    //yazılan kodlar sayesinde swaaggerda istek atılınca orada responsebody görebileceğiz
    @ExceptionHandler(AuthorAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleAuthorAlreadyExistsException (WebRequest request,
                                                                             AuthorAlreadyExistsException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatuscode(400);
        errorResponse.setOccurenceDate(LocalDateTime.now());
        errorResponse.setMessage(ex.getMessage());
        // hatanın hangi url den geldiğini görmek için yazdık
        errorResponse.setDescription(request.getDescription(false));
        // erro mesajını konsola bas
        log.error(errorResponse.toString());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }


}
