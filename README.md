# Project-Management-Backend

A Basic backend system for a project management usecase with CRUD operations and role based security  
This is a beginner project for getting familiar with building a backend with spring framework

Tech Stack :
Language used : Java (Spring Boot , Spring DATA JPA , Spring Security , Lombok , H2 (In Memory Database)) 


A user can have multiple roles : Role_Admin , Role_Employee , Role_Manager

Priviledges: 

Role Admin : A user having this role can create , delete and update users 

Role Manager : A User having this role can assign projects to users with role_employees and also get status of the projects

Role Employee : A user having this role can complete projects assigned to them 

All Users can retrieve the list of total users from the database


Running on local :

Run maven clean install

start the server at localhost 8080 
