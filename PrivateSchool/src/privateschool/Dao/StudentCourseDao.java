/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package privateschool.Dao;

import java.util.List;
import privateschool.Dao.Models.Course;

/**
 *
 * @author PSO
 */
public interface StudentCourseDao {
    
    List<Course> StudentsPerCourse(int stud_id);
    
    
}
