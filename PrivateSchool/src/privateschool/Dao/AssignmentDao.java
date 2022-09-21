/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package privateschool.Dao;

import java.util.List;
import privateschool.Dao.Models.Assignment;
import java.sql.SQLException;

/**
 *
 * @author PSO
 */
public interface AssignmentDao {
    
       
    Assignment selectAssign(int assignment_id );
    
    List<Assignment> selectAllAssignments();
    
    boolean insertAssignment(Assignment assignment) throws SQLException;
    
}
