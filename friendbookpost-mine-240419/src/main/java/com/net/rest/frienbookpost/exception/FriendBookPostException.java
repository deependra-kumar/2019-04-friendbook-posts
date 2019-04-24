package com.net.rest.frienbookpost.exception;

public class FriendBookPostException extends Throwable {
	private static final long serialVersionUID = 1L;
	int errorCode;
	String message;
	
	
	/**
	 * @param errorCode
	 * @param message
	 */
	public FriendBookPostException(int errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}
	/**
	 * Default constructor
	 */
	public FriendBookPostException() {
		super();
		
	}
	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public FriendBookPostException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.message=message;
	}
	/**
	 * @param message
	 * @param cause
	 */
	public FriendBookPostException(String message, Throwable cause) {
		super(message, cause);
		this.message=message;
	}
	/**
	 * @param message
	 */
	public FriendBookPostException(String message) {
		super(message);
		this.message=message;
	}
	/**
	 * @param cause
	 */
	public FriendBookPostException(Throwable cause) {
		super(cause);
		
	}
	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage(){
		//TOGenerate log message
	}
}
