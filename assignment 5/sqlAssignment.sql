select * from course;
select * from subject;
update course set description='B. Tech' where id=3002;
create table subject(sid int auto_increment primary key, description varchar(100), cid int references course(id));
insert into subject(description,cid) values ('Maths',1);
insert into subject(description,cid) values ('Physics',1);
insert into subject(description,cid) values ('Chemistry',1);
insert into subject(description,cid) values ('Computer Science',1);
insert into subject(description,cid) values ('Biology',1);
update subject set cid=1 where cid = 3002;

insert into subject(description,cid) values ('Accounts',2);
insert into subject(description,cid) values ('Finance',2);
insert into subject(description,cid) values ('Financial Planning',2);

insert into subject(description,cid) values ('History',3);
insert into subject(description,cid) values ('Geography',3);
insert into subject(description,cid) values ('Economics',3);
insert into subject(description,cid) values ('Pol Science',3);

insert into subject(description,cid) values ('Compiler Design',4);
insert into subject(description,cid) values ('Networking',4);
insert into subject(description,cid) values ('Machine Learning',4);
insert into subject(description,cid) values ('Data Structures',4);

create table Professor(pid int auto_increment primary key, name varchar(100), sub_id int references subject(sid));

select * from professor;

insert into professor(name, sub_id) values ('Aniket',4);
insert into professor(name, sub_id) values ('Roy',4);
insert into professor(name, sub_id) values ('Ram',4);
insert into professor(name, sub_id) values ('Anil',1);
insert into professor(name, sub_id) values ('Eshan',1);
insert into professor(name, sub_id) values ('Syed',2);
insert into professor(name, sub_id) values ('Nishi',2);
insert into professor(name, sub_id) values ('Sunidha',2);
insert into professor(name, sub_id) values ('Urmila',3);
insert into professor(name, sub_id) values ('Nahida',3);
insert into professor(name, sub_id) values ('Arnab',3);
insert into professor(name, sub_id) values ('Ashwin',3);
insert into professor(name, sub_id) values ('Yasmin',6);
insert into professor(name, sub_id) values ('Tushar',6);
insert into professor(name, sub_id) values ('Wasim',6);
insert into professor(name, sub_id) values ('Geeta',7);
insert into professor(name, sub_id) values ('Santanu',7);
insert into professor(name, sub_id) values ('Nishita',8);
insert into professor(name, sub_id) values ('Sam',9);
insert into professor(name, sub_id) values ('Ishita',9);
insert into professor(name, sub_id) values ('Tiya',10);
insert into professor(name, sub_id) values ('Kunal',13);
insert into professor(name, sub_id) values ('Lavanya',13);
insert into professor(name, sub_id) values ('Utsav',14);
insert into professor(name, sub_id) values ('Joydeep',15);
insert into professor(name, sub_id) values ('Nilakshi',15);
insert into professor(name, sub_id) values ('Bidisha',16);
insert into professor(name, sub_id) values ('Dixita',16);
insert into professor(name, sub_id) values ('Arya',16);

select * from professor p , subject s where p.sub_id=s.sid and s.sid=4;


