create database car_db;
create table customers(
customer_number int not null primary key,
customer_name varchar(50) not null,
contact_lastname varchar(50) not null,
contact_fisrtname varchar(50) not null,
phone varchar(50) not null,
address_line1 varchar(50) not null,
address_line2 varchar(50),
city varchar(50) not null,
state varchar(50) not null,
postal_code varchar(15) not null,
country varchar(50) not null,
credit_limit float
);
create table orders(
order_number int not null primary key,
order_date date not null,
required_date date not null,
shipped_date date,
status varchar(15) not null,
comments text,
quantity_ordered int not null,
price_each float not null
);
create table payments(
customer_number int not null primary key,
check_number varchar(50) not null,
payment_date date not null,
amount float not null
);

