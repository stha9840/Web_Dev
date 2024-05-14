package com.example.project.service.impl;

import com.example.project.entity.Book;
import com.example.project.entity.Ground;
import com.example.project.entity.User;
import com.example.project.pojo.BookPojo;
import com.example.project.projection.BookProjection;
import com.example.project.repository.BookRepository;
import com.example.project.repository.GroundRepository;
import com.example.project.repository.UserRepository;
import com.example.project.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRespository;
    private final GroundRepository groundRespository;
    private final UserRepository userRespository;


    @Override
    public Book saveData(BookPojo bookPojo) {
        Book book = new Book();
//        book.setId(bookPojo.getId()) ;
//        book.setGroundId(bookPojo.getId()) ;
        book.setName(bookPojo.getBookName());
        Ground ground = groundRespository.findById(bookPojo.getGroundId()).get();
        book.setGround(ground);

        User user = userRespository.findById(bookPojo.getUserId()).get();
        book.setUser(user);
        bookRespository.save(book);


        return book;
    }

    @Override
    public List<BookProjection> findAll() {
        return List.of();
    }



    @Override
    public void deleteAll(BookPojo bookPojo) {

    }
}