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

<img width="384" alt="screen1" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/d749c862-81fa-4877-8160-0fee207f36fb">


<img width="1093" alt="screen2" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/f8d21ffb-76d8-4230-bd13-a9bc1e0a4bd1">

<img width="1060" alt="Screenshot 2023-06-13 at 4 16 30 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/c37bc582-3dac-403b-82d3-bbd6a568cd8a">

<img width="1072" alt="Screenshot 2023-06-13 at 4 17 07 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/98ac8da5-85a8-4ff9-a01f-c8e4195f9199">

<img width="1070" alt="Screenshot 2023-06-13 at 4 17 38 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/69f6f202-75a6-4246-aa81-40dac5295446">

<img width="1102" alt="Screenshot 2023-06-13 at 4 18 15 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/c61fc4ad-7d82-43c4-85eb-2ed0322d2cad">


<img width="1045" alt="Screenshot 2023-06-13 at 4 19 15 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/80853609-ae2c-44ab-b4fe-c7774e4061bf">


<img width="1116" alt="Screenshot 2023-06-13 at 4 20 08 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/11bbfb42-eae7-4076-891b-5adefbc02dfd">


<img width="1098" alt="Screenshot 2023-06-13 at 4 21 59 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/976bfcad-3f47-41ba-990c-a66a3d4cec0a">





