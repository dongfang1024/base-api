package com.bat.service;

import com.bat.entity.User;
import com.bat.repo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User queryUserById(Long id){
        log.info("UserService-queryUserById, param: {}", id);
        return this.userRepo.findById(id).orElse(null);
    }
}
