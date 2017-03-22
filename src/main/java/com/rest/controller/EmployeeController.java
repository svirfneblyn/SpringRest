package com.rest.controller;

import com.rest.entity.Employee;
import com.rest.entity.EmployeeResourceAssembler;
import com.rest.repositoryservices.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
   private EmployeeService emplService;
    @Autowired
   private EmployeeResourceAssembler employeeResourceAssembler;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    public List<Employee> getAll() {
        return emplService.getAllEmployees();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public Employee update(@RequestBody String id) {
        return emplService.getEmployeById(Long.getLong(id));
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Employee> add(@RequestBody Employee emp) {
        if (emplService.save(emp)) {
            return new ResponseEntity<>(emp, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(emp, HttpStatus.FOUND);
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    public Employee getById(@RequestParam String id) {
        return emplService.getEmployeById(Long.parseLong(id));
    }
 /*   private EmployeeResource employeeToResource(Employee employee){
        return (EmployeeResource) employeeResourceAssembler.toResource(employee);
    }*/
}
