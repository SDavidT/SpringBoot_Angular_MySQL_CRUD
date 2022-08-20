create database crud;
use crud;
create table libro(
	id int primary key AUTO_INCREMENT,
	nombre varchar (150),
    descripcion varchar(300),
    autor varchar(150),
    fecha date,
    ejemplares int,
    precio float (8.4)
);
insert into libro(nombre, descripcion, autor,fecha,ejemplares,precio)values("Libro1","nulo","Sergio","20220812",12,52);
insert into libro(nombre, descripcion, autor,fecha,ejemplares,precio)values("Libro2","nulo","David","20220812",11,42);
insert into libro(nombre, descripcion, autor,fecha,ejemplares,precio)values("Libro3","nulo","Sergio","20220812",13,52);
insert into libro(nombre, descripcion, autor,fecha,ejemplares,precio)values("Libro4","nulo","Sergio","20220812",13,52.45277);
select * from libro;


