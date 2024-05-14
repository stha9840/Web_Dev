package com.example.project.sharedpojo;



import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GlobalApiResponse<T>{
    private String message;
    private Integer statusCode ;
    private T data ;
}