package com.journal.bootifulmongodb.dal;

import java.util.List;

import com.journal.bootifulmongodb.model.Post;

public interface IPost {
	Post addNewUser(Post user);

	List<Post> getAllPosts();
	
	Post getPost(String userMailId);
}