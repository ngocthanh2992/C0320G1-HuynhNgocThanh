SELECT * FROM mydb.customers;
select customernumber,contactlastname,contactfirstname,phone,city
from customers
where contactFirstName = 'peter' and city = 'melbourne';
select customernumber,contactlastname,contactfirstname,phone,city
from customers
where contactFirstName like '%A%';
select customernumber,contactlastname,contactfirstname,phone,city
from customers
where customerNumber between 103 and 205;
select customernumber,contactlastname,contactfirstname,phone,city
from customers
where country in ('USA', 'France', 'Spain');
select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
where country = 'USA' or country = 'France';
select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
order by contactFirstName asc;
select customerNumber, contactlastname,contactfirstname,phone,city
from customers
order by contactfirstname desc
limit 10;
select count(country) as 'Số khách hàng sống ở France'
from customers
where country = 'France';
insert into customers(customernumber,customername,contactfirstname,contactlastname,phone,addressline1,city,country)
value (500,'agilelead','lan','trần','0978822683','hàm nghi','hà nội','việt nam');
update customers
set customername = 'Baane Mini Imports'
where customernumber = 103;
delete from customers
where city = 'nantes';
set sql_safe_updates = 0;