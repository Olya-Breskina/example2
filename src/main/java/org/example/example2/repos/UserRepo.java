package org.example.example2.repos;

import org.example.example2.domen.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends  JpaRepository <User, Long> {
    User findByUsername(String username);
}