use javadb;

drop table if exists room;

create table if not exists room (
rno varchar(4) primary key,
guest_name varchar(100),
guest_tel varchar(20) not null,
guest_age int(3),
guest_gen tinyint(1),
is_empty tinyint(1) default 0,
check_in_time datetime, 
check_out_time datetime
);