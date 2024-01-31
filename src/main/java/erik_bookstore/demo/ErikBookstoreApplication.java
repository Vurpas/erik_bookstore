package erik_bookstore.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class ErikBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErikBookstoreApplication.class, args);
	}

}
