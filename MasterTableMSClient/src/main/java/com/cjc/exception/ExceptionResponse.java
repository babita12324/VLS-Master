package com.cjc.exception;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {
	
	private String msg;
	
    private String requestUri;
	
	private HttpStatus httpStatus;
	
	
	
	public ExceptionResponse() {
		super();
	}



	public ExceptionResponse(String msg, String requestUri, HttpStatus httpStatus) {
		super();
		this.msg = msg;
		this.requestUri = requestUri;
		this.httpStatus = httpStatus;
	}



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public String getRequestUri() {
		return requestUri;
	}



	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}



	public HttpStatus getHttpStatus() {
		return httpStatus;
	}



	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}



	@Override
	public String toString() {
		return "ExceptionResponse [msg=" + msg + ", requestUri=" + requestUri + ", httpStatus=" + httpStatus + "]";
	}
	
	
	
	

}
