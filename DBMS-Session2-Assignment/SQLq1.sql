-- DROP database store_front;
CREATE DATABASE store_front;
show databases;
USE store_front;
show tables;
-- select database();

-- DROP TABLE user;
-- DROP TABLE admin;
-- DROP TABLE shopper;
-- DROP TABLE address;
-- DROP TABLE image;
-- DROP TABLE category;
-- DROP TABLE stock;
-- DROP TABLE cart;
-- DROP TABLE ordertable;
-- DROP TABLE ordersItem;

CREATE TABLE user(
    userId INT NOT NULL PRIMARY KEY,
    name VARCHAR(100),
    password VARCHAR(15),
    email VARCHAR(100) NOT NULL
     
);


CREATE TABLE admin(
    adminId INT NOT NULL PRIMARY KEY,    
    FOREIGN KEY(adminId) REFERENCES user(userId)
        ON DELETE CASCADE
);

CREATE TABLE shopper(
    shopper_id INT,
    phone_no INT NOT NULL,
    sex VARCHAR(5) NOT NULL,
    FOREIGN KEY(shopper_id) REFERENCES user(userId)
         ON DELETE CASCADE
);

CREATE TABLE address(
    address_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    street VARCHAR(15),
    district VARCHAR(25),
    state VARCHAR(25),
    pincode INT(6) NOT NULL,
    shopper_id INT,
    FOREIGN KEY(shopper_id) REFERENCES shopper(shopper_id)
         ON DELETE CASCADE
    
);


CREATE TABLE category(
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    parent_id INT,
    FOREIGN KEY(parent_id) REFERENCES category(id)     --  Self Join
     ON DELETE CASCADE
);


CREATE TABLE product(
    product_id INT PRIMARY KEY,
    price FLOAT(20) NOT NULL,
    name VARCHAR(25) NOT NULL,
    description VARCHAR(35) NOT NULL,
    category_id INT,
    date Date,
    FOREIGN KEY(category_id) REFERENCES category(id)
     ON DELETE CASCADE
    
);

CREATE TABLE image(
    product_id Int,
    img VARCHAR(150),
    FOREIGN KEY(product_id) REFERENCES product(product_id)
     ON DELETE CASCADE
    
);



CREATE TABLE stock(
    product_id INT, 
    quantity INT DEFAULT 0,
    date_added Date,
    FOREIGN KEY(product_id) REFERENCES product(product_id)
     ON DELETE CASCADE
    
);

CREATE TABLE cart(
    product_id INT,
    quantity INT NOT NULL,
    FOREIGN KEY(product_id) REFERENCES stock(product_id)
     ON DELETE CASCADE
    
);

CREATE TABLE ordertable(
    orderid INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    orderDate Date,
    ordertotal INT NOT NULL,
    status VARCHAR(15) NOT NULL,
    shopper_id INT,
    address_id INT,
    FOREIGN KEY(shopper_id) REFERENCES shopper(shopper_id)
     ON DELETE CASCADE,
    FOREIGN KEY(address_id) REFERENCES address(address_id)
     ON DELETE CASCADE
);

CREATE TABLE ordersItem(
    status VARCHAR(30) NOT NULL DEFAULT "IN PROCESS",
    orderid INT,
    product_id INT,
    quantity INT NOT NULL,
    FOREIGN KEY(orderid) REFERENCES ordertable(orderid)
     ON DELETE CASCADE,
    FOREIGN KEY(product_id) REFERENCES product(product_id)
     ON DELETE CASCADE
);
-- display all tables
show tables;

