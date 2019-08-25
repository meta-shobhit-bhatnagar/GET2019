show tables;

/* 15 enteries of user table */
INSERT INTO user(userId, name, password, email) 
              VALUES(11,"Shobhit", "9660360364429","shobhit@gmail.com"),
                    (12,"Rakesh", "123456", "rakesh@gmail.com"),
                    (13,"Gaurav", "123456", "gaurav@metacube.com"),
                    (14,"Rahul", "123456", "rahul@metacube.com"),
                    (15,"Vinod", "123456", "vinod@metacube.com"),
                    (16,"Ankita", "123456", "Ankita@metacube.com"),
                    (17,"Yatika", "123456", "Yatika@metacube.com"),
                    (18,"Vikas", "123456", "Vikas@gmail.com"),
                    (19,"Shubham", "123456", "Shubham1323q4@gmail.com"),
                    (20,"Ansul", "123456", "Ansul@yahoo.com"),
                    (25,"Ansul", "123456", "Ansul@yahoo.com"),
                    (21,"MUKESH", "123456", "Mukesh@yahoo.com"),
                    (22,"user1", "123456", "user1@yahoo.com"),
                    (23,"user2", "123456", "user2@yahoo.com"),
                    (24,"user3", "123456", "user3@yahoo.com");
                    


/* display user table*/
SELECT * FROM user;

/* 10 enteries of shopper table which are linked to user table by shopper_id */
INSERT INTO shopper(shopper_id, phone_no, sex) 
                    VALUES(11,966036442,"male"),
                    (12,966036441,"male"),
                    (13,966036443,"male"),
                    (14,778899556,"male"),
                    (15,986365646,"male"),
                    (16,866036443,"male"),
                    (17,775531531,"male"),
                    (18,823245646,"male"),
                    (19,853245646,"male"),
                    (20,145431654,"male");

/* display shopper table*/
SELECT * FROM shopper;

/* Address entries of shoppers */
INSERT INTO address(street, district, state, pincode, shopper_id)
            VALUES("Anantpura","Jaipur", "Rajasthan", 323507, 11),
            ("JAITPURA","Jaipur", "Rajasthan", 323502, 11),
            ("RAJA PARK","Jaipur", "Rajasthan",323206, 12),
            ("SITAPURA","Jaipur", "Rajasthan", 323509,13),
            ("Anantpura","kota", "Rajasthan", 323521,14),
            ("Jamdoli","jodhpur", "Rajasthan",3235377, 15),
            ("Malviya nagar","Jaipur", "Rajasthan",323624, 16),
            ("RAJA PARK","ajmer", "Rajasthan",323563, 17),
            ("RAJA PARK","alwar", "Rajasthan",323573, 18),
            ("Shastri nagar","Jaipur", "Rajasthan",323519, 19),
            ("Mansarovar","Jaipur", "Rajasthan",323787, 20);

/* Display address of shoppers*/
select * from address;




/* user table and shopper table combine with left join*/
Select userId,name,email,phone_no,sex
FROM user
LEFT JOIN shopper
ON user.userId = shopper.shopper_id;

/* Category */
INSERT INTO category(id,name, parent_id) 
                        VALUES(1,"Electronics",NULL),
                        (2,"Appreal",NULL),
                        (3,"Mobile",1),
                        (4,"TV",1),
                        (5,"Men's wear",2),
                        (6,"Women's wear",2),
                        (7,"Apple",3),
                        (8,"Nokia",3),
                        (9,"MI",3);
                        
SELECT * FROM  category;

-- DELETE FROM category;
describe category;

/*display categories with parent category name using Self Join*/
SELECT A.id as categoryId, A.name as CategoryName, IFNULL(B.name, 'Top Category') as ParentCategory
FROM category A
LEFT JOIN category B
ON A.parent_id = B.id;



/* inserting 14 products with diffrent different category along with price */
INSERT INTO product(product_id, price, name, description, category_id,date,status) 
                        Values(101, 15000 ,"Nokia 6.1 plus","Android phone with 6 inch screen", 8 , "2019-08-16", 'Active'),
                        (102, 25000 ,"iphone 5s","4 Gb Ram and 64 gb storage", 7, "2019-08-10",'Active'),
                        (103, 45000 ,"iphone 6s","4 Gb Ram and 64 gb storage", 7 , "2019-08-10",'Active'),
                        (104, 22000 ,"Nokia 7.1 plus","4 Gb Ram and 64 gb storage", 8 , "2019-08-02",'Active'),   
                        (105, 25000 ,"Samsung Led Tv","32 inch", 4 , "2019-07-15",'Active'),
                        (106, 15000 ,"MI NOTE 4","4 Gb Ram and 64 gb storage", 9 , "2019-03-10",'Active'),    
                        (107, 20000 ,"MI NOTE 5","6 Gb Ram and 128 gb storage", 9 , "2019-04-10",'Active'),    
                        (108, 22000 ,"MI NOTE 6 PRO ","4 Gb Ram and 256 gb storage", 9 , "2019-07-10", 'Active'),
                        (109, 35000 ,"led Sony","44 inch", 4 , "2019-08-16", 'Active'),
                        (110, 2000 ,"Black shirt Mens","cotten shirt", 5 , "2019-01-10",'Active'),   
                        (111, 5000 ,"Women Skirt","Summer skirt with full comfort", 6 , "2019-01-9", 'Active'),    
                        (112, 250 ,"Men's Tshirt","V nech", 5 , "2018-08-10", 'Active'),   
                        (113, 25000 ,"Men's suit","Raymond suit", 5 , "2019-08-11", 'Active'),    
                        (114, 150 ,"Women Scarp","fully comfort scarp", 6 , "2019-08-10", 'Active');
                        
/* PRODUCT DISPLAY in date decending order */   
SELECT * FROM product
ORDER BY date DESC ;

/* Images Insert for Products */
INSERT INTO image(product_id,img)
        Values(101,"1.jpg"),
              (101,"2.jpg"),
              (102,"1.jpg"),
              (104,"1.jpg"),
              (105,"1.jpg"),
              (107,"1.jpg"),
              (110,"1.jpg"),
              (114,"1.jpg"),
              (114,"2.jpg"),
              (114,"3.jpg");
      
SELECT * FROM image;

/* products inserting into stock with quantity and date*/
INSERT INTO stock(product_id, quantity, date_added)
                    Values(101,70,"2019-08-15"),
                    (102,40,"2019-08-12"),
                    (103,10,"2019-08-11"),
                    (104,1,"2019-08-10"),
                    (105,90,"2019-08-16"),
                    (106,91,"2019-08-12"),
                    (107,500,"2019-08-01"),
                    (108,210,"2019-08-03"),
                    (109,80,"2019-08-08"),
                    (110,2,"2019-08-17"),
                    (112,65,"2019-08-07"),
                    (113,50,"2019-08-06"),
                    (114,25,"2019-08-02");

SELECT * FROM stock;


/* Display Id, Title, Category Title, Price of the products which are Active and recently added products should be at top. */
SELECT A.product_id as Id, A.name as Title, B.name as Category, A.price as Price, A.date as Date_added, A.status AS status
From product A
LEFT JOIN category B
ON A.category_id = B.id
WHERE A.status='Active'
ORDER BY A.date DESC;

-- Display the list of products which don't have any images
SELECT * FROM product 
WHERE product.product_id NOT IN(
        SELECT image.product_id FROM image)  ;

--  Display all Id, Title and Parent Category Title for all the Categories listed, 
-- sorted by Parent Category Title and then Category Title
SELECT c1.id,c1.name,
       IFNULL(c2.name,'Top category')as parent
FROM category c1 
LEFT JOIN category c2
     ON c1.parent_id = c2.id
ORDER BY c2.name, c1.name;


/*  Display Id, Title, Parent Category Title of all the leaf Categories (categories which are not parent of any other category) */
SELECT c1.id, c1.name,c1.parent_id
FROM category c1
WHERE c1.id NOT IN (SELECT c2.parent_id
                    FROM category c2
                    WHERE c2.parent_id IS NOT NULL);
                    
                    
/* Display Product Title, Price & Description which falls into particular category Title */
SELECT product.name , product.price, product.description, A.name
FROM product
LEFT JOIN category A
ON product.category_id = A.id
where A.name = "MI";




/* Display the list of Products whose Quantity on hand (Inventory) is under 50 */
SELECT A.product_id, A.name, IFNULL(B.quantity, 0)
FROM product A
LEFT JOIN stock B
ON A.product_id = B.product_id
WHERE B.quantity< 50;


