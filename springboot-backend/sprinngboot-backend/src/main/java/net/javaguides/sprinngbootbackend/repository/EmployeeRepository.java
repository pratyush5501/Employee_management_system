package net.javaguides.sprinngbootbackend.repository;
import net.javaguides.sprinngbootbackend.model.Employee;
import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee , Long> {
// All CRUD DATABASES METHODS
}
