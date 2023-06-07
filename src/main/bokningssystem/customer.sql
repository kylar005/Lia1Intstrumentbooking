create table customer
(
    customerID int auto_increment
        primary key,
    firstName  varchar(25) not null,
    lastName   varchar(25) not null,
    address    varchar(25) not null,
    email      varchar(50) not null,
    password   varchar(25) not null
);

