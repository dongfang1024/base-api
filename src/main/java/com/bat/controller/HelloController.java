package com.bat.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api")
public class HelloController {

    @GetMapping("hello")
    public ResponseEntity<String> testHello(){
        return ResponseEntity.ok("Hello, world.");
    }


    @GetMapping("sth")
    public ResponseEntity<String> saySth(){
        System.out.println("11111");
        return ResponseEntity.ok("Today is warm.");


    }

    @GetMapping("test/ex")
    public ResponseEntity<String> testExcp(){
        try{
            int a = 8/0;
            return ResponseEntity.ok("Good.");
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "碧云天，黄叶地。", e);
        }
    }

}
