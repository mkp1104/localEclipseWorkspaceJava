package com.mkp.designPattern.client;

import com.mkp.designPattern.dao.BookDao;
import com.mkp.designPattern.daoimpl.BookDaoImpl;
import com.mkp.designPattern.model.Books;

public class AccessBook {

    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();

        for (Books book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn());
            System.out.println("Book Name : " + book.getBookName());
        }

        //update student
        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);
        
        for (Books bookUpdated : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + bookUpdated.getIsbn());
            System.out.println("Book Name : " + bookUpdated.getBookName());
        }
    }
    
}