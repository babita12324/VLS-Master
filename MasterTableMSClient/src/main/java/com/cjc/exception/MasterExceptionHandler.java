package com.cjc.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class MasterExceptionHandler {
	
	@ExceptionHandler({CountryIdNotFound.class})
	public ExceptionResponse IdNotFound(CountryIdNotFound c,HttpServletRequest r) 
	{
		ExceptionResponse e=new ExceptionResponse(c.getMessage(),r.getRequestURI(),HttpStatus.NOT_FOUND);
		return e;
		
		
	}

}
