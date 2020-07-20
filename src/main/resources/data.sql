CREATE SCHEMA IF NOT EXISTS testdb;

DROP TABLE  IF EXISTS  car;

CREATE TABLE IF NOT EXISTS car (
 id INT AUTO_INCREMENT  PRIMARY KEY,
 build_date varchar(100) DEFAULT NULL,
 make varchar(100) DEFAULT NULL,
 model varchar(100) DEFAULT NULL,
 color varchar(255) DEFAULT NULL,
 number_of_doors varchar(255) DEFAULT NULL,
 engine_sie varchar(255) DEFAULT NULL
 
) ;

CREATE TABLE IF NOT EXISTS user (
 id INT AUTO_INCREMENT  PRIMARY KEY,
 name varchar(100) DEFAULT NULL,
 password varchar(100) DEFAULT NULL
) ;

--
INSERT INTO car (build_date, make,model, color,number_of_doors,  engine_sie) VALUES
 ('2018', 'BMW', '320i','Red', '2', 'Sedan'),
 ('2017', 'AUDI', 'Q8','White', '4', 'SUV'),
 ('2017', 'HONDA', 'JAZZ','White', '4', 'SUV'),
 ('2015', 'Mini', 'Cooper','White', '4', 'SUV'),
 ('2013', 'FORD', 'RANGER','White', '4', 'SUV'),
 ('2011', 'TOYOTA', 'CAROLA','White', '4', 'SUV'),
 ('2001', 'POLO', 'POLO','White', '4', 'SUV');
 
 INSERT INTO user (name, password) VALUES
 ('Reddy', 'Reddy'),
 ('Dean', 'Dean');


