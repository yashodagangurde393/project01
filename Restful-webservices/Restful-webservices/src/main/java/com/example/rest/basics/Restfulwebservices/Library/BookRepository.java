package com.example.rest.basics.Restfulwebservices.Library;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

List<Book> findByBookCatagory(String bookcatagory);
    List<Book> findByBookAuthor(String bookAuthor);

}
