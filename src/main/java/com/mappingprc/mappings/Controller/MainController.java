package com.mappingprc.mappings.Controller;

import com.mappingprc.mappings.Entity.Employee;
import com.mappingprc.mappings.Entity.Project;
import com.mappingprc.mappings.Repo.EmployeeRepo;
import com.mappingprc.mappings.Repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private ProjectRepo projectRepo;

    @GetMapping("/")
    public String home(){
        return "Home!";
    }
    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody Employee employee){
        System.out.println(employee.toString());
        return employeeRepo.save(employee);
    }
    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }


    @PostMapping("/addproject")
    public Project addProject(@RequestBody Project project){
        return projectRepo.save(project);
    }
    @GetMapping("/getAllProject")
    public List<Project> getAllProject(){
        return projectRepo.findAll();
    }
}
