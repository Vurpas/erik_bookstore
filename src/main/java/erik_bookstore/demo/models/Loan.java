package erik_bookstore.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "loans")
public class Loan {
    @Id
    private String id;
    private String book_id;
    private String loanedByUserId;

    private LocalDate date_of_loan = LocalDate.now();

    private LocalDate returnBy = LocalDate.now().plusDays(10);

    public Loan () {
    }
    public String getId() {
        return id;
    }
    public String getLoanedByUserId() {
        return loanedByUserId;
    }
    public LocalDate getDate_of_loan() {
        return date_of_loan;
    }
    public LocalDate getReturnBy() {
        return returnBy;
    }
    public String getBook_id() {
        return book_id;
    }


    public void setDate_of_loan(LocalDate date_of_loan) {
        this.date_of_loan = date_of_loan;
    }

    public void setReturnBy(LocalDate return_date) {
        this.returnBy = return_date;
    }
}
