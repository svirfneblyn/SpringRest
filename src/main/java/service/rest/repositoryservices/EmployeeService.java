package service.rest.repositoryservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.rest.entity.Employee;
import service.rest.entity.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ihar_Rubanovich on 3/17/2017.
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployeById(Long id) {

        return employeeRepository.findOne(id);
    }

    public Employee getEmployeByLastName(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }
    public Employee getEmployeByPosition(String position) {
        return employeeRepository.findByPosition(position);
    }
 /* public  Employee findEmplAndManager(String manager){

    }*/
    public List<Employee> getAllEmployees() {
        Iterator<Employee> allemplIterator = employeeRepository.findAll().iterator();
        List<Employee> emplList = new ArrayList<>();
        allemplIterator.forEachRemaining(emplList::add);
        return emplList;
    }

    public Boolean save(Employee empl) {
        if (!employeeRepository.exists(empl.getId())) {
            employeeRepository.save(empl);
            return true;
        }
        return false;
    }

}
