package com.bat.controller;

import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/encrypt")
public class EncryptController {

    @Autowired
    private PasswordEncoder encoder;

    @GetMapping
    public ResponseEntity<String> encryptText(String text){
        if(StringUtils.isBlank(text)){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(encoder.encode(text));
    }

}
