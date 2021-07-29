package com.example.dtodemo.validation;

import com.example.dtodemo.ErrorDetails;
import com.example.dtodemo.entity.Student;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice  ////it is used to handle exceptional globally  and is auto detected by component scanning
public class ValidationHandler extends ResponseEntityExceptionHandler {

    //with using ErrorDetails class

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<?> customValidation(MethodArgumentNotValidException exception)
//    {
//        ErrorDetails errorDetails = new ErrorDetails("validationError",
//                exception.getBindingResult().getFieldError().getDefaultMessage());
//
//        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
//    }

    //without using ErrorDetails class
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {

            String fieldName = ((FieldError) error).getField();
            String message = error.getDefaultMessage();
            errors.put(fieldName, message);
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
