package com.example.bills.controller;

import com.example.bills.model.Book;
import com.example.bills.model.User;
import com.example.bills.service.BookService;
import com.example.bills.service.HostHolder;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: 李清依
 * @Date: 2019/11/9 17:03
 * @Description:
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private HostHolder hostHolder;

    @RequestMapping(path = {"/index"}, method = {RequestMethod.GET})
    public String booklist(Model model){
        User host=hostHolder.getUser();
        if (host!=null){
            model.addAttribute("host",host);
        }
        loadAllBooksView(model);
        return "book/books";
    }
    private void loadAllBooksView(Model model){
        model.addAttribute("books",bookService.getAllBooks());
    }
    @RequestMapping(path = {"/books/add"}, method = {RequestMethod.GET})
    public String addBook(){
        return "book/addBook";
    }
    @RequestMapping(path = {"/books/add/do"}, method = {RequestMethod.POST})
    public String doAddBook(
            Model model,
            @RequestParam("name") String name,
            @RequestParam("author") String author,
            @RequestParam("price") String price
    ){
        Book book = new Book();
        book.setName(name);
        book.setAuthor(author);
        book.setPrice(price);
        bookService.addBooks(book);
        return "redirect:/index";
    }
    @RequestMapping(path = {"/books/{bookId:[0-9]+/delete}"},method = RequestMethod.GET)
    public String deleteBook(@PathVariable("bookId") int bookId){
        bookService.deleteBooks(bookId);
        return "redirect:/index";
    }
    @RequestMapping(path = {"/books/{bookId:[0-9]+/recover"},method = RequestMethod.GET)
    public String recoverBook(
            @PathVariable("bookId") int bookId
    ) {

        bookService.recoverBooks(bookId);
        return "redirect:/index";

    }
}
