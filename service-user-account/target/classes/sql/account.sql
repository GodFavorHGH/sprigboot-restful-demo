create table account(
    id int not null auto_increment,
    name varchar(32) not null,
    userid int not null,
    type varchar(4) not null,
    status char(1) not null,
    balance decimal(16,2) default 0,
    primary key pk_id(id),
    index idx_uid(userid)
);
