package erik_bookstore.demo.services;

import erik_bookstore.demo.models.Book;
import erik_bookstore.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
    public Optional<Book> findBookById(String id) {
        return bookRepository.findById(id);
    }
    public String deleteBook(String id) {
        bookRepository.deleteById(id);
        return "Book '" + id + "' has been deleted.";
    }
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }



}
