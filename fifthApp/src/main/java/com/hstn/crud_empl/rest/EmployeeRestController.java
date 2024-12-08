package com.hstn.crud_empl.rest;

import com.hstn.crud_empl.dao.EmployeeDAO;
import com.hstn.crud_empl.entity.Employee;
import com.hstn.crud_empl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findEmployeeById(employeeId);

        if (employee == null) {
            throw new RuntimeException("Employee with id: " + employeeId + " not found.");
        } else {
            return employee;
        }
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        return employeeService.save(employee);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable int employeeId) {
        //my try @PathVariable
        Employee employee = employeeService.findEmployeeById(employeeId);
        employee.setLastName("MeowMeow");
        //end my try

        Employee updatedEmployee = employeeService.save(employee);
        return updatedEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findEmployeeById(employeeId);
        if (employee == null) {
            throw new RuntimeException("Employee with id: " + employeeId + " not found.");
        } else {
            employeeService.deleteEmployeeById(employeeId);
        }
        return "Deleted employee: " + employee.toString();
    }
}
