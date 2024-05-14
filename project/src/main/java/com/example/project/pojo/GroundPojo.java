package com.example.project.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor


public class GroundPojo {
    private Integer id;

    //    @NotNull(message="Ground name is required field")
    private String groundName ;
}