package com.net.rest.frienbookpost.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.net.rest.frienbookpost.dto.FriendBookPostDTO;
import com.net.rest.frienbookpost.dto.FriendBookPostRequest;
import com.net.rest.frienbookpost.dto.FriendBookPostResponse;
import com.net.rest.frienbookpost.exception.FriendBookPostException;
import com.net.rest.frienbookpost.service.FriendBookPostService;


/**
 * FriendBookPostController is a main controller implementation class. It has all the business logic
 * of friendbook post service.
 * 
 * @author Deependra Kumar
 * @since 23/04/2019
 * @category Controller
 * @version 1.0
 */

@Controller
public class FriendBookPostController {
	
	private static final Logger logger = Logger.getLogger(FriendBookPostController.class);
	@RequestMapping(value = "/cid/createFriendBookPost", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public FriendBookPostResponse createFriendBookPost(@RequestBody FriendBookPostRequest request) {
		logger.info("Inside createFriendBookPost.");
		logger.info(request.toString());
		FriendBookPostResponse response= new FriendBookPostResponse();
		FriendBookPostService postService = new FriendBookPostService();
		try{
			response.setFriendBookPost(postService.createFriendBookPost(request.getFriendBookPost()));
			response.setStatusMsg("Friend book post has been created successfully");
		}
		catch(FriendBookPostException e){
			logger.error("Exception details as below" , e);
			response.setStatusMsg("Error while creating friend book post");
		}
		return response;
	}
	@RequestMapping(value = "/cid/createFriendBookPost", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public FriendBookPostResponse updateFriendBookPost(@RequestBody FriendBookPostRequest request) {
		logger.info("Inside createFriendBookPost.");
		logger.info(request.toString());
		FriendBookPostResponse response= new FriendBookPostResponse();
		FriendBookPostService postService = new FriendBookPostService();
		try{
			response.setFriendBookPost(postService.updateFriendBookPost(request.getFriendBookPost()));
			response.setStatusMsg("Friend book post has been updated successfully");
		}
		catch(FriendBookPostException e){
			logger.error("Exception details as below" , e);
			response.setStatusMsg("Error while updating friend book post");
		}
		return response;
	}
	
	
	
	
}