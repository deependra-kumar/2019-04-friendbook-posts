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
public class FriendBookPostDTO implements Serializable{
	
	private static final long serialVersionUID = 8004847044081658785L;
	Integer id;
	String postMsg;
	String status;
	String userid;
	Date lastupdated;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPostMsg() {
		return postMsg;
	}
	public void setPostMsg(String postMsg) {
		this.postMsg = postMsg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}
	
	
}
