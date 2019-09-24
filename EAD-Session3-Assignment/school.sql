CREATE DATABASE school;
SHOW databases;

USE school;
-- drop TABLE student_details;

CREATE TABLE student_details(
    firstName VARCHAR(50),
    lastName VARCHAR(50),
    fatherName VARCHAR(50),
    email VARCHAR(50) PRIMARY KEY,
    classNo INT,
    age INT
);


SELECT * FROM student_details;
