package com.jaoangeloni.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jaoangeloni.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
