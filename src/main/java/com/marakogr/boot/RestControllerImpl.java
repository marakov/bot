package com.marakogr.boot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllerImpl {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity hello() {
        return new ResponseEntity("hello world", HttpStatus.OK);
    }

    @GetMapping("/")
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public String confirm() {
        return "6019f0c1";
    }
}
