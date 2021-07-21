package com.example.rest.basics.Restfulwebservices.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

@Autowired
   private BookDAOService bookDAOService;
  @GetMapping(value="/allBooks")
    public List<Book> getAllBooks() {
    return bookDAOService.getallBooks();
}
   @PostMapping(value="/addBook")
   public String addBooks(@RequestBody Book book1){
    return bookDAOService.addBook(book1);
    }
    @DeleteMapping(value="/deleteBook/{id}")
    public String deleteById(@PathVariable int id){
            return bookDAOService.deleteBook(id);
     }
    @GetMapping(value="/getCat/{catagory}")
    public List<Book> getBookByCatagory(@PathVariable String catagory){
        return bookDAOService.getByCat(catagory);
    }
    @GetMapping(value="/getAuthor/{author}")
    public List<Book> getBookByCat(@PathVariable String author) {
        return bookDAOService.getByAutho(author);
    }
     @PutMapping(value="update/{id}")
    public Book updateBook(@PathVariable int id,@RequestBody Book book){
    return this.bookDAOService.updateBook(id,book);
    }

}
