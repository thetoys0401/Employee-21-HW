package nvc.it.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.employee.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    
}
