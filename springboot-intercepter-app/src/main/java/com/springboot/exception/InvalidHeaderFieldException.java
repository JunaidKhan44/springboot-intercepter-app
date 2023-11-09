/**
 * 
 */
package com.springboot.exception;

/**
 * @author Junaid.Khan
 *
 */
public class InvalidHeaderFieldException extends  RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	public InvalidHeaderFieldException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
