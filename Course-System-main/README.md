# -diligent-quiet-9486
<h4>Course monitoring -System
ther is two users in this System
Adminstrator
faculty<h4>

============================
<p>admin can performe these task :-
1:-course-related operations 
2:-batch-related operations 
3:-Faculty.-related operations 
4:-Allocate faculty to a batch  
5:-Course plan--related operations 
6:-View the Day wise update of every batch. 
7:-Generate Reports for every batch.
 8:-not to choose any option.</p>
===============================
<p>faculty can perform -
1:-View the Course Plan
2:-Fill up the day wise planner. 
3:-Update his/her password.
=============================
tech :- 
sql java 
 tools git Mysql sts</p>

<h5>+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| username | varchar(255) | YES  |     | NULL    |       |
| password | varchar(255) | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+

 desc course;
+-------------------+--------------+------+-----+---------+-------+
| Field             | Type         | Null | Key | Default | Extra |
+-------------------+--------------+------+-----+---------+-------+
| courseid          | int          | NO   | PRI | NULL    |       |
| courseName        | varchar(255) | YES  |     | NULL    |       |
| fee               | int          | YES  |     | NULL    |       |
| courseDescription | varchar(255) | YES  |     | NULL    |       |
+-------------------+--------------+------+-----+---------+-------+


mysql> desc faculty;
+----------------+-------------+------+-----+---------+-------+
| Field          | Type        | Null | Key | Default | Extra |
+----------------+-------------+------+-----+---------+-------+
| facultyid      | int         | NO   | PRI | NULL    |       |
| facultyname    | varchar(12) | YES  |     | NULL    |       |
| facultyaddress | varchar(12) | YES  |     | NULL    |       |
| mobile         | varchar(15) | YES  | UNI | NULL    |       |
| email          | varchar(12) | YES  | UNI | NULL    |       |
| username       | varchar(12) | YES  | UNI | NULL    |       |
| password       | varchar(12) | YES  | UNI | NULL    |       |
+----------------+-------------+------+-----+---------+-------+
7 rows in set (0.02 sec)

 desc  coursplan;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| planid    | int          | NO   | PRI | NULL    |       |
| batchid   | int          | YES  | MUL | NULL    |       |
| daynumber | int          | YES  |     | NULL    |       |
| topic     | varchar(255) | YES  |     | NULL    |       |
| status    | varchar(255) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+

desc batch;
+------------------+-------------+------+-----+---------+-------+
| Field            | Type        | Null | Key | Default | Extra |
+------------------+-------------+------+-----+---------+-------+
| batchid          | int         | NO   | PRI | NULL    |       |
| courseid         | int         | YES  | MUL | NULL    |       |
| facultyId        | int         | YES  | MUL | NULL    |       |
| numberofStudents | int         | YES  |     | NULL    |       |
| batchstartDate   | date        | YES  |     | NULL    |       |
| duration         | varchar(12) | YES  |     | NULL    |       |
+------------------+-------------+------+-----+---------+-------+</h5>
