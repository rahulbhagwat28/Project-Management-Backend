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


<img width="961" alt="Screenshot 2023-06-13 at 4 22 53 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/fdca6975-0bf5-4d75-9559-0abdcc799929">











<img width="1136" alt="Screenshot 2023-06-13 at 4 24 54 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/ae5b2079-15a9-41c4-b037-2e8028a68eb3">





<img width="1120" alt="Screenshot 2023-06-13 at 4 25 33 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/956e66f1-3434-4356-9088-a3cd0d5da872">










<img width="1131" alt="Screenshot 2023-06-13 at 4 27 38 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/4757422c-4692-4004-b784-01dace16cafe">




<img width="1512" alt="Screenshot 2023-06-13 at 4 28 54 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/caacf81d-68da-4104-abd4-9ef62e18d0a9">





<img width="1104" alt="Screenshot 2023-06-13 at 4 29 06 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/521f586b-314c-46b0-82ce-70377d5a9c8e">





<img width="1120" alt="Screenshot 2023-06-13 at 4 30 25 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/3d60809f-e88e-4a89-9f53-d40ce6fa3900">






<img width="1045" alt="Screenshot 2023-06-13 at 4 31 11 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/68dd6414-947e-4755-83bd-ad10a1533a36">





<img width="1153" alt="Screenshot 2023-06-13 at 4 31 43 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/a0a821a3-a8df-47b7-99de-7ecba8844813">




<img width="1169" alt="Screenshot 2023-06-13 at 4 35 11 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/83afba26-30a9-48ee-bfeb-ab0ae5c73551">





<img width="1212" alt="Screenshot 2023-06-13 at 4 35 28 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/69c3c803-c525-4977-b037-444830c3788a">
