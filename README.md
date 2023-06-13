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

<img width="384" alt="screen1" src="https://raw.githubusercontent.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/d749c862-81fa-4877-8160-0fee207f36fb">

<img width="1093" alt="screen2" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/f8d21ffb-76d8-4230-bd13-a9bc1e0a4bd1">

<img width="1060" alt="Screenshot 2023-06-13 at 4 16 30 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/c37bc582-3dac-403b-82d3-bbd6a568cd8a">

<img width="1072" alt="Screenshot 2023-06-13 at 4 17 07 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/98ac8da5-85a8-4ff9-a01f-c8e4195f9199">

<img width="1070" alt="Screenshot 2023-06-13 at 4 17 38 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/69f6f202-75a6-4246-aa81-40dac5295446">

<img width="1102" alt="Screenshot 2023-06-13 at 4 18 15 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/c61fc4ad-7d82-43c4-85eb-2ed0322d2cad">


<img width="1045" alt="Screenshot 2023-06-13 at 4 19 15 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/80853609-ae2c-44ab-b4fe-c7774e4061bf">


<img width="1116" alt="Screenshot 2023-06-13 at 4 20 08 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/11bbfb42-eae7-4076-891b-5adefbc02dfd">


<img width="1098" alt="Screenshot 2023-06-13 at 4 21 59 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/976bfcad-3f47-41ba-990c-a66a3d4cec0a">

<img width="961" alt="Screenshot 2023-06-13 at 4 22 53 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/d5b512ff-5a3d-469d-8097-8171586b09b1">

<img width="1096" alt="Screenshot 2023-06-13 at 4 23 38 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/653fc770-887e-4fda-a76e-c5724d695b86">

<img width="1122" alt="Screenshot 2023-06-13 at 4 24 28 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/ae2f0bab-2004-4ca4-aa2c-8d90a7cf8763">

<img width="1136" alt="Screenshot 2023-06-13 at 4 24 54 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/60ce7c31-cb27-413a-94d6-c3c8c352a917">


<img width="1120" alt="Screenshot 2023-06-13 at 4 25 33 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/f44a2744-fcba-42a5-9d03-b35922fff8ee">

<img width="1118" alt="Screenshot 2023-06-13 at 4 26 01 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/84dcdf25-7e02-4b60-971c-5f81dac31cc9">

<img width="1131" alt="Screenshot 2023-06-13 at 4 27 38 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/9f8d3e01-dbd5-4553-a3ba-6e6556df1009">

<img width="1512" alt="Screenshot 2023-06-13 at 4 28 54 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/5e01e40e-6716-4ebd-b5e3-9893026c4832">

<img width="1104" alt="Screenshot 2023-06-13 at 4 29 06 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/88b42037-8816-4824-898c-2c816497b7f9">

<img width="1120" alt="Screenshot 2023-06-13 at 4 30 25 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/26255d57-af2a-4ba8-b9d5-0182678b0ef5">

<img width="1045" alt="Screenshot 2023-06-13 at 4 31 11 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/1a42f54a-616e-47ae-a1c7-de5f5ea5a6ee">

<img width="1153" alt="Screenshot 2023-06-13 at 4 31 43 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/ed067a35-3340-4b6b-b459-8bb3417e37d9">

<img width="1169" alt="Screenshot 2023-06-13 at 4 35 11 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/4f838c18-8359-4c79-ac84-314257d8cead">

<img width="1212" alt="Screenshot 2023-06-13 at 4 35 28 PM" src="https://github.com/rahulbhagwat28/Project-Management-Backend/assets/72269385/970cf740-bc4d-4fcf-9769-413c78d2c849">


