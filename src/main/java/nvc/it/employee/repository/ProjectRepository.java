package nvc.it.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.employee.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
    
}
