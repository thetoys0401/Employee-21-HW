package nvc.it.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    List<Employee> findByNameContaining(String name);

    List<Employee> findBySalaryLessThanEqual(int salary);
}
