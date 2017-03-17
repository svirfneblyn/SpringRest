package service.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.rest.entity.Department;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController implements BaseRestOperations {

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    public List<String> getAll(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        return null;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public String update(@RequestBody String id) {
        return null;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> add(@RequestBody Department department) {
        return null;
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    public String getById(@RequestParam String id) {
        return null;
    }
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public String delete(@RequestBody String id) {
        return null;
    }
}
