package com.net.rest.frienbookpost.exception;

public class FriendBookPostServiceException extends FriendBookPostException {

	private static final long serialVersionUID = 1L;

	public FriendBookPostServiceException() {
		super();
	}

	/**
	 * @param errorCode
	 * @param message
	 */
	public FriendBookPostServiceException(int errorCode, String message) {
		super(errorCode, message);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public FriendBookPostServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public FriendBookPostServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public FriendBookPostServiceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public FriendBookPostServiceException(Throwable cause) {
		super(cause);
	}

}
