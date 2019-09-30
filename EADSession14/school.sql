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


CREATE TABLE userdetails(
    username VARCHAR(50),
    password VARCHAR(50),
    role VARCHAR(50)
);

INSERT INTO userdetails(username, password, role)
    VALUES ('shobhit1', 'Qwerty@12', 'USER');
    


SELECT * FROM student_details;