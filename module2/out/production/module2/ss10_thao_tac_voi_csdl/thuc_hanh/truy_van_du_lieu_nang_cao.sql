select productcode, productname,buyprice,quantityInStock from products
where buyPrice > 56.76 and quantityInStock > 10;
select productcode, productname,buyprice,textDescription
from products
inner join productlines
on products.productLine = productlines.productLine
where buyPrice > 56.76 and buyPrice < 95.59;
select productcode,productname,buyprice,quantityinstock,productvendor,productline
from products
where productline = 'classic cars' or productVendor = 'min lin diecast';