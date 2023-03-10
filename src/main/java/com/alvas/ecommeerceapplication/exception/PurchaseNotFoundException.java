package com.alvas.ecommeerceapplication.exception;

public class PurchaseNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public PurchaseNotFoundException(String message) {
		super(message);
	}
	public PurchaseNotFoundException() {
	 	super("No purchases found on requested page");

	}

}
