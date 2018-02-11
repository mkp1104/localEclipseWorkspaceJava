package com.mkp.designPattern.dao;


public interface BookDao {

    List<Books> getAllBooks();
    Books getBookByIsbn(int isbn);
    void saveBook(Books book);
    void deleteBook(Books book);
}