/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao;

import java.util.List;
import privateschool.Dao.Models.Student;
import privateschool.DbUtils.DbCon;
import java.sql.*;
import java.util.ArrayList;
import privateschool.Dao.Models.Course;
import privateschool.Dao.Models.StudentCourse;
/**
 *
 * @author PSO
 */
public class StudentCourseImp implements StudentCourseDao{

    @Override
    public List<Course> StudentsPerCourse(int stud_id) {
        List<Course> list =new ArrayList();
        Connection con = DbCon.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select c.course_id,c.title, c.stream, c.type, c.start_date,c.end_date from student s join student_course sc\n" +
"on s.stud_id=sc.stud_id\n" +
"join course c \n" +
"on sc.course_id=c.course_id where sc.stud_id = ?";     
        try {
            ps = DbCon.getConnection().prepareStatement(sql);
            ps.setInt(1, stud_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Course stCourse = new Course();
                stCourse.setCourse_id(rs.getInt(1));
                stCourse.setTitle(rs.getString(2));
                stCourse.setStream(rs.getString(3));
                stCourse.setType(rs.getString(4));
                stCourse.setStart_date(rs.getDate(5));
                stCourse.setEnd_date(rs.getDate(6));
                
              
                list.add(stCourse);
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
