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
public class FriendBookPostRequest implements Serializable{
	
	private static final long serialVersionUID = 8004847044081658785L;
	FriendBookPostDTO friendBookPost;
	public FriendBookPostDTO getFriendBookPost() {
		return friendBookPost;
	}
	public void setFriendBookPost(FriendBookPostDTO friendBookPost) {
		this.friendBookPost = friendBookPost;
	}
	
}
