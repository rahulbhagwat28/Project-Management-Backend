# Project-Management-Backend

A Basic backend system for a project management usecase with CRUD operations and role based security  
This is a beginner project for getting familiar with building a backend using spring framework

Tech Stack :
Language used : Java (Spring Boot , Spring Data JPA , Spring Security , Lombok , H2 (In Memory Database)) 




A user can have multiple roles : Role_Admin , Role_Employee , Role_Manager

Privileges: 

Role Admin : A user having this role can create , delete and update employees (users)

Role Manager : A User having this role can assign projects to employees  and also get the list of completed projects (project status)

Role Employee : A user having this role can complete projects assigned to them 

All Users can retrieve the list of total users from the database



App runs on http://localhost:8080/api/v1/employees

Services :

1. Create Employee 
2. Update Employee
3. Delete Employee
4. Find All Employees 
5. Assign Project
6. Complete Project
7. Get Completed Projects 

Authentication method followed in Spring Security : Basic



Running on local :

Run maven clean install

start the server at localhost 8080 


Postman Collection for all endpoints


<img width="178" alt="image" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/31960cdc-c34b-416e-b24f-94b483baaa62">




<img width="277" alt="image" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/57096b6d-4ed8-4390-9bd6-f9aa1b9544e7">



