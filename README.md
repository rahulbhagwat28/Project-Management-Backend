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

This project covers exception handling ,unit and integration tests, custom validations, simple database design with JPA Entities , configuring Spring Security, Model View Controller pattern (Spring-web-mvc) ,Custom Annotations for validation and custom error handling

App runs on http://localhost:8080/api/v1/employees


Services :

1. Create Employee :
Basic Authorization with an admin role is need to access this endpoint

2. Update Employee :
Basic Authorization with an admin role is need to access this endpoint

3. Delete Employee :
Basic Authorization with an admin role is need to access this endpoint

4. Find All Employees :
Any user can access this

5. Assign Project :
Basic Authorization with a manager role is need to access this endpoint

6. Complete Project :
Basic Authorization with an employee role  is need to access this endpoint

7. Get Completed Projects :
Basic Authorization with a manager role is need to access this endpoint



Authentication method followed in Spring Security : Basic



Running on local :

Run maven clean install

start the server at localhost 8080 



Postman Documentation for all the endpoints:


<img width="1469" alt="Screenshot 2023-06-13 at 7 12 18 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/9a639987-7f2b-4d73-b692-be3e234513ca">




<img width="1489" alt="Screenshot 2023-06-13 at 7 12 59 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/bb722534-009a-4288-9da0-4db2108bfcad">



<img width="1438" alt="Screenshot 2023-06-13 at 7 13 18 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/580395e3-7d53-4bb8-8790-abea3855289e">




<img width="1390" alt="Screenshot 2023-06-13 at 7 13 41 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/255934e9-d307-4a70-8a87-7b8f36cd057a">



<img width="1352" alt="Screenshot 2023-06-13 at 7 13 58 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/664035e1-7d28-454c-857b-6f399e318f16">




 

 


 

 
 
 
 
 
 
