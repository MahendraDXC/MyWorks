package com.mgBusiness.beans;

public class ChildWishBean3 {
	private String name;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String wishing() {
		return "Hello "+name+", "+message;
	}
}
