package com.github.futbol.exceptions.custom;

public class ConflictException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String DESCRIPTION = "Conflict Exception (409)";

	/**
	 * 
	 * @param detail
	 */
	public ConflictException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

}
