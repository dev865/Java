mysql -ujavauser -pmysql

use javadb

drop table if exists product;

create table if not exists product (
pno int(11) auto_increment,
pname varchar(100) not null,
price int(10) not null,
regdate datetime default now(),
madeby varchar(50) not null,
primary key(pno)
);

desc product;

insert into product(pname, price, madeby)
values ('Test Product 1', 1234, 'Park');
insert into product(pname, price, madeby)
values ('Test Product 2', 2234, 'Kim');
insert into product(pname, price, madeby)
values ('Test Product 3', 1456, 'Lee');

select * from product;

select * from product where pno = 2;

update product
set price = 1234,
madeby = 'jung',
pname = 'Update Product 1',
regdate = now()
where pno = 3;

delete from product where pno = 1;

select * from product;