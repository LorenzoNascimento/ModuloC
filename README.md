Atividade aula 5 MySQL;

create database ecommerce
default character set utf8mb4
default collate utf8mb4_general_ci;

create table produtos (
id int not null auto_increment,
nome varchar(30),
preco decimal(5,2),
primary key(id)
)default charset = utf8mb4;

alter table produtos
add column descricao varchar(50) after nome;

desc produtos;

insert into produtos values
(default, 'Camiseta', 'Camiseta de algodão, Tamanho M', '29.90' );

select * from produtos;

alter table produtos
drop column descricao;

create table clientes (
id int not null auto_increment,
nome varchar(50),
primary key(id)
)default charset = utf8mb4;

alter table clientes
add column email varchar(50) first;

alter table clientes
add column telefone decimal (15) after nome;

desc clientes;

alter table clientes
modify column telefone int unsigned;

insert into clientes values
('seuze@gmail.com', default, 'Ze', '993142438');

select * from clientes;

alter table clientes
rename to usuarios;

select * from usuarios;

create database livraria
default character set utf8mb4
default collate utf8mb4_general_ci;

create table livros (
titulo varchar (50),
autor varchar(50),
ano_publicacao year
)default charset = utf8mb4;

alter table livros
add column id int not null auto_increment first,
add primary key (id);

alter table livros
add column estoque int default('0');

desc livros;
select * from livros;

insert into livros values
(default, 'Diario de um banana', 'banana', '2001', default),
(default, 'Diario de uma batida de banana', 'banana', '2008', '2'),
(default, 'Diario de uma melancia', 'banana', '2014', '28');

drop table if exists livros;

create database rh
default character set utf8mb4
default collate utf8mb4_general_ci;

create table funcionarios (
nome varchar (30),
cargo varchar(40),
salario decimal (6,2)
)default charset = utf8mb4;

alter table funcionarios
add column id int not null auto_increment first,
add primary key (id);

insert into funcionarios values
(default, 'Cleidemar', 'Caixa', '1262.52');

desc funcionarios;
select * from funcionarios;

alter table funcionarios
change column salario remuneracao decimal (6,2);

create database streaming
default character set utf8mb4
default collate = utf8mb4_general_ci;

create table series (
id int not null auto_increment,
titulo varchar(50) not null unique,
genero varchar(20),
num_temporadas int,
primary key (id)
) default charset = utf8mb4;

insert into series value
(default, 'Supernatural', 'ação', '9'),
(default, 'Roleta russa', 'Sobrevivencia', '5');

create database restaurante
default character set utf8mb4
default collate utf8mb4_general_ci;

create table pratos (
nome varchar (30),
descricao varchar (100),
preco int
) default charset = utf8mb4;

alter table pratos
add column id int not null auto_increment first,
add primary key (id);

alter table games
rename to games_que_gosto;

desc games_que_gosto;
select * from games_que_gosto;

alter table games_que_gosto
change column data_de_lancamento lancamento year;

drop table games_que_gosto;

create table games_que_gosto (
id int not null auto_increment,
nome varchar(50),
plataforma varchar(20),
genero varchar(20),
desenvolvedora varchar(50),
ano year,
primary key (id)
) default charset utf8mb4;

insert into games_que_gosto values
(default, 'Valorant', 'PC', 'Tiro', 'Riot Games', '2020'),
(default, 'Counter Strike 2', 'PC', 'Tiro', 'Valve', '2023'),
(default, 'GTA-V', 'PC', 'Tiro', 'Rockstar Games', '2013'),
(default, 'Euro Truck Simulator 2', 'PC', 'Simulação', 'SCS Software', '2012'),
(default, 'My Summer Car', 'PC', 'Simulação', 'Amistech Games', '2016'),
(default, 'Beamng Driver', 'PC', 'Simulação', 'BeamNG', '2013'),
(default, 'Dirt 2.0', 'PC', 'Corrida', 'Code Masters', '2019'),
(default, 'Subnautica', 'PC', 'Sobrevivencia', 'Krafton', '2014'),
(default, 'Subnautica Below Zero', 'PC', 'Sobrevivencia', 'Krafton', '2019'),
(default, 'Minecraft', 'PC', 'Sobrevivencia', 'Microsoft', '2011');

select * from games_que_gosto;


-- AULA 15

select * from antiquario;

select * from antiquario
where categoria like 'V%';

select * from antiquario
order by categoria desc;

select * from antiquario
where id = '4';

select * from antiquario
where ano < 2016;

select * from antiquario
where quantidade <= 20;

select * from antiquario
where quantidade between 10 and 30;

select * from antiquario
where ano between 1910 and 1940;

select categoria, ano from antiquario
where ano in('1910', '1940') or ('1930');

select * from antiquario
where ano < 1940 || quantidade < 50;

insert into professores values 
(default, 'Maria', 'Ciencias', '1100'),
(default, 'Maria Lucia', 'Matematica', '1300'),
(default, 'Maria Lucilane', 'Português', '1300');

select * from professores;

select * from professores
where nome like 'Maria%';

select * from alunos;

update alunos
set email = 'geraldo@gmail.com'
where id = '6';

insert into alunos values
(default, 'Geraldo', '2000-07-17', '1B', 'geraldo@gmail.com');

select count(*) from alunos
where id;

select max(salario) from professores;

select min(salario) from professores;

select avg(salario) from professores;
