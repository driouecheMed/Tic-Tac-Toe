create database TicTacToe;

create table player(
	id int (10) not null,
	username varchar (10) not null,
	password varchar (20) not null,
	numberOfMatchPlayed int (20) not null,
	score int (20) not null,
	primary key (id)
)engine = innodb;

