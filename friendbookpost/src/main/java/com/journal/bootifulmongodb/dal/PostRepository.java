package com.journal.bootifulmongodb.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.journal.bootifulmongodb.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
