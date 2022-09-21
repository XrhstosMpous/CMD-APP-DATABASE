-- A list of all the students--
select * from student;

-- A list of all the trainers --
select * from trainer;

-- A list of all the assignments
select * from assignment;

-- A list of all the courses
select * from course;

-- All the students per course
select c.course_id,c.title, c.stream, c.type, c.start_date,c.end_date from student s join student_course sc
on s.stud_id=sc.stud_id
join course c 
on sc.course_id=c.course_id;

-- All the trainers per course
select t.first_name,t.last_name,t.subject,c.title,c.stream,c.type,c.start_date,c.end_date from trainer t join trainer_course tr
on t.trainer_id=tr.trainer_id
join course c on tr.course_id=c.course_id;

-- All the assignments per course--
	select c.title,c.stream,c.type,a.title,a.description,a.oral_mark,a.total_mark  from assignment a join course_assignment ca 
    on a.assignment_id=ca.assignment_id
    join course c on ca.course_id=c.course_id; 
    
    -- All the assignments per course per student--
    select s.first_name,s.last_name,c.title,c.stream,c.type,a.title,a.description from student s join student_assignment sa
    on s.stud_id=sa.stud_id
    join course c on sa.course_id=c.course_id
    join assignment a on a.assignment_id=sa.assignment_id;
    
    -- A list of students that belong to more than one course--
SELECT  sc.stud_id,first_name,s.last_name,s.date_of_birth,COUNT(*) AS Courses
FROM student s
JOIN student_course sc
ON s.stud_id=sc.stud_id
GROUP BY sc.stud_id
HAVING courses>1;