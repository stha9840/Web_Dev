package com.example.project.service;

import com.example.project.entity.Role;
import com.example.project.pojo.RolePojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleService {

    Role saveData(RolePojo rolePojo) ;
    List<Role> findAll();
    Role findById(Integer id);
    void deleteById(Integer id);


}
