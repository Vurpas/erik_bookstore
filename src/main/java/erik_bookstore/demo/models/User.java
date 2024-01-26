package erik_bookstore.demo.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String userName;
    @CreatedDate
    private Date created_at;

    public User() {
    }
    public String getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public Date getCreated_at() {
        return created_at;
    }
}
