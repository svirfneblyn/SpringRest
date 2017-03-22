package com.rest.entity;

import com.rest.controller.EmployeeController;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

/**
 * Created by Ihar_Rubanovich on 3/20/2017.
 */
public class EmployeeResourceAssembler extends ResourceAssemblerSupport {
    /**
     * Creates a new {@link ResourceAssemblerSupport} using the given controller class and resource type.
     *
     * @param controllerClass must not be {@literal null}.
     * @param resourceType    must not be {@literal null}.
     */
    public EmployeeResourceAssembler(Class controllerClass, Class resourceType) {
        super(EmployeeController.class, EmployeeResource.class);
    }

    @Override
    public ResourceSupport toResource(Object entity) {
        EmployeeResource employeeResource = (EmployeeResource) createResourceWithId(entity,entity);
        employeeResource.setEmployee(employeeResource.getEmployee());
        return employeeResource;
    }
}
