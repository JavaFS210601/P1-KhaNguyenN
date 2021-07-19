




create table reimbursement (


reim_id int,
reim_amount int,
reimb_submitted timestamp,
reimb_resolved timestamp,
reimb_description varchar (250),
--reimb_receipt blob,
reimb_author int,
reimb_resolver int,
reimb_status_id int,
reimb_type_id int,

constraint reimbursement_pk primary key (reim_id),

users_fk_auth int references users(users_id),
users_fk_reslvr int references users(users_id),
reimbursement_status_fk int references reimbursement_status(reimb_status_id),
reimbursement_type_fk int references reimbursement_type(reimb_type_id)




);

insert into reimbursement (reim_id, reim_amount, reimb_description) values (20 ,150, 'food' );

create table reimbursement_status(

reimb_status_id int not null,
reimb_status varchar(10),
constraint reim_status_pk primary key (reimb_status_id)
);


create table reimbursement_type (

reimb_type_id int not null,
reimb_type varchar(10),
constraint reim_type_pk primary key (reimb_type_id)

);

create table user_roles (
user_role_id int not null,
user_role varchar(10),
constraint user_roles_pk primary key (user_role_id)
);

create table users(
users_id int,
username varchar(50),
password varchar(50),
first_name varchar(100),
last_name varchar(100),
user_email varchar(150),
user_role_id int,

constraint users_pk primary key (users_id),

user_roles_fk int references user_roles(user_role_id)


);
--drop table reimbursement_status;
