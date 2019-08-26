  
drop table state;
create table state(
    state_id int NOT NULL PRIMARY KEY,
    state_name varchar(45)
);


create table city(
city_id int NOT NULL,
city_name varchar(45),
state_id int,
primary key (city_id),
foreign key (state_id) references state(state_id)
);

create table ZipCode(
zipCode int NOT NULL PRIMARY KEY,
city_id int NOT NULL,
foreign key (city_id) references city(city_id)
);




INSERT INTO state (state_id, state_name) 
                    VALUES (1, 'Rajasthan'),
                     (2, 'Haryana'),
                     (3, 'Karnataka'),
                     (4, 'Kerala'),
                     (5, 'Assam'),
                     (6, 'West Bengal');


INSERT INTO city (city_id, city_name, state_id) 
        VALUES (1, 'Ajmer', 1),
                (2, 'Jaipur', 1),
                (3, 'Udaipur', 1),
                (4, 'kolkata', 6),
                (5, 'dispur', 5),
                (6, 'Thiruvanthpuram', 4),
                (7, 'bangalore', 3);



INSERT INTO zipcode (zipCode, city_id) 
                    VALUES (305001, 1),
                     (302001, 2),
                     (313001, 3),
                     (700001, 4),
                     (781005, 5),
                     (605036, 6);




select z.zipCode, c.city_name, s.state_name 
from zipcode z 
inner join city c on z.city_id = c.city_id 
inner join state s on c.state_id = s.state_id
order by s.state_name, c.city_name;
