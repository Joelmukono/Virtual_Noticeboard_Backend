CREATE DATABASE noticeboard;
\c noticeboard;
CREATE TABLE users (userId SERIAL PRIMARY KEY,username VARCHAR,password VARCHAR);
CREATE TABLE comments (commentId SERIAL PRIMARY KEY,timecreated timestamp,commentText VARCHAR,noticeId INTEGER);
CREATE TABLE notice (noticeId SERIAL PRIMARY KEY,timecreated timestamp,title VARCHAR,noticeContent VARCHAR, userId INTEGER);
CREATE DATABASE noticeboard_test WITH TEMPLATE noticeboard;