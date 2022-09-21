/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package privateschool.Dao;


import java.sql.SQLException;
import java.util.List;
import privateschool.Dao.Models.Student;


/**
 *
 * @author PSO
 */
public interface StudentDao {
    
     
     boolean insertStudent(Student student) throws SQLException;
        
    
    Student selectStudent(int stud_id);


   
    List<Student> selectAllUsers();

    
    boolean deleteStudent(int stud_id) throws  SQLException;

}
