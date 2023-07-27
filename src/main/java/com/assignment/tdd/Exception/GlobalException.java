package com.assignment.tdd.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ExceptionClass.class)
	public String ResourseNotFoundException(ExceptionClass ec) {// Exception Class for Error Msg
		
		return ec.getMessage();
	}

}
