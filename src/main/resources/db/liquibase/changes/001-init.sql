--liquibase formatted sql

--changeset seongha:create-category
CREATE TABLE IF NOT EXISTS CATEGORY
(
    CODE          VARCHAR(50) PRIMARY KEY,
    NAME          VARCHAR(100) NOT NULL,
    DISPLAY_ORDER INT          NOT NULL
);

--changeset seongha:create-book
CREATE TABLE IF NOT EXISTS BOOK
(
    ID         BIGINT AUTO_INCREMENT PRIMARY KEY,
    TITLE      VARCHAR(255) NOT NULL,
    AUTHOR     VARCHAR(100) NOT NULL,
    CATEGORY   VARCHAR(50)  NOT NULL,
    CREATED_AT TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);

--changeset seongha:create-index-book-title
CREATE INDEX IDX_BOOK_TITLE ON BOOK (TITLE);

--changeset seongha:insert-category-seed
INSERT INTO CATEGORY (CODE, NAME, DISPLAY_ORDER)
VALUES ('NOVEL', '소설', 1);
INSERT INTO CATEGORY (CODE, NAME, DISPLAY_ORDER)
VALUES ('ESSAY', '에세이', 2);
INSERT INTO CATEGORY (CODE, NAME, DISPLAY_ORDER)
VALUES ('TECH', '기술서', 3);

--changeset seongha:insert-book-seed
INSERT INTO BOOK (TITLE, AUTHOR, CATEGORY)
VALUES ('토지', '박경리', 'NOVEL');