/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package privateschool.Dao;

import privateschool.Dao.Models.Course;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author PSO
 */
public interface CourseDao {
    
     // create or insert Student
    boolean insertCourse(Course course) throws SQLException;
        
    //select Student by id
    Course selectCourse(int course_id);


    //select all Courses
    List<Course> selectAllCourses();

    //delete course
    boolean deleteCourse(int course_id) throws  SQLException;
    
}
