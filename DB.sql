create database mini_care;
use mini_care;
create table users(id int(255) not null auto_increment,
					role varchar(255),
					fname varchar(255),
					lname varchar(255),
					email varchar(255)  ,
					pwd varchar(255)  ,
					phno varchar(255)  ,
					zip varchar(255)  ,
					address_line1 varchar(255)  ,
					address_line2 varchar(255)  ,
					city varchar(255)  ,
					states varchar(255)  ,
					last_active timestamp,
					status enum("ACTIVE","INACTIVE"),
					primary key(id));

create table seeker_job(id int(255) not null auto_increment,
					userID int(255)  ,
					title varchar(255)  ,
					descr varchar(255)  ,
					foreign key(userID) references users(id),
					primary key(id));
					
create table sitter(id int(255) not null, 
					title varchar(255),
					descr varchar(255),
					foreign key(id) references users(id),
					primary key(id));
	
create table job_status(jobid int(255) not null,
						userid int(255) not null,
						foreign key(userid) references users(id),
						foreign key(jobid) references seeker_job(id),
						primary key(userid,jobid));