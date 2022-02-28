package nvc.it.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.employee.model.Employee;
import nvc.it.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee>findAll(){
        return employeeRepository.findAll();
    }

    public Employee getById(int id){
        return employeeRepository.getById(id);
    }

    public List<Employee>findByName(String name){
        return employeeRepository.findByNameContaining(name);
    }

    public List<Employee>findBySalary(int salary){
        return employeeRepository.findBySalaryLessThanEqual(salary);
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public void delete(Employee employee){
        employeeRepository.delete(employee);
    }
}
