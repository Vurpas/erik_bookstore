package erik_bookstore.demo.controllers;

import erik_bookstore.demo.models.Book;
import erik_bookstore.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    // GET list of all books
    @GetMapping
    public List<Book> allBooks() {
        return bookService.findAll();
    }
    // GET book by ID
    @GetMapping("/{id}")
    public Optional<Book> findBookById(@PathVariable String id) {
        return bookService.findBookById(id);
    }
    // DELETE post by id
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable String id) {
        return bookService.deleteBook(id);
    }




}
