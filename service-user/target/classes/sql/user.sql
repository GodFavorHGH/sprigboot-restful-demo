create table user(
                     id int not null auto_increment,
                     name varchar(32) not null,
                     id_no varchar(30) not null,
                     id_type varchar(4) not null,
                     phone varchar(16) not null,
                     status char(1) not null default 'N',
                     primary key(id),
                     unique index idx_id_no(id_no),
                     unique index idx_phone(phone)
);

