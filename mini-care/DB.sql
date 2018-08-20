create database mini_care;
use mini_care;
create table users(id int not null auto_increment,
					role char(6),
					fname varchar(20) not null,
					lname varchar(20) not null,
					email varchar(20) not null,
					pwd char(6) not null,
					phno char(13) not null,
					zip char(5) not null,
					address_line1 varchar(20) not null,
					address_line2 varchar(20) not null,
					city varchar(20) not null,
					state varchar(20) not null,
					lastactive timestamp,
					status enum("ACTIVE","INACTIVE"),
					primary key(id));

create table seeker_job(id int not null auto_increment,
					userID int not null,
					title varchar(20) not null,
					descr varchar(300) not null,
					foreign key(userID) references users(id),
					primary key(id));
					
create table sitter(id int not null auto_increment,
					userID int not null,
					title varchar(20),
					descr varchar(300),
					foreign key(userID) references users(id),
					primary key(id));
	
create table job_status(id int not null,
						userID varchar(20) not null,
						status boolean,
						foreign key(userID) references users(userID))
						foreign key(id) references Seeker(id));