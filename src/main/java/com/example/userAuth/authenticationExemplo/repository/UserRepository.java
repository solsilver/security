package com.example.userAuth.authenticationExemplo.repository;

import com.example.userAuth.authenticationExemplo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
