create database Sporty_shoes;
use Sporty_shoes;
create table admin(email varchar(50),password varchar(70));
insert into admin values("main@gmail.com","main@100");
select * from admin;

create table products(productId int,productName Varchar(40),productPrice int(40),productDiscription varchar(200));
insert into products values (1,"Allen cooper",1499,"Sports shoes for men ");
insert into products values (2,"Bourge",899,"Running shoes for men ");
insert into products values (3,"Asian",890,"Walking shoes for men ");
select * from products;

create table purchase_info(purchaseId int ,purchaseProductName varchar(30),purchaseUserEmail varchar(30),purchaseDate varchar(30),
purchasePrice int(20));
insert into purchase_info values(1,"Allen cooper","pradiprane@gmail.com","30-10-2009",1499);
insert into purchase_info values(2,"Bourge","ramgosavi@gmail.com","09-10-2020",899);
insert into purchase_info values(3,"Asian","omkar@gmail.com","07-11-2009",890);
select * from purchase_info;

create table  users(usersId int(10),usersName varchar(30),usersEmail varchar(30),usersAge int(10),usersGender varchar(10),
usersAddress varchar(100));
insert into users values(1,"Pradip","pradiprane@gmail.com",28,"male","Banglore");
insert into users values(2,"Ram","ramgosavi@gmail.com",29,"male","Bombay");
insert into users values(3,"Omkar","omkar@gmail.com",30,"male","Hydrabad");
select * from user;