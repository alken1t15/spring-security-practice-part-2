CREATE TABLE users (
  id SERIAL4 PRIMARY KEY,
  email varchar(255),
  password varchar(255),
  first_name varchar(255),
  last_name varchar(255),
  role varchar(255),
  status varchar(255)
  );

create table public.users (
                              id integer primary key not null,
                              email character varying(255) not null,
                              first_name character varying(50) not null,
                              last_name character varying(100) not null,
                              password character varying(255) not null,
                              role character varying(20) default 'USER',
                              status character varying(20) default 'ACTIVE'
);

