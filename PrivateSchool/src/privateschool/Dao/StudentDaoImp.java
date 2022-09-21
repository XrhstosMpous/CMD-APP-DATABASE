/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao;

import java.sql.SQLException;
import java.util.List;
import privateschool.Dao.Models.Student;
import privateschool.DbUtils.DbCon;
import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
/**
 *
 * @author PSO
 */
public class StudentDaoImp implements StudentDao {

    @Override
    public  boolean insertStudent(Student student) throws SQLException {
        
        DbCon.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into student values (?,?,?,?)";
        try {
            ps = DbCon.getConnection().prepareStatement(sql);

            ps.setString(1, student.getFirst_name());
            ps.setString(2, student.getLast_name());
            ps.setDate(3, (Date)student.getDate_of_birth());
            ps.setDouble(4, student.getTuition_fees());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

   

    @Override
    public Student selectStudent(int stud_id) {
        DbCon.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from student where stud_id=?";
        
        try {
            ps = DbCon.getConnection().prepareStatement(sql);
            ps.setInt(1, stud_id);

            rs = ps.executeQuery();

            if (rs.next()) {
                Student stud = new Student();
                stud.setStud_id(rs.getInt(1));
                stud.setFirst_name(rs.getString(2));
                stud.setLast_name(rs.getString(3));
                stud.setDate_of_birth(rs.getDate(4));
                stud.setTuition_fees(rs.getDouble(5));

                return stud;
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
        
    

    @Override
    public List<Student> selectAllUsers() {
        List<Student> list = new ArrayList<Student>();
        Connection con = DbCon.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from student";
        try {
            ps = DbCon.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Student stud = new Student();
                stud.setStud_id(rs.getInt(1));
                stud.setFirst_name(rs.getString(2));
                stud.setLast_name(rs.getString(3));
                stud.setDate_of_birth(rs.getDate(4));
                stud.setTuition_fees(rs.getDouble(5));

                list.add(stud);
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
    public boolean deleteStudent(int stud_id) throws SQLException {
        DbCon.getConnection();
        PreparedStatement ps = null;
        String sql = "delete from student where stud_id=?";
        try {
            ps = DbCon.getConnection().prepareStatement(sql);

            ps.setInt(1, stud_id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
    

