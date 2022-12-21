package com.net.javaguides.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.net.javaguides.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
   User findByEmail(String email);
}
