/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package privateschool.Dao;

import java.util.List;
import privateschool.Dao.Models.Trainer;
import privateschool.Dao.Models.TrainersCourse;


/**
 *
 * @author PSO
 */
public interface TrainerCourseDao {
    
    List<TrainersCourse> TrainerCourse(int course_id);
        
    
}
