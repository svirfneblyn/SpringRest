package service.rest.controller;

import org.apache.catalina.Manager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ihar_Rubanovich on 3/16/2017.
 */
@RestController
@RequestMapping("/manager")
public class ManagerController implements BaseRestOperations {
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
    public ResponseEntity<?> add(@RequestBody Manager manger) {
        return null;
    }

    @RequestMapping(value = "/getById", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.FOUND)
    public String getById(@RequestBody String id) {
        return null;
    }
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public String delete(@RequestBody String id) {
        return null;
    }
}
