package service.rest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BaseRestOperations {
    List<String> getAll(@RequestParam(value = "name", required = false, defaultValue = "World") String name);
    String update(@RequestBody String id) ;
    String getById(@RequestBody String id) ;
    String delete(@RequestBody String id);
}
