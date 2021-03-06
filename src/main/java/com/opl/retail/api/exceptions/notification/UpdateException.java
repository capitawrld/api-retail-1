package com.opl.retail.api.exceptions.notification;
/**
 * @author Sanket
 *
 */
public class UpdateException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UpdateException() {
	}

	public UpdateException(String message) {
		super(message);
	}

	public UpdateException(Throwable cause) {
		super(cause);
	}

	public UpdateException(String message, Throwable cause) {
		super(message, cause);
	}

	public UpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
