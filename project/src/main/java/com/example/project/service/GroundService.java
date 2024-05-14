package com.example.project.service;


import com.example.project.entity.Ground;
import com.example.project.pojo.GroundPojo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface GroundService {
    Ground saveData(GroundPojo groundPojo);

    List<Ground> getAll();
    void deleteById(int id);
    Optional<Ground> findById(int id);
}