CREATE DATABASE SA;
--EMAIL MAY BE UNIQUE WITH THE TERM 'UNIQUE'
CREATE TABLE CLIENT (
    ID integer primary key not null AUTO_INCREMENT,
    EMAIL varchar(100)
);

CREATE TABLE RATING (
    ID integer primary key not null AUTO_INCREMENT,
    COMMENT varchar(100),
    TYPE varchar(10),
    CLIENT_ID integer,
    CONSTRAINT client_fk FOREIGN KEY (CLIENT_ID) REFERENCES CLIENT(ID)
);