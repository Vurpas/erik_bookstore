package erik_bookstore.demo.services;

import erik_bookstore.demo.DTO.LoanDTO;
import erik_bookstore.demo.models.Book;
import erik_bookstore.demo.models.Loan;
import erik_bookstore.demo.models.User;
import erik_bookstore.demo.repository.BookRepository;
import erik_bookstore.demo.repository.LoanRepository;
import erik_bookstore.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    @Autowired
    LoanRepository loanRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    BookRepository bookRepository;


    public Loan createLoan(LoanDTO loanDTO) {
        User user = userRepository.findById(loanDTO.getLoanedByUserId())
                    .orElseThrow(() -> new RuntimeException("User not found."));
        Book book = bookRepository.findById(loanDTO.getBook_id())
                    .orElseThrow(() -> new RuntimeException("User not found."));
        Loan newLoan = new Loan(book, user);
        return loanRepository.save(newLoan);

    }
    public List<Loan> findAll() {
        return loanRepository.findAll();
    }
    public Optional<Loan> findLoanById(String id) {
        return loanRepository.findById(id);
    }
    public void deleteById(String id) {
        loanRepository.deleteById(id);
    }
    public Loan updateLoan(Loan loan) {

        return loanRepository.save(loan);
    }
}
