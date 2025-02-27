package com.instantask.service.repository;

import com.instantask.service.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByName(String name);
    List<User> findByEmail(String email);
    List<User> findByNameIgnoreCase(String name);
}

