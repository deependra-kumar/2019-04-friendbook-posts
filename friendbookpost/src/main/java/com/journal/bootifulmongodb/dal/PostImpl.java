package com.journal.bootifulmongodb.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.journal.bootifulmongodb.model.Post;

@Repository
public class PostImpl implements IPost {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Post addNewUser(Post post) {
		mongoTemplate.save(post);
		// Now, user object will contain the ID as well
		return post;
	}
	
	@Override
	public List<Post> getAllPosts()
	{
		return mongoTemplate.findAll(Post.class);
	}
	
	@Override
	public Post getPost(String userMailId)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("userMailId").is(userMailId));
		return mongoTemplate.findById(userMailId, Post.class);
		//return mongoTemplate.findOne(query, Post.class);
	}
}
