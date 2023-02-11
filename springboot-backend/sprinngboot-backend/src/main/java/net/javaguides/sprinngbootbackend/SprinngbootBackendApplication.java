package net.javaguides.sprinngbootbackend;

import net.javaguides.sprinngbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprinngbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SprinngbootBackendApplication.class, args);

		@Autowired
		private EmployeeRepository employeeRepository;
	}

}
