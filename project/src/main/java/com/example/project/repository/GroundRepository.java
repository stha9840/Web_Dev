package com.example.project.repository;


import com.example.project.entity.Ground;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface GroundRepository extends JpaRepository<Ground,Integer> {
//    List<Ground> findByGroundNameContaining(String groundName);
}