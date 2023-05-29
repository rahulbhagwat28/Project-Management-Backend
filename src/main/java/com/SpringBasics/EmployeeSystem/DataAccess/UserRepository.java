package com.SpringBasics.EmployeeSystem.DataAccess;


import com.SpringBasics.EmployeeSystem.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {


    @Query("SELECT u FROM User u WHERE u.username = ?1")
    public User findByEmail(String email);





}