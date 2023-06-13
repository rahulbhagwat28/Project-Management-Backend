package com.SpringBasics.EmployeeSystem;

import com.SpringBasics.EmployeeSystem.DataAccess.ProjectRepository;
import com.SpringBasics.EmployeeSystem.DataAccess.RoleRepository;
import com.SpringBasics.EmployeeSystem.DataAccess.UserRepository;

import com.SpringBasics.EmployeeSystem.Entities.Project;
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

	//Adding some employee data with admin , employee and manager roles
	@Bean
	public CommandLineRunner runner(UserRepository userRepository, RoleRepository roleRepository, ProjectRepository projectRepository) {
		return args -> {

			Role role=new Role(1L,"ROLE_ADMIN");
			Role role2=new Role(2L,"ROLE_MANAGER");
			Role role3=new Role(3L,"ROLE_EMPLOYEE");
			roleRepository.saveAll(List.of(role,role2,role3));
			BCryptPasswordEncoder becrypt=new BCryptPasswordEncoder();
			User user1=new User("rahulb","rahulbhagwat@gmail.com", becrypt.encode("admin"));
			user1.setRoles(List.of(role));
			User user2=new User("ameyb","ameybhagwat@gmail.com",becrypt.encode("admin"));
			user2.setRoles(List.of(role));
			User user3=new User("anveshb","anvesh@gmail.com",becrypt.encode("manager"));
			user3.setRoles(List.of(role2));
			User user4=new User("mayurb","mayur@gmail.com",becrypt.encode("employee"));
			user4.setRoles(List.of(role3));
			User user5=new User("megha","megha@gmail.com",becrypt.encode("employee"));
			user5.setRoles(List.of(role3));
			userRepository.saveAll(List.of(user1,user2,user3,user4,user5));



		};
	}

}
