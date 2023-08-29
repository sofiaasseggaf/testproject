# SQL configs
SET SQL_MODE ='IGNORE_SPACE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';

# create database and use it
CREATE DATABASE IF NOT EXISTS konsumen_tb;
USE ecommjava;

# create the customer table
CREATE TABLE IF NOT EXISTS konsumen(
id       int unique key not null auto_increment primary key,
nama  varchar(255) null,
alamat    varchar(255) null,
kota  varchar(255) null,
provinsi     varchar(255) null,
tgl_registrasi varchar(255) null
status varchar(255) null
);

# insert default customers
INSERT INTO KONSUMEN(nama, alamat, kota, provinsi, tgl_registrasi, status) VALUES
                                                                   ('Sofia', 'Jl. Bandang', 'Jakarta Timur', 'DKI Jakarta', '12-12-2022', 'aktif');
