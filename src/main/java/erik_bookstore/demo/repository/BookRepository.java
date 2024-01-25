package erik_bookstore.demo.repository;

import erik_bookstore.demo.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
