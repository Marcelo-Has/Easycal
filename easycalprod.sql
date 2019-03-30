create database easycalprod;
use easycalprod;

create table produtos (
  id int primary key auto_increment,
  referencia varchar(30) not null,
  descricao varchar(255) not null,
  preco float,
  tipo varchar(15) not null);


select*from produtos;


create table materiais (
  id int primary key auto_increment,
  descricao varchar(255) not null,
  preco float not null,
  tipo varchar(15) not null);

select*from materiais;