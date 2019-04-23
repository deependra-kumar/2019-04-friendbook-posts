package com.net.rest.frienbookpost.dto;

import java.io.Serializable;
import java.util.Date;
/**
 * FriendBookDTO class is responsible for handling all
 * information about Friend Book Post.
 * 
 * @author Deependra Kumar
 * @since 23/04/2019
 * @category DTO
 * @version 1.0
 */
public class FriendBookPostResponse implements Serializable{
	
	private static final long serialVersionUID = 8004847044081658785L;
	FriendBookPostDTO friendBookPost;
	int errorCode;
	String statusMsg;
	public FriendBookPostDTO getFriendBookPost() {
		return friendBookPost;
	}
	public void setFriendBookPost(FriendBookPostDTO friendBookPost) {
		this.friendBookPost = friendBookPost;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getStatusMsg() {
		return statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	
	
}
