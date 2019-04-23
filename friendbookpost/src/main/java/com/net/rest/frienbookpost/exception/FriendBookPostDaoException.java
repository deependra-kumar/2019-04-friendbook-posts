package com.net.rest.frienbookpost.exception;

public class FriendBookPostDaoException extends FriendBookPostException {

	private static final long serialVersionUID = 1L;

	public FriendBookPostDaoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param errorCode
	 * @param message
	 */
	public FriendBookPostDaoException(int errorCode, String message) {
		super(errorCode, message);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public FriendBookPostDaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	/**
	 * @param message
	 * @param cause
	 */
	public FriendBookPostDaoException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * @param message
	 */
	public FriendBookPostDaoException(String message) {
		super(message);
		
	}

	/**
	 * @param cause
	 */
	public FriendBookPostDaoException(Throwable cause) {
		super(cause);
		
	}
}
