package com.example.project.service;

import com.example.project.entity.Ground;
import com.example.project.entity.User;
import com.example.project.pojo.UserPojo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UserService {
    User saveUser(UserPojo userPojo) ;
    List<User> getAll() ;

    void deleteById(int id);
    Optional<Ground> findById(int id);
}