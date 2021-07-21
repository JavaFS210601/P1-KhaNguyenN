




create table reimbursement (


reim_id int serial primary key,
reim_amount int,
reimb_submitted timestamp,
reimb_resolved timestamp,
reimb_description varchar (250),
--reimb_receipt blob,
reimb_author int,
reimb_resolver int,
reimb_status_id int,
reimb_type_id int,



users_fk_auth int references users(users_id),
users_fk_reslvr int references users(users_id),
reimbursement_status_fk int references reimbursement_status(reimb_status_id),
reimbursement_type_fk int references reimbursement_type(reimb_type_id)
);
insert into reimbursement (reim_id, reim_amount, reimb_submitted, reimb_resolved,
reimb_description, reimb_author, reimb_resolver, reimb_status_id, reimb_type_id) values 
('123456', '2000',current_timestamp, current_timestamp, 'food', 456789, 456789, 0 , 0 );



create table reimbursement_status(

reimb_status_id int not null,
reimb_status varchar(10),
constraint reim_status_pk primary key (reimb_status_id)
);


create table reimbursement_type (

reimb_type_id int not null,
reimb_type varchar(10),
constraint reim_type_pk primary key (reimb_type_id));

create table user_roles (
user_role_id int not null,
user_role varchar(10),
constraint user_roles_pk primary key (user_role_id));

create table users(
users_id int,
username varchar(50),
password varchar(50),
first_name varchar(100),
last_name varchar(100),
user_email varchar(150),
user_role_id int,

constraint users_pk primary key (users_id),

user_roles_fk int references user_roles(user_role_id));

--Values for the table of users
insert  into users (users_id, username, password, first_name, last_name, user_email, user_role_id) 
values (456789, 'Dave123', 'password', 'Dave', 'Davidson', 'dave@dadavid', 2),
		(123456, 'John456', '123456', 'John', 'Johnson', 'john@jojohn', 1),
		(654321, 'Kate789', 'abcdef', 'Kate', 'Kateson', 'kate@kitkat', 1);
--Values for the reimbursement
insert into reimbursement (reim_id, reim_amount, reimb_submitted, reimb_resolved,
reimb_description, reimb_author, reimb_resolver, reimb_status_id, reimb_type_id) values 
('1', '2000',current_timestamp, current_timestamp, 'food', 123456, 456789, 1 , 1 ),
('2', '300', current_timestamp, current_timestamp, 'lodging', 123456, 456789, 1, 2),
('3', '150' , current_timestamp, current_timestamp, 'travel', 456878, 456789, 1, 3 ),
('4', '1200', current_timestamp, current_timestamp, 'other' , 654321, 456789, 1, 4);


--drop table reimbursement_status;
drop table users;
drop table reimbursement;
select  * from reimbursement where reimb_status_id = 1;

select * from users where username = 'Dave123' and password ='password' and user_role_id = 2;