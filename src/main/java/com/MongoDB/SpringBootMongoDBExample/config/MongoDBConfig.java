package com.MongoDB.SpringBootMongoDBExample.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.MongoDB.SpringBootMongoDBExample.document.Users;
import com.MongoDB.SpringBootMongoDBExample.repositories.UsersRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepositories.class)
@Configuration
public class MongoDBConfig {
	
	@Bean	//injecting UserRepositories
	CommandLineRunner commandLineRunner(UsersRepositories userRepositories) {
		return strings -> {
			userRepositories.save(new Users(1, "Peter", "Development", 3000L));
			userRepositories.save(new Users(2, "Sam", "Operations", 3000L));
			userRepositories.save(new Users(3, "Gopal", "Development", 3000L));
		};
		
		 }
	}

