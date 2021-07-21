package com.example.rest.basics.Restfulwebservices.Library;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue
    int bookId;
    String bookName;
    String bookAuthor;
    long bookPrice;
    String bookCatagory;
    public Book()
    {

    }
    public Book(String bookname, String bookAuthor, long bookprice, String bookcatagory) {
        this.bookName = bookname;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookprice;
        this.bookCatagory = bookcatagory;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public long getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(long bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookCatagory() {
        return bookCatagory;
    }

    public void setBookCatagory(String bookCatagory) {
        this.bookCatagory = bookCatagory;
    }
}


