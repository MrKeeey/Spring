package com.hstn.crud_empl.rest;

import com.hstn.crud_empl.dao.EmployeeDAO;
import com.hstn.crud_empl.entity.Employee;
import com.hstn.crud_empl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    //work without @Autowired if only 1 constructor
    //if constructors > 1 need to use @Autowired
    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
