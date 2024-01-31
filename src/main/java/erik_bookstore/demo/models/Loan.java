package erik_bookstore.demo.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Document(collection = "loans")
public class Loan {
    @Id
    private String id;
    private String book_id;
    private String loanedByUserId;
    @CreatedDate
    private Date date_of_loan;
    private LocalDate return_date = LocalDate.now().plusDays(14);

    public Loan () {
    }
    public String getId() {
        return id;
    }
    public String getLoanedByUserId() {
        return loanedByUserId;
    }
    public Date getDate_of_loan() {
        return date_of_loan;
    }
    public LocalDate getReturn_Date() {
        return return_date;
    }
    public String getBook_id() {
        return book_id;
    }

    public void setReturn_date(LocalDate return_date) {
        this.return_date = return_date;
    }
}
