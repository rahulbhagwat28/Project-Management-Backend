package com.SpringBasics.EmployeeSystem;

import com.SpringBasics.EmployeeSystem.DataAccess.RoleRepository;
import com.SpringBasics.EmployeeSystem.DataAccess.UserRepository;

import com.SpringBasics.EmployeeSystem.Entities.Role;
import com.SpringBasics.EmployeeSystem.Entities.User;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class EmployeeSystemApplication {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(EmployeeSystemApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner(UserRepository userRepository, RoleRepository roleRepository) {
		return args -> {

			Role role=new Role(1L,"ROLE_ADMIN");
			roleRepository.save(role);
			BCryptPasswordEncoder becrypt=new BCryptPasswordEncoder();
			User user1=new User("rahulb","rahulbhagwat@gmail.com", becrypt.encode("admin"));
			user1.setRoles(List.of(role));
			User user2=new User("ameyb","ameybhagwat@gmail.com",becrypt.encode("admin"));
			user2.setRoles(List.of(role));
			userRepository.saveAll(List.of(user1,user2));
		};
	}

}
