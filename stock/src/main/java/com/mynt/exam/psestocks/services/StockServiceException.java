package com.mynt.exam.psestocks.services;

/**
 * Exception to be thrown when a stock service error occurs.
 */
public class StockServiceException extends RuntimeException {

	private static final long serialVersionUID = -6920188923415491913L;

	public StockServiceException(String message) {
		super(message);
	}

}
