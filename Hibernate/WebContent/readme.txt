create table user(
	userid int primary key,
	userName varchar(30),
	userPwd varchar(30),
	rodxid int
);

CREATE TABLE S16.user1
(
  userid    REF NUMBER,
  userName  VARCHAR2(30),
  userPwd   VARCHAR2(30),
  rodxid    NUMBER
)

LOGGING 
NOCACHE
NOPARALLEL
NOMONITORING;


ALTER TABLE S16.user1 ADD (
  PRIMARY KEY
 (userid));