package erik_bookstore.demo.services;

import erik_bookstore.demo.models.Loan;
import erik_bookstore.demo.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    @Autowired
    LoanRepository loanRepository;

    public Loan createLoan (Loan loan) {
        return loanRepository.save(loan);
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
