create user 'shop-user'@' localhost' identified by 'Shop123';
grant all privileges on shopdb.* to 'shop-user'@'localhost';
flush privileges;