create database mini_care;
use mini_care;
create table users(id int(10) not null auto_increment,
					role char(6),
					fname varchar(20) not null,
					lname varchar(20) not null,
					email varchar(20) not null,
					pwd char(6) not null,
					phno char(13) not null,
					zip char(5) not null,
					location address not null,
					last_active timestamp,
					status enum("ACTIVE","INACTIVE"),
					primary key(id));

create table address(id int(10) not null, 
					address_line1 varchar(20) not null,
					address_line2 varchar(20) not null,
					city varchar(20) not null,
					states varchar(20) not null,
					foreign key(id) references users(id),
					primary key(id));

create table seeker_job(id int(10) not null auto_increment,
					userID int(10) not null,
					title varchar(20) not null,
					descr varchar(300) not null,
					foreign key(userID) references users(id),
					primary key(id));
					
create table sitter(id int(10) not null, 
					title varchar(20),
					descr varchar(300),
					foreign key(id) references users(id),
					primary key(id));
	
create table job_status(seekerid int(10) not null,
						userid int(10) not null,
						foreign key(userid) references users(id),
						foreign key(seekerid) references seeker_job(id),
						primary key(userid,seekerid));