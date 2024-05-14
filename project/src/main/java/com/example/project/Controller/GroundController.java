package com.example.project.Controller;

import com.example.project.entity.Ground;
import com.example.project.pojo.GroundPojo;
import com.example.project.service.GroundService;
import com.example.project.sharedpojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ground")
@RequiredArgsConstructor

public class GroundController {

    private final GroundService groundService;

    @GetMapping
    public GlobalApiResponse<List<Ground>> getData() {
        return GlobalApiResponse.
                <List<Ground>>builder()
                .data(this.groundService.getAll())
                .statusCode(200)
                .message("data retreived successfully")
                .build();
    }

    @PostMapping
    public GlobalApiResponse<String> save(@RequestBody GroundPojo groundPojo) {
        this.groundService.saveData(groundPojo);
        return GlobalApiResponse.
                <String>builder()
                .data("saved")
                .statusCode(200)
                .message("data saved successfully")
                .build();
    }



    @PutMapping
    public GlobalApiResponse <Ground> update(@RequestBody GroundPojo groundPojo) {
        Ground updateGround = this.groundService.saveData(groundPojo);
        return  GlobalApiResponse.<Ground>builder()
                .data(updateGround)
                .statusCode(200)
                .message("Data Updated sucessfully")
                .build();
    }

    @DeleteMapping("delete/{id}")
    public GlobalApiResponse<String> delete(@PathVariable int id) {
        this.groundService.deleteById(id);
        return GlobalApiResponse.<String>builder()
                .data("Ground entity with  ID " + id + "delete successfully")
                .statusCode(200)
                .message("data delete successfully")
                .build() ;

    }


}