package com.mkp.designPattern.dao;

import java.util.List;

import com.mkp.designPattern.model.Books;

public interface BookDao {

    List<Books> getAllBooks();
    Books getBookByIsbn(int isbn);
    void saveBook(Books book);
    void deleteBook(Books book);
}