package com.bat.controller;

import com.bat.domain.User;
import com.bat.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.RuntimeErrorException;

@Slf4j
@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public ResponseEntity<User> queryUser(@PathVariable("id")Long id){
        if(id == null){
            log.info("id should not be null");
            return ResponseEntity.badRequest().build();
        }
        log.info("Request to query user, id: {}", id);
        User user = this.userService.queryUserById(id);
        if(user == null){
            throw new RuntimeErrorException(null, "此id没有对应的人员信息");
        }
        return ResponseEntity.ok(user);

    }

//    @PostMapping
//    public ResponseEntity<User> createUser(User user){
//
//
//    }


}
