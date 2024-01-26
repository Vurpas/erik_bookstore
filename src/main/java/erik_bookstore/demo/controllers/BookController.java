package erik_bookstore.demo.controllers;

import erik_bookstore.demo.models.Book;
import erik_bookstore.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public List<Book> allBooks() {
        return bookService.findAll();
    }




}
