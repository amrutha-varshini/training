create database mini_care;
use mini_care;
create table users(role char(6),
					fname varchar(20) not null,
					lname varchar(20) not null,
					userID varchar(20) not null,
					pwd char(6) not null,
					phno char(13) not null,
					zip char(5) not null,
					title varchar(20),
					descr varchar(300),
					lastactive timestamp,
					status boolean,
					primary key(userID));

create table Seeker(id int not null AUTO_INCREMENT,
					userID varchar(20) not null,
					title varchar(20) not null,
					descr varchar(300) not null,
					foreign key(userID) references users(userID))
					primary key(id));
	
create table job_status(id int not null,
						userID varchar(20) not null,
						status boolean,
						foreign key(userID) references users(userID))
						foreign key(id) references Seeker(id));