package erik_bookstore.demo.controllers;

import erik_bookstore.demo.models.Book;
import erik_bookstore.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    BookService bookService;

    // POST create new book
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }




}
