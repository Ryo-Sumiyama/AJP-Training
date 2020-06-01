create database TASK_DB;

CREATE TABLE T_USER (
  USER_ID varchar(12) NOT NULL, 
  USER_NM  varchar(10)NOT NULL,
  PASSWORD varchar(8)NOT NULL,
  OFFICE_CD varchar(4)NOT NULL ,
  BIRTHDAY datetime,
  SENIORITY  int(2),
  DELET_FLG varchar (1)NOT NULL DEFAULT '0',
  PRIMARY KEY (USER_ID)
)