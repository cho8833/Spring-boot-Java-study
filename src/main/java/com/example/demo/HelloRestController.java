package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    //RequestMapping(method=GET)
    @GetMapping("get")
    public Hello greetingREST(@RequestParam(value = "name", defaultValue = "World") String name) {
        Hello hello = new Hello();
        hello.setData(name);
        return hello;
    }
}
