package com.example.project.Controller;

import com.example.project.entity.User;
import com.example.project.pojo.UserPojo;
import com.example.project.service.UserService;
import com.example.project.sharedpojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public GlobalApiResponse<String> save(@RequestBody UserPojo userPojo) {
        this.userService.saveUser(userPojo);
        return GlobalApiResponse.
                <String>builder()
                .data("saved")
                .statusCode(200)
                .message("data saved successfully")
                .build();
    }

    @GetMapping
    public GlobalApiResponse<List<User>> getUser() {
        return GlobalApiResponse.
                <List<User>>builder()
                .data(this.userService.getAll())
                .statusCode(200)
                .message("Data retreived successfully")
                .build();





    }

    @PutMapping
    public GlobalApiResponse<User> update(@RequestBody UserPojo userPojo) {
        User updateUser = this.userService.saveUser(userPojo);
        return  GlobalApiResponse.<User>builder()
                .data(updateUser)
                .statusCode(200)
                . message("data update successfully")
                .build() ;

    }

    @DeleteMapping("delete/{id}")
    public GlobalApiResponse<String> delete(@PathVariable int id) {

        this.userService.deleteById(id);
        return GlobalApiResponse.<String>builder().
                data("User entry with id "  + id  + "has be deleted")
                .statusCode(200)
                .message("data delete succesfuuly")
                .build() ;


    }

}