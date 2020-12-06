package com.bat.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloController {

    @GetMapping("hello")
    public ResponseEntity<String> testHello(){
        return ResponseEntity.ok("Hello, world.");
    }


    @GetMapping("sth")
    public ResponseEntity<String> saySth(String name){
        System.out.println("11111");

        name = "yyyyy";

        name = "Good evening.";
        return ResponseEntity.ok("Today is warm.");


    }

}
