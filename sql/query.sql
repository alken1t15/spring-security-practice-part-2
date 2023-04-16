CREATE TABLE users (
  id SERIAL4 PRIMARY KEY,
  email varchar(255),
  password varchar(255),
  first_name varchar(255),
  last_name varchar(255),
  role varchar(255),
  status varchar(255)
  );