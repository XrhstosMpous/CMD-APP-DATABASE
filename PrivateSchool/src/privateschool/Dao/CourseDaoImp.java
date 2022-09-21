/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao;


import java.util.List;
import privateschool.Dao.Models.Course;
import privateschool.DbUtils.DbCon;
import java.sql.SQLException;
import java.util.List;
import privateschool.DbUtils.DbCon;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author PSO
 */
public class CourseDaoImp implements CourseDao {

    @Override
    public boolean insertCourse(Course course) throws SQLException {
       DbCon.getConnection();
       PreparedStatement ps = null;
       String sql = "insert into course values (?,?,?,?,?,?)";
       try {
            ps = DbCon.getConnection().prepareStatement(sql);

            
            ps.setString(1, course.getTitle());
            ps.setString(2, course.getStream());
            ps.setString(3, course.getType());
            ps.setDate(4,(Date)course.getStart_date());
            ps.setDate(5, (Date)course.getEnd_date());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;     
    }

    @Override
    public Course selectCourse(int course_id) {
       DbCon.getConnection();
       PreparedStatement ps = null;
       ResultSet rs = null;
       String sql = "select * from course where course_id=?";
       try {
            ps = DbCon.getConnection().prepareStatement(sql);
            ps.setInt(1, course_id);

            rs = ps.executeQuery();

            if (rs.next()) {
                Course cour = new Course();
                cour.setCourse_id(rs.getInt(1));
                cour.setTitle(rs.getString(2));
                cour.setStream(rs.getString(3));
                cour.setType(rs.getString(4));
                cour.setStart_date(rs.getDate(5));
                cour.setEnd_date(rs.getDate(6));

                return cour;
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        
        
    }

    @Override
    public List<Course> selectAllCourses() {
        List<Course> list = new ArrayList<Course>();
        Connection con = DbCon.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from course";
        
        try {
            ps = DbCon.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Course cour = new Course();
                cour.setCourse_id(rs.getInt(1));
                cour.setTitle(rs.getString(2));
                cour.setStream(rs.getString(3));
                cour.setType(rs.getString(4));
                cour.setStart_date(rs.getDate(5));
                cour.setEnd_date(rs.getDate(6));
                
                list.add(cour);
            }
            } catch (SQLException e) {
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
        return list;
        
    }

    @Override
    public boolean deleteCourse(int course_id) throws SQLException {
        DbCon.getConnection();
        PreparedStatement ps = null;
        String sql = "delete from student where stud_id=?";
        try {
            ps = DbCon.getConnection().prepareStatement(sql);

            ps.setInt(1, course_id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
        
    }
    
    
    
    
}
