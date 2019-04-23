package com.net.rest.frienbookpost.service;

import java.util.List;
import java.util.logging.Logger;

import com.net.rest.frienbookpost.dao.FriendBookPostDao;
import com.net.rest.frienbookpost.dto.FriendBookPostDTO;
import com.net.rest.frienbookpost.exception.FriendBookPostDaoException;
import com.net.rest.frienbookpost.exception.FriendBookPostServiceException;
import com.net.rest.frienbookpost.util.FriendBookPostConstants;

/**
 * FriendBookPostService is a Service class for Friend Book Post Business Logic.
 * 
 * @author Deependra Kumar
 * @since 23/04/2019
 * @category Service Class
 * @version 1.0
 */
public class FriendBookPostService {

	private static final Logger logger = Logger.getLogger("FriendBookPostService");
	private FriendBookPostDao friendBookPostDao = new FriendBookPostDao();
	public FriendBookPostDTO createFriendBookPost(FriendBookPostDTO request) throws FriendBookPostServiceException {
		FriendBookPostDTO response = null;
		logger.info("In saveFriendBookPost service for saving Friend Book Post " + request.getUserid());

		try {
			request.setStatus(FriendBookPostConstants.POST_STATUS_ACTIVE);
			response = friendBookPostDao.createFriendBookPost(request);

		} catch (FriendBookPostDaoException e) {
			throw new FriendBookPostServiceException("Saving Friend Book Post details failed with ", e);
		} finally {

		}

		return response;
	}
	public FriendBookPostDTO updateFriendBookPost(FriendBookPostDTO request) throws FriendBookPostServiceException {
		FriendBookPostDTO response = null;
		logger.info("In saveFriendBookPost service for saving Friend Book Post " + request.getUserid());

		try {
			
			request.setStatus(FriendBookPostConstants.POST_STATUS_ACTIVE);
			response = friendBookPostDao.updateFriendBookPost(request);

		} catch (FriendBookPostDaoException e) {
			throw new FriendBookPostServiceException("Saving Friend Book Post details failed with ", e);
		} finally {

		}

		return response;
	}
	


	public String deleteFriendBookPost(FriendBookPostDTO request) throws FriendBookPostServiceException {
		String response = null;
		logger.info("In deleteFriendBookPost service for saving Friend Book Post " + request.getId());

		try {
			response = friendBookPostDao.deleteFriendBookPost(request.getId());

		} catch (FriendBookPostDaoException e) {
			throw new FriendBookPostServiceException("Deleting Friend Book Post details failed with ", e);
		} finally {

		}

		return response;
	}
	public String shareFriendBookPost(FriendBookPostDTO request) throws FriendBookPostServiceException {
		String response = null;
		logger.info("In deleteFriendBookPost service for saving Friend Book Post " + request.getId());

		try {
			request.setStatus(FriendBookPostConstants.POST_STATUS_SHARED);
			response = friendBookPostDao.shareFriendBookPost(request);

		} catch (FriendBookPostDaoException e) {
			throw new FriendBookPostServiceException("Deleting Friend Book Post details failed with ", e);
		} finally {

		}

		return response;
	}
	public FriendBookPostDTO getFriendBookPost(Integer id) throws FriendBookPostServiceException {
		FriendBookPostDTO response = null;
		logger.info("In getFriendBookPost service for FriendBookPost " + id);

		try {

			response = friendBookPostDao.getFriendBookPost(id);

		} catch (FriendBookPostDaoException e) {
			throw new FriendBookPostServiceException("Retrieving Friend Book Post details failed with ", e);
		} finally {

		}

		return response;
	}
	public List<FriendBookPostDTO> getFriendBookPostList(FriendBookPostDTO request) throws FriendBookPostServiceException {
		List<FriendBookPostDTO> response = null;
		logger.info("In getFriendBookPost service for FriendBookPost user" + request.getUserid());

		try {

			response = friendBookPostDao.getFriendBookPostList(request);

		} catch (FriendBookPostDaoException e) {
			throw new FriendBookPostServiceException("Retrieving Friend Book Post details failed with ", e);
		} finally {

		}

		return response;
	}

	
}
