--liquibase formatted sql

--changeset seongha:create-book-group
CREATE TABLE BOOK_GROUP
(
    ID   BIGINT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(100) NOT NULL
);
INSERT INTO BOOK_GROUP (NAME) VALUES ('소설 모음');  -- NOT NULL 위반으로 일부러 실패