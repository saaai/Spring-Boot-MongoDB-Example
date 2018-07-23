package com.MongoDB.SpringBootMongoDBExample.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MongoDB.SpringBootMongoDBExample.document.Users;
import com.MongoDB.SpringBootMongoDBExample.repositories.UsersRepositories;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UsersRepositories usersRepositories;

    public UsersResource(UsersRepositories usersRepositories) {
        this.usersRepositories = usersRepositories;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return usersRepositories.findAll();
    }
}
