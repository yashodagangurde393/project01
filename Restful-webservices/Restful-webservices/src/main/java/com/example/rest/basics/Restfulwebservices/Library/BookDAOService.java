package com.example.rest.basics.Restfulwebservices.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BookDAOService {
    @Autowired
    private BookRepository bookRepository;
    //fetch,add,new,update,getone

    public List<Book> getallBooks(){
        return this.bookRepository.findAll();
    }
    public String addBook(Book book){
     this.bookRepository.save(book);
     return "Added Successfully";
    }
    public String deleteBook(int bookid){
        this.bookRepository.deleteById(bookid);
        return "Deleted Successfully";
    }
    public List<Book> getByCat(String Catagory){
        return this.bookRepository.findByBookCatagory(Catagory);

        }
    public List<Book> getByAutho(String autho){
        return this.bookRepository.findByBookAuthor(autho);

    }
    public Book updateBook(int id,Book book) {
        if (this.bookRepository.findById(id).isPresent()) {
//            book = this.bookRepository.findById(id).get();
//            System.out.println("BOOK="+book.bookId+"price"+book.getBookPrice());
            bookRepository.save(book);
            return book;
        } else {
            return null;
        }


    }


}
