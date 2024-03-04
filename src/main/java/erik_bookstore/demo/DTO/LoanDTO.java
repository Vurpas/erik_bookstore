package erik_bookstore.demo.DTO;

public class LoanDTO {
    private String loanedByUserId;
    private String book_id;

    public String getLoanedByUserId() {
        return loanedByUserId;
    }

    public void setLoanedByUserId(String loanedByUserId) {
        this.loanedByUserId = loanedByUserId;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }
}
