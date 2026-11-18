--liquibase formatted sql

--changeset seongha:insert-loan-data
INSERT INTO LOAN (BOOK_ID, MEMBER_ID, DUE_AT)
VALUES (1, 1, DATEADD('DAY', 14, CURRENT_TIMESTAMP));