package com.SpringBasics.EmployeeSystem.DataAccess;


import com.SpringBasics.EmployeeSystem.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


/*
User Data Access Object
 */
public interface UserRepository extends JpaRepository<User,Long> {


    //Custom JPQL used for finding user by email
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    public User findByEmail(String email);

}
