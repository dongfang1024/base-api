package com.bat.service;

import com.bat.entity.User;
import com.bat.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        List<GrantedAuthority> authorityList = AuthorityUtils.commaSeparatedStringToAuthorityList("manager");
        //数据库查询用户
        User user = this.userRepo.findOneByUsername(name);
        if(user==null){
            throw new UsernameNotFoundException("用户名信息不存在");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), encoder.encode(user.getPassword()), authorityList);
    }
}
