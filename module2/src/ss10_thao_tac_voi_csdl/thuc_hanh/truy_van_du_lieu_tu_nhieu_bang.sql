select customers.customerNumber , customerName, phone,paymentdate,amount from customers
inner join payments
on customers.customerNumber = payments.customerNumber
where city = 'las vegas';
select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from customers
left join orders
on customers.customerNumber = orders.customerNumber;
select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from customers LEFT JOIN orders
on customers.customerNumber = orders.customerNumber
where orderNumber is null;