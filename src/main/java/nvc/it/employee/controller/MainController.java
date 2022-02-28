package nvc.it.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import nvc.it.employee.model.Department;
import nvc.it.employee.model.Project;
import nvc.it.employee.repository.DepartmentRepository;
import nvc.it.employee.repository.ProjectRepository;

@Controller
public class MainController {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    ProjectRepository projectRepository;
    
    @GetMapping("/")
    public String index () {
        return "index";
    }
       
    @GetMapping("/department/employee")
    public ModelAndView getDepartments(){
        List<Department> departments = departmentRepository.findAll();
        return new ModelAndView("department", "departments", departments);
    }
   
    @GetMapping("project/employee")
    public ModelAndView getprojects(){
        List<Project> projects = projectRepository.findAll();
        return new ModelAndView("project","projects",projects);
    }

}
