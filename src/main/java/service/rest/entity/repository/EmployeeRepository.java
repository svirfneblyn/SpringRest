package service.rest.entity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import service.rest.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    Employee findByLastName(String lastName);
    Employee findByPosition(String position);
    Employee findEmplAndManager(String manager);


}
