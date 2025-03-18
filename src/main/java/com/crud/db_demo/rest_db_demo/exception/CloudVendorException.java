package com.crud.db_demo.rest_db_demo.exception;

import org.springframework.http.HttpStatus;

public class CloudVendorException 
{
	private String message;
	private Throwable throwable = null;
	private HttpStatus httpStatus = null;
	
	public CloudVendorException(String message, Throwable throwable, HttpStatus httpStatus) 
	{
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
	}

	public String getMessage() 
	{
		return message;
	}

	public Throwable getThrowable() 
	{
		return throwable;
	}

	public HttpStatus getHttpStatus() 
	{
		return httpStatus;
	}
	
	
}
