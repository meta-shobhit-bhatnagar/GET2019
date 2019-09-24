CREATE DATABASE school;
SHOW databases;

USE school;
-- drop TABLE student_details;

CREATE TABLE student_details(
     student_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    firstName VARCHAR(50),
    lastName VARCHAR(50),
    fatherName VARCHAR(50),
    email VARCHAR(50),
    classNo INT,
    age INT
);



SELECT * FROM student_details;