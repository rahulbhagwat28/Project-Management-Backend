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

<img width="200" alt="screen1" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/4f2ccea9-d9b7-4e01-828f-69be5b0ad7e1">




<img width="1093" alt="screen2" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/08002549-adef-4a36-be1a-374b5c17c81a">




<img width="1060" alt="Screenshot 2023-06-13 at 4 16 30 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/b550c170-b5e3-4e02-b976-eb4ed9ab1ef8">




<img width="1072" alt="Screenshot 2023-06-13 at 4 17 07 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/1af146d0-4ff9-4f9d-bee4-40807f61a43d">




<img width="1070" alt="Screenshot 2023-06-13 at 4 17 38 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/a70dbbf6-0d79-4fa5-a0b8-8c991fc17414">





<img width="1102" alt="Screenshot 2023-06-13 at 4 18 15 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/001a966d-abc4-498d-8a4a-845de3aaab1d">





<img width="1045" alt="Screenshot 2023-06-13 at 4 19 15 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/cca81d0f-0541-49f9-a26c-58488dc3cff5">





<img width="1116" alt="Screenshot 2023-06-13 at 4 20 08 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/da81a567-2c3b-472d-ba00-99bfce6a0da2">




<img width="1098" alt="Screenshot 2023-06-13 at 4 21 59 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/436b1ec8-effe-4012-861c-ef6361ce390f">




<img width="961" alt="Screenshot 2023-06-13 at 4 22 53 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/fdca6975-0bf5-4d75-9559-0abdcc799929">





<img width="1096" alt="Screenshot 2023-06-13 at 4 23 38 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/b503bc09-edad-4d0f-948d-30ab0a5bbf9c">




<img width="1122" alt="Screenshot 2023-06-13 at 4 24 28 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/ac2ca5bf-0832-4f24-85b1-45f9986e42ef">




<img width="961" alt="Screenshot 2023-06-13 at 4 22 53 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/fdca6975-0bf5-4d75-9559-0abdcc799929">





<img width="1136" alt="Screenshot 2023-06-13 at 4 24 54 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/ae5b2079-15a9-41c4-b037-2e8028a68eb3">





<img width="1120" alt="Screenshot 2023-06-13 at 4 25 33 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/956e66f1-3434-4356-9088-a3cd0d5da872">





<img width="1118" alt="Screenshot 2023-06-13 at 4 26 01 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/8c0e067a-e127-40e1-bbd6-82a2b7a7fbbb">





<img width="1131" alt="Screenshot 2023-06-13 at 4 27 38 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/4757422c-4692-4004-b784-01dace16cafe">




<img width="1512" alt="Screenshot 2023-06-13 at 4 28 54 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/caacf81d-68da-4104-abd4-9ef62e18d0a9">





<img width="1104" alt="Screenshot 2023-06-13 at 4 29 06 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/521f586b-314c-46b0-82ce-70377d5a9c8e">





<img width="1120" alt="Screenshot 2023-06-13 at 4 30 25 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/3d60809f-e88e-4a89-9f53-d40ce6fa3900">






<img width="1045" alt="Screenshot 2023-06-13 at 4 31 11 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/68dd6414-947e-4755-83bd-ad10a1533a36">





<img width="1153" alt="Screenshot 2023-06-13 at 4 31 43 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/a0a821a3-a8df-47b7-99de-7ecba8844813">




<img width="1169" alt="Screenshot 2023-06-13 at 4 35 11 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/83afba26-30a9-48ee-bfeb-ab0ae5c73551">





<img width="1212" alt="Screenshot 2023-06-13 at 4 35 28 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/69c3c803-c525-4977-b037-444830c3788a">
