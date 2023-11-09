/**
 * 
 */
package com.springboot.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springboot.exception.InvalidFieldException;
import com.springboot.exception.InvalidHeaderFieldException;

/**
 * @author Junaid.Khan
 *
 */

@RestControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler
	public String  handleInvalidFieldException(InvalidFieldException exception) {
		return exception.getMessage();
	}
	
	@ExceptionHandler
	public ResponseEntity<String>  handleInvalidFieldException(InvalidHeaderFieldException exception) {
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.PRECONDITION_FAILED);
	}
}
