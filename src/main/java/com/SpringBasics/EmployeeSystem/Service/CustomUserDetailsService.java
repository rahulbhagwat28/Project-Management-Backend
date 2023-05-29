package com.SpringBasics.EmployeeSystem.Service;


import com.SpringBasics.EmployeeSystem.DataAccess.UserRepository;
import com.SpringBasics.EmployeeSystem.Entities.User;
import com.SpringBasics.EmployeeSystem.Entities.UserPrincipal;
import com.SpringBasics.EmployeeSystem.Exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.findByEmail(username);
        System.out.println("dncdbhn");
        if(user==null)
        {
            throw new UsernameNotFoundException("User not found");
        }
        UserPrincipal principal=new UserPrincipal(user);

        System.out.println(principal);
        return  principal;

    }
}