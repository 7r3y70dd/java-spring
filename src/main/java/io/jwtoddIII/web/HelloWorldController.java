package io.jwtoddiii.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello(@PathVariable("id") String id) {
        return "{'message':'" + id + "'}";
    }

    @PostMapping(value = "/hello/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello(@PathVariable("id") String id, @RequestBody String body) {
        return "{'message':'" + id + "'}";
    }
}
