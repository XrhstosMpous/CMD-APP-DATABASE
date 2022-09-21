/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao;

import java.util.ArrayList;
import java.util.List;
import privateschool.Dao.Models.Trainer;
import java.sql.*;
import privateschool.Dao.Models.TrainersCourse;
import privateschool.DbUtils.DbCon;

/**
 *
 * @author PSO
 */
public class TrainerCourseImp implements TrainerCourseDao {

    @Override
    public List<TrainersCourse> TrainerCourse(int course_id) {
        List<TrainersCourse> list =new ArrayList();
        Connection con = DbCon.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null; 
        String sql="select t.first_name,t.last_name,t.subject,c.title,c.stream,c.type,c.start_date,c.end_date from trainer t join trainer_course tr\n" +
"on t.trainer_id=tr.trainer_id\n" +
"join course c on tr.course_id=c.course_id";
        
         try {
            ps = DbCon.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                TrainersCourse tr = new TrainersCourse();
                tr.setFirst_name(rs.getString(1));
                tr.setLast_name(rs.getString(2));
                tr.setSubject(rs.getString(3));
                
               
              
                list.add(tr);
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
    

