package com.bat.repo;

import com.bat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long>, QuerydslPredicateExecutor<User> {

    User findOneByUsername(String username);
}
