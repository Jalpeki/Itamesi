drop database if exists Itarian;
create database Itarian;
use Itarian;

create table user(
id int not null auto_increment primary key,
user_name varchar(255),
user_kana varchar(255),
password varchar(255),
gernder enum('male','female'),
email varchar(255),
credit_number varchar(4),
credit_token varchar(255),

postal_code varchar(8),
address varchar(100),
cell_number varchar(15)
);

insert into user values
(1,"テスト1","テスト","12341234","male","test1@gmail.com","1234","12345678","277000","東京","09000000001"),
(2,"テスト2","テスト","12341234","male","test2@gmail.com","1234","12345678","277000","東京","09000000002"),
(3,"テスト3","テスト","12341234","male","test3@gmail.com","1234","12345678","277000","東京","09000000003"),
(4,"テスト4","テスト","12341234","male","test4@gmail.com","1234","12345678","277000","東京","09000000004"),
(5,"テスト5","テスト","12341234","male","test5@gmail.com","1234","12345678","277000","東京","09000000005");


drop table if exists admin;
create table admin(
id int(11) not null auto_increment,
admin_id varchar(25) unique,
password varchar(255) not null,
primary key(id)
);

insert into admin values
(1,"1","admin01"),
(2,"2","admin02"),
(3,"3","admin03");

drop table if exists items;
create table items(

item_id int primary key not null auto_increment,
item_name varchar(100) not null,
explanation varchar(100) not null,
price int not null,
item_stock int not null,
img_path varchar(255) not null
);

drop table if exists history;
create table history(

sales_id int primary key not null auto_increment,
id int not null,
item_name varchar(100),
number_of_items int not null,
purchase_date datetime not null,
postal_code varchar(8),
address varchar(100)
);



drop table if exists cart;
create table cart(
cart_id int primary key not null auto_increment,
id int not null,
item_id int not null,
number_of_items int not null
);
