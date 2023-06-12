package com.SpringBasics.EmployeeSystem.Configuration;


import com.SpringBasics.EmployeeSystem.Service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {


    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {


        http.sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.authorizeHttpRequests(auth -> auth.requestMatchers("/api/v1/employees/findAllEmployees").permitAll())
                .authorizeHttpRequests(auth -> auth.requestMatchers(toH2Console()).permitAll())
                .authorizeHttpRequests(auth -> auth.requestMatchers("/api/v1/employees/assign/**","/api/v1/employees/assign/getProjects/**").hasAuthority("ROLE_MANAGER"))
                .authorizeHttpRequests(auth -> auth.requestMatchers("/api/v1/employees/completeProject/**").hasAuthority("ROLE_EMPLOYEE"))
                .authorizeHttpRequests(auth -> auth.requestMatchers("/api/v1/employees/updateEmployee/**", "/api/v1/employees/deleteEmployee/**", "/api/v1/employees/createEmployee").hasAuthority("ROLE_ADMIN").anyRequest().authenticated())

                .httpBasic(Customizer.withDefaults());


        http.csrf(csrf -> csrf.disable());

        http.headers(headers -> headers.frameOptions(frame -> frame.disable()));

        return http.build();

    }


    @Bean
    public CustomUserDetailsService customUserDetailsService() {
        return new CustomUserDetailsService();

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
