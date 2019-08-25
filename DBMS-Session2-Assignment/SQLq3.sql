
INSERT INTO ordertable(orderDate,shopper_id, address_id)
            VALUES("2019-05-05", 11, 1),
            ("2019-05-10",11, 2),
            ("2019-05-15", 11, 2),
            ("2019-05-25", 12, 3),
            ("2019-05-30", 13, 4),
            ("2019-06-05", 14, 5),
            ("2019-06-05", 14, 5),
            ("2019-06-19", 15, 6),
            ("2019-06-21", 15, 6),
            ("2019-07-05", 16, 7),
            ("2019-07-06", 16, 7),
            ("2019-07-07", 15, 6),
            ("2019-07-11", 15, 6),
            ("2019-07-12", 16, 7),
            ("2019-07-21", 11, 1),
            ("2019-08-05", 11, 2),
            ("2019-04-05", 11, 1),
            ("2019-08-11", 17, 8),
            ("2019-08-12", 11, 2),
            ("2019-08-16", 16, 7),
            ("2019-08-15", 17, 8),
            ("2019-08-17", 17, 8),
            ("2019-08-17", 17, 8),
            ("2019-08-18", 17, 8);


SELECT * FROM ordertable;

/* order items in the order with orderid and quantity */
INSERT INTO ordersItem(status, orderid, product_id,  quantity)
                VALUES("DELIVERED", 1, 101, 1),
                ("DELIVERED", 2, 101, 1 ),
                ("DELIVERED", 2, 102, 2),
                ("CANCELLED", 3, 105, 2),
                ("DELIVERED", 4, 106, 1),
                ("DELIVERED", 5, 107, 1),
                ("CANCELLED", 6, 108, 1),
                ("SHIPPED", 7, 109, 1),
                ("CANCELLED", 8, 110, 1),
                ("DELIVERED", 9, 106, 1),
                ("DELIVERED", 10, 101, 1),
                ("SHIPPED", 11, 109, 1),
                ("DELIVERED", 12, 103, 1),
                ("DELIVERED", 13, 103, 1),
                ("CANCELLED", 14, 106, 1),
                ("IN PROCESS", 15, 107, 1),
                ("SHIPPED", 16, 112, 1),
                 ("SHIPPED", 17, 112, 1),
                 ("SHIPPED", 18, 112, 1),
                ("DELIVERED", 19, 107, 1 ),
                ("DELIVERED", 19, 110, 2);
                

/* order items for order id 20*/
INSERT INTO ordersItem(status, orderid, product_id,  quantity)
                VALUES( "SHIPPED", 20, 110, 1 ),
                ("SHIPPED", 20, 101, 1),

                /* order items for order id 21*/

                ( "IN PROCESS", 21, 101, 1 ),
                ("DELIVERED", 21, 102, 1),

                /* order items for order id 22*/

                ( "DELIVERED", 22, 101, 1 ),
                ("SHIPPED", 22, 102, 2),
                ( "IN PROCESS", 22, 103, 1 ),
                ("IN PROCESS", 22, 104, 2),


                /* order items for order id 23 and 24*/

                ( "IN PROCESS", 23, 101, 1 ),
                ( "IN PROCESS", 24, 101, 1 );

SELECT * FROM ordersItem;

SELECT o.orderid, o.orderDate, A.status, A.product_id
FROM ordertable o
inner join ordersItem A
on o.orderid = A.orderid;




/* Display Recent 15(same as 50) Orders placed (Id, Order Date) */

SELECT A.orderid, A.orderDate, B.status
FROM ordertable A
INNER JOIN ordersItem B
ON A.orderid = B.orderid
ORDER BY orderDate DESC
LIMIT 15;


/* Display 5 most expensive Orders */

SELECT A.orderid, A.orderDate, B.status, SUM((C.price * B.quantity)) as orderTotal
FROM ordertable A
INNER JOIN ordersItem B
ON A.orderid = B.orderid
INNER JOIN product C
ON B.product_id= C.product_id
GROUP BY A.orderid
ORDER BY C.price DESC
LIMIT 10;

/* Display all the Orders which are placed more than 10 days old and one or more items from those orders are still not shipped. */

SELECT DISTINCT A.orderid,  B.status,A.orderDate
FROM ordertable A
INNER JOIN ordersItem B
ON A.orderid = B.orderid 
WHERE  A.orderDate < DATE_SUB(CURDATE(),INTERVAL 10 DAY) && B.status = "IN PROCESS" ;


/* Display list of shoppers which haven't ordered anything since last month */
SELECT S.shopper_id
FROM shopper S
WHERE NOT EXISTS (
    SELECT O.shopper_id
    FROM ordertable O
    WHERE S.shopper_id = O.shopper_id && O.orderDate >=DATE_SUB(CURDATE(),INTERVAL 1 MONTH) ) ;


/* Display list of shopper along with orders placed by them in the last 15 days */
SELECT DISTINCT A.shopper_id, B.orderid, C.product_id, C.name, C.price, A.orderDate
FROM ordertable A
INNER JOIN ordersItem B
ON A.orderid = B.orderid
INNER JOIN product C
ON B.product_id = C.product_id
WHERE A.orderDate >= DATE_SUB(CURDATE(), INTERVAL 15 DAY);


/* Display list of order items which are in “shipped” state for particular Order Id (say.: 1020)) */

SELECT B.orderid, A.product_id, A.name, B.status
FROM product A
INNER JOIN ordersItem B
ON A.product_id = B.product_id
WHERE B.status = "SHIPPED"
ORDER BY B.orderid;

/* Display list of order items along with order placed date which fall between Rs 16000 to Rs 50000 price */
SELECT A.product_id, B.name , B.price, C.orderDate
FROM ordersItem A
INNER JOIN product B
ON A.product_id = B.product_id
INNER JOIN ordertable C
ON C.orderid = A.orderid
WHERE B.price BETWEEN 16000 AND 50000 ;