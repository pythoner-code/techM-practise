CREATE TABLE student (
    Rollno NUMBER(4) PRIMARY KEY,
    StudentName VARCHAR2(20) NOT NULL,
    Standard VARCHAR2(2) NOT NULL,
    Date_Of_Birth DATE,
    Fees NUMBER(9,2)
);
