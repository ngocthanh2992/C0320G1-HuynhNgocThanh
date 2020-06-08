categoriesCreate database bt_db;
create table categories(
id int not null auto_increment primary key,
name varchar(50) not null
);
create table suppliers(
id int not null auto_increment primary key,
name varchar(50) not null,
phone varchar(50) not null unique,
address varchar(50) not null
);
create table customers(
id int not null auto_increment primary key,
name varchar(50) not null,
phone varchar(50) not null unique,
address varchar(50) not null,
email varchar(50) unique
);
create table employees(
id int not null auto_increment primary key,
name varchar(50) not null,
birthday date,
phone varchar(50) not null unique,
address varchar(50) not null,
email varchar(50) unique
);
create table orders(
id int not null auto_increment primary key,
status varchar(50) not null,
payment varchar(50) not null,
customer_id int not null,
employee_id int,
foreign key (customer_id) references customers(id),
foreign key (employee_id) references employees(id)
);
create table products(
id int not null auto_increment primary key,
name varchar(50) not null,
price varchar(50) not null,
imagine varchar(50),
discount int,
stock int,
category_id int not null,
supplier_id int not null,
foreign key (category_id) references categories(id),
foreign key (supplier_id) references suppliers(id)
);
create table orderdetails(
product_id int not null,
order_id int not null,
quantity int not null,
primary key (product_id, order_id),
foreign key (product_id) references products(id),
foreign key (order_id) references orders(id)
);
#categories record
insert into categories(id,name) values (1,'laptop'),(2,'phone'),(3,'tablet'),(4,'accessories'),(5,'watch');
#supplier records
insert into suppliers(id,name,phone,address) values (1,'apple','0123456789','usa');
insert into suppliers(id,name,phone,address) values (2,'samsung','0111111111','korea');
insert into suppliers(id,name,phone,address) values (3,'Vingroup','0999999999','vietnam');
insert into suppliers(id,name,phone,address) values (4,'DanielWellington','0222222222','sweden');
insert into suppliers(id,name,phone,address) values (5,'Orient','0333333333','japan');
insert into suppliers(id,name,phone,address) values (6,'Tissot','044444444','switzerland');
insert into suppliers(id,name,phone,address) values (7,'Dell','0911111111','usa');
insert into suppliers(id,name,phone,address) values (8,'Lenovo','0849999999','usa');
#customer records
insert into customers(id,name,phone,address,email) values (1, 'Duy', '0948574835', 'da nang','duy@gmail.com');
insert into customers(id,name,phone,address,email) values (2, 'Hai', '0596624456', 'da nang','hai@gmail.com');
insert into customers(id,name,phone,address,email) values (3, 'Tuan',  '0436573456', 'quang nam','tuan@gmail.com');
insert into customers(id,name,phone,address,email) values (4, 'Truong', '0964523167', 'quang nam','truong@gmail.com');
insert into customers(id,name,phone,address,email) values (5, 'Tam', '0945387734', 'quang nam','tam@gmail.com');
insert into customers(id,name,phone,address,email) values (6, 'Thuan', '0995332185',  'da nang','thuan@gmail.com');
insert into customers(id,name,phone,address,email) values (7, 'Hung', '0112785734',  'da nang','hung@gmail.com');
insert into customers(id,name,phone,address,email) values (8, 'Viet',  '0444927534',  'quang nam','viet@gmail.com');
insert into customers(id,name,phone,address,email) values (9, 'Ngan', '0777473452', 'hue','ngan@gmail.com');
insert into customers(id,name,phone,address,email) values (10, 'Trinh', '0987164536', 'quang nam','trinh@gmail.com');
# employee records
insert into employees(id,name,birthday,phone,address,email) values (1, 'A', '1996-04-12', '0123456354', 'da nang', 'a@gmail.com');
insert into employees(id,name,birthday,phone,address,email) values (2, 'B', '1997-05-11', '0475837485',  'da nang','b@gmail.com');
insert into employees(id,name,birthday,phone,address,email) values (3, 'C', '1998-06-10', '0129375456', 'quang nam', 'c@gmail.com');
insert into employees(id,name,birthday,phone,address,email) values (4, 'D', '1995-07-19', '0985647543', 'quang nam', 'd@gmail.com');
insert into employees(id,name,birthday,phone,address,email) values (5, 'E', '1994-08-25', '0948735345', 'quang nam', 'e@gmail.com');
insert into employees(id,name,birthday,phone,address,email) values (6, 'F', '1996-07-12', '0704534724', 'da nang', 'f@gmail.com');
insert into employees(id,name,birthday,phone,address,email) values (7, 'G', '1997-09-11', '0564283745', 'da nang', 'g@gmail.com');
insert into employees(id,name,birthday,phone,address,email) values (8, 'H', '1996-02-29', '0162547576', 'quang nam', 'h@gmail.com');
insert into employees(id,name,birthday,phone,address,email) values (9, 'I', '1995-01-19', '0987447523', 'hue', 'i@gmail.com');
insert into employees(id,name,birthday,phone,address,email) values (10, 'J', '1992-01-23', '0999783643', 'quang nam', 'j@gmail.com');
#product records
insert into products(id,name,price,imagine,discount,stock,category_id,supplier_id) values (1, 'Iphone 11', '449', '', 5, 0, 2, 3);
insert into products(id,name,price,imagine,discount,stock,category_id,supplier_id) values (2, 'Thinkpad P1', '1500', '', 5, 10, 1, 8);
insert into products(id,name,price,imagine,discount,stock,category_id,supplier_id) values (3, 'Iphone X', '349', '', 10, 0, 2, 1);
insert into products(id,name,price,imagine,discount,stock,category_id,supplier_id) values (4, 'Samsung galaxy S20', '449', '', 10, 5, 2, 1);
insert into products(id,name,price,imagine,discount,stock,category_id,supplier_id) values (5, 'Vsmart joy 3', '150', '', 5, 6, 2, 3);
insert into products(id,name,price,imagine,discount,stock,category_id,supplier_id) values (6, 'Vsmart active 3', '200', '', 10, 7, 2, 3);
insert into products(id,name,price,imagine,discount,stock,category_id,supplier_id) values (7, 'Airpod 2', '349', '', 5, 6, 4, 1);
insert into products(id,name,price,imagine,discount,stock,category_id,supplier_id) values (8, 'Dell Xps 13', '1600', '', 0, 8, 1, 7);
insert into products(id,name,price,imagine,discount,stock,category_id,supplier_id) values (9, 'DW 1', '200', '', 0, 8, 5, 4);
insert into products(id,name,price,imagine,discount,stock,category_id,supplier_id) values (10, 'Tissot 1', '200', '', 0, 10, 5, 6);
#order records
insert into orders values (1, 'delivering', 'visa', 1, 1);
insert into orders values (2, 'preparing', 'visa', 2, 2);
insert into orders values (3,'pending', 'visa', 2, 3);
insert into orders values (4,'checking', 'visa', 3, 4);
insert into orders values (5, 'packing', 'cash', 4, 5);
insert into orders values (6, 'cancling', 'visa', 5, 6);
insert into orders values (7, 'delivering', 'visa', 6, 7);
insert into orders values (8, 'delivering', 'cash', 6, 8);
insert into orders values (9, 'preparing', 'visa', 8, 9);
insert into orders values (10, 'delivering', 'visa', 9, 10);
#order detail
insert into orderdetails values (1, 1, 2);
insert into orderdetails values (2, 2, 1);
insert into orderdetails values (3, 3, 2);
insert into orderdetails values (4, 4, 1);
insert into orderdetails values (5, 5, 1);
insert into orderdetails values (6, 6, 5);
insert into orderdetails values (7, 7, 1);
insert into orderdetails values (6, 8, 1);
insert into orderdetails values (7, 9, 2);
insert into orderdetails values (7, 10, 2);
