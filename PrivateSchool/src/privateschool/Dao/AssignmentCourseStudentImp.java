/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import privateschool.Dao.Models.AssignmentCourse;
import privateschool.Dao.Models.AssignmentCourseStudent;
import privateschool.DbUtils.DbCon;

/**
 *
 * @author PSO
 */
public class AssignmentCourseStudentImp implements AssignmentCourseStudentDao {

    @Override
    public List<AssignmentCourseStudent> AssignmentCourseStudent() {
        List<AssignmentCourseStudent> list =new ArrayList();
        Connection con = DbCon.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null; 
        String sql="select s.first_name,s.last_name,c.title,c.stream,c.type,a.title,a.description from student s join student_assignment sa\n" +
"    on s.stud_id=sa.stud_id\n" +
"    join course c on sa.course_id=c.course_id\n" +
"    join assignment a on a.assignment_id=sa.assignment_id";
        
         try {
            ps = DbCon.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                AssignmentCourseStudent acs = new AssignmentCourseStudent();
                acs.setFirst_name(rs.getString(1));
                acs.setLast_name(rs.getString(2));
                acs.setCtitle(rs.getString(3));
                acs.setCstream(rs.getString(4));
                acs.setCtype(rs.getString(5));
                acs.setTitle(rs.getString(6));
                acs.setDescription(rs.getString(7));
                
                
              
                list.add(acs);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
                 con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return  list;      
       
        
        
        
    }
    
}
