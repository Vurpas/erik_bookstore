package erik_bookstore.demo.controllers;

import erik_bookstore.demo.models.Loan;
import erik_bookstore.demo.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/loans")
public class LoanController {
    @Autowired
    LoanService loanService;

    // POST create loan
    @PostMapping
    public Loan createLoan(@RequestBody Loan loan) {

        return loanService.createLoan(loan);
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
