package com.zensar.im.exceptions;

import java.util.Date;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
     
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundHandling(ResourceNotFoundException ex,WebRequest req){
		ErrorDetails ed = new ErrorDetails(new Date(),ex.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<>(ed,HttpStatus.EXPECTATION_FAILED);
	}
	
}
