package com.journal.bootifulmongodb.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.journal.bootifulmongodb.dal.IPost;
import com.journal.bootifulmongodb.dal.PostRepository;
import com.journal.bootifulmongodb.model.Post;

@RestController
@RequestMapping(value = "/")
public class PostController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final PostRepository postRepository;

	private final IPost userDAL;

	public PostController(PostRepository userRepository, IPost userDAL) {
		this.postRepository = userRepository;
		this.userDAL = userDAL;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Post> getAllUsers() {
		LOG.info("Getting all posts");
		return postRepository.findAll();
	}
	
	@RequestMapping(value = "/{userMailId}", method = RequestMethod.GET)
	public Optional<Post> getUser(@PathVariable("userMailId") String userMailId) {
		LOG.info("Getting user with ID: {}.", userMailId);
		return postRepository.findById(userMailId);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Post addNewUsers(@RequestBody Post user) {
		LOG.info("Saving post");
		return postRepository.save(user);
	}
}