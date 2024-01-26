package erik_bookstore.demo.services;

import erik_bookstore.demo.models.Book;
import erik_bookstore.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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



}
