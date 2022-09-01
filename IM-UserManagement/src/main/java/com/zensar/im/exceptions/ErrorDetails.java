package com.zensar.im.exceptions;

import java.util.*;

public class ErrorDetails {

	
	private Date date;
	private String details;
	private String cause;
	
	
	public ErrorDetails(Date date, String details, String cause) {
		
		this.date = date;
		this.details = details;
		this.cause = cause;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	
	
}
