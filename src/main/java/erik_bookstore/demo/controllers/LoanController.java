package erik_bookstore.demo.controllers;

import erik_bookstore.demo.DTO.LoanDTO;
import erik_bookstore.demo.models.Loan;
import erik_bookstore.demo.repository.BookRepository;
import erik_bookstore.demo.repository.UserRepository;
import erik_bookstore.demo.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/loans")
public class LoanController {
    @Autowired
    LoanService loanService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    BookRepository bookRepository;

    // POST create loan - UPDATED with function to check if id's exists
    @PostMapping
    public ResponseEntity<Loan> createLoan(@RequestBody LoanDTO loanDTO) {
        if (userRepository.existsById((loanDTO.getLoanedByUserId()))
                && bookRepository.existsById((loanDTO.getBook_id()))) {
            Loan loan = loanService.createLoan(loanDTO);
            return new ResponseEntity<>(loan, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    // GET list of all loans
    @GetMapping
    public List<Loan> allUsers() {
        return loanService.findAll();
    }
    // GET loan by ID
    @GetMapping("/{id}")
    public Optional<Loan> findLoanById(@PathVariable String id) {
        return loanService.findLoanById(id);
    }
    // DELETE loan by ID
    @DeleteMapping("/{id}")
    public String deleteLoan(@PathVariable String id) {
        loanService.deleteById(id);

        return "Loan deleted.";
    }
    // PUT update loan by ID
    @PutMapping
    public Loan updateLoan(@RequestBody Loan loan) {
        return loanService.updateLoan(loan);
    }

}
