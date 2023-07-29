package jgisson.springboot.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String helloworld(@RequestParam(name = "name", required = false) String name) {
        String displayname = name != null ? name : "world";
        return "Hello " + displayname;
    }

}
