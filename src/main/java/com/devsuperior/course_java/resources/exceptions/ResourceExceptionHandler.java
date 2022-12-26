package com.devsuperior.course_java.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.course_java.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandartError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		var error = "Resource not found";
		var status = HttpStatus.NOT_FOUND;
		var standartError = new StandartError(Instant.now(), status.value(), error, e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(standartError);
	}
}
