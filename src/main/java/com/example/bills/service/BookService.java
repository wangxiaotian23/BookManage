package com.example.bills.service;

import com.example.bills.dao.BookDao;
import com.example.bills.model.Book;
import com.example.bills.model.enums.BookStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 李清依
 * @Date: 2019/11/9 16:58
 * @Description:
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookDAO;

    public List<Book> getAllBooks() {
        return bookDAO.selectAll();
    }

    public int addBooks(Book book) {
        return bookDAO.addBook(book);
    }

    public void deleteBooks(int id) {
        bookDAO.updateBookStatus(id, BookStatusEnum.DELETE.getValue());
    }

    public void recoverBooks(int id) {
        bookDAO.updateBookStatus(id, BookStatusEnum.NORMAL.getValue());
    }
}
