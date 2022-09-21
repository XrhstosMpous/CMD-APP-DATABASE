/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao;

import java.util.ArrayList;
import java.util.List;
import privateschool.Dao.Models.Assignment;
import privateschool.DbUtils.DbCon;
import java.sql.*;
import privateschool.Dao.Models.AssignmentCourse;
import privateschool.Dao.Models.TrainersCourse;
import java.sql.Date;
/**
 *
 * @author PSO
 */
public class AssignmentCourseImp implements AssignmentCourseDao{

    @Override
    public List<AssignmentCourse> AssignmentsPerCourse(String ctitle) {
        List<AssignmentCourse> list =new ArrayList();
        Connection con = DbCon.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null; 
        String sql="select a.title,a.description,a.sub_date_time,a.oral_mark,a.total_mark,c.title,c.stream,c.type,c.start_date,c.end_date  from assignment a join course_assignment ca \n" +
"    on a.assignment_id=ca.assignment_id\n" +
"    join course c on ca.course_id=c.course_id";
        
         try {
            ps = DbCon.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                AssignmentCourse ac = new AssignmentCourse();
                ac.setTitle(rs.getString(1));
                ac.setDescription(rs.getString(2));
                ac.setSub_date_time(rs.getDate(3));
                ac.setOral_mark(rs.getFloat(4));
                ac.setTotal_mark(rs.getFloat(5));
                ac.setCtitle(rs.getString(6));
                ac.setCstream(rs.getString(7));
                ac.setCtype(rs.getString(8));
                ac.setCstart_date(rs.getDate(9));
                ac.setCend_date(rs.getDate(10));
                
              
                list.add(ac);
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
