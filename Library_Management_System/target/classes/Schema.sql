create sequence user_userId_sequence START WITH 1 INCREMENT BY 1;

create table user_info(
    userid number(10,0)primary key
    userName varchar2(255) not null,
    firstName varchar2(255),
    lastName varchar2(255),
    email varchar2(255),
    phone number(19),
    password varchar2(255),
    address varchar2(255),
    
  );

create sequence book_bookId_sequence START WITH 1 INCREMENT BY 1;

create table Book(
		id number(10,0) primary key,
		name varchar2(255),
		author varchar2(255),
		category varchar2(255),
		edition number(10,1)
				
);

create table book_user(
		id number(10,0) not null,
		userid  number(10,0) not null,
		FOREIGN KEY (id) REFERENCES Book(id),
		FOREIGN KEY (userid ) REFERENCES user_info(userid),
);
