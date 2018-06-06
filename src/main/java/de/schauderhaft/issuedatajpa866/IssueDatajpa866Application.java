package de.schauderhaft.issuedatajpa866;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class IssueDatajpa866Application {

	public static void main(String[] args) {
		SpringApplication.run(IssueDatajpa866Application.class, args);
	}
}
