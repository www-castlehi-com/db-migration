--liquibase formatted sql

--changeset seongha:insert-member-seed
INSERT INTO MEMBER (NAME, EMAIL) VALUES ('김영희', 'younghee@example.com');
INSERT INTO MEMBER (NAME, EMAIL) VALUES ('이철수', 'cheolsu@example.com');

--changeset seongha:insert-book-seed-2
INSERT INTO BOOK (TITLE, AUTHOR, CATEGORY) VALUES ('데미안', '헤르만 헤세', 'NOVEL');
INSERT INTO BOOK (TITLE, AUTHOR, CATEGORY) VALUES ('원피스', '오다 에이이치로', 'COMIC');
