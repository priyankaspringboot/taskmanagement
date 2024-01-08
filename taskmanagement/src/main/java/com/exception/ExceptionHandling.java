package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.MethodNotAllowedException;

@ControllerAdvice
public class ExceptionHandling {

	@ExceptionHandler(value = IllegalArgumentException.class)
	public @ResponseBody ResponseEntity<Object> handleException(IllegalArgumentException ex) {
		return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = MethodNotAllowedException.class)
	public @ResponseBody ResponseEntity<Object> handleException(MethodNotAllowedException ex) {
		return new ResponseEntity<Object>(HttpStatus.METHOD_NOT_ALLOWED, HttpStatus.METHOD_NOT_ALLOWED);
	}
}
