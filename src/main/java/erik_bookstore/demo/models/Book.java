package erik_bookstore.demo.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private String book_title;
    private String author;
    @CreatedDate
    private Date created_at;

    public Book() {
    }

    public String getId() {
        return id;
    }

    public String getBook_title() {
        return book_title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getCreated_at() {
        return created_at;
    }
}
