package com.example.project.service.impl;

import com.example.project.entity.Ground;
import com.example.project.pojo.GroundPojo;
import com.example.project.repository.GroundRepository;
import com.example.project.service.GroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Service




public class GroundServiceImpl implements GroundService {
    private final GroundRepository groundRespository;
    @Override
    public Ground saveData(GroundPojo groundPojo){
        Ground ground = new Ground();
        ground.setId(groundPojo.getId());
        ground.setGroundName(groundPojo.getGroundName());
        groundRespository.save(ground);
        return ground;
    }
    public List<Ground> getAll(){
        return groundRespository.findAll();
    }

    @Override
    public void deleteById(int id) {
        groundRespository.deleteById(id);


    }

    @Override
    public Optional<Ground> findById(int id) {
        return Optional.empty();
    }




}