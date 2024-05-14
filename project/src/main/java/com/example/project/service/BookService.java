package com.example.project.service;



import com.example.project.entity.Book;
import com.example.project.pojo.BookPojo;
import com.example.project.projection.BookProjection;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookService {
    Book saveData(BookPojo bookpojo);
//    List<Book> findAll() ;
    List<BookProjection> findAll() ;

    void deleteAll(BookPojo bookPojo) ;

}