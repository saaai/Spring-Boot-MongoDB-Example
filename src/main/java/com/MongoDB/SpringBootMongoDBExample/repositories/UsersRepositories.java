package com.MongoDB.SpringBootMongoDBExample.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoDB.SpringBootMongoDBExample.document.Users;

//This is an interface and we are extending it to Mongo
public interface UsersRepositories extends MongoRepository<Users, Integer> {

	
	
	
	
}
