package erik_bookstore.demo.repository;

import erik_bookstore.demo.models.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanRepository extends MongoRepository<Loan, String> {
}
