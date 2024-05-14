package com.example.project.service.impl;

import com.example.project.entity.Ground;
import com.example.project.entity.User;
import com.example.project.pojo.UserPojo;
import com.example.project.repository.UserRepository;
import com.example.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Repository
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRespository;

    @Override
    public User saveUser(UserPojo userPojo) {
        User user = new User() ;
        user.setName(userPojo.getUsername());
        user.setId(user.getId());

        userRespository.save(user) ;
        return user;
    }

    @Override
    public List<User> getAll() {
        return userRespository.findAll();
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Optional<Ground> findById(int id) {
        return Optional.empty();
    }
}