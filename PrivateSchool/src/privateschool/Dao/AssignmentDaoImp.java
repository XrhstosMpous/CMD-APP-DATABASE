/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao;

import java.util.List;
import privateschool.Dao.Models.Assignment;
import privateschool.DbUtils.DbCon;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Date;
 import java.sql.Timestamp;


/**
 *
 * @author PSO
 */
public class AssignmentDaoImp implements AssignmentDao {

    @Override
    public Assignment selectAssign(int assignment_id) {
       DbCon.getConnection();
       PreparedStatement ps = null;
       ResultSet rs = null;
       String sql = "select * from assignment where assignment_id=?";
       try {
            ps = DbCon.getConnection().prepareStatement(sql);
            ps.setInt(1, assignment_id);

            rs = ps.executeQuery();

            if (rs.next()) {
                Assignment ass = new Assignment();
                ass.setAssignment_id(rs.getInt(1));
                ass.setTitle(rs.getString(2));
                ass.setDescription(rs.getString(3));
                ass.setSub_date_time(rs.getDate(4));
                ass.setOral_mark(rs.getDouble(5));
                ass.setTotal_mark(rs.getDouble(6));

                return ass;
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Assignment> selectAllAssignments() {
       
         List<Assignment> list = new ArrayList<Assignment>();
        Connection con = DbCon.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from assignment";
        
        try {
            ps = DbCon.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Assignment ass = new Assignment();
                ass.setAssignment_id(rs.getInt(1));
                ass.setTitle(rs.getString(2));
                ass.setDescription(rs.getString(3));
                ass.setSub_date_time(rs.getDate(4));
                ass.setOral_mark(rs.getDouble(5));
                ass.setTotal_mark(rs.getDouble(6));
                
                list.add(ass);
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
    public boolean insertAssignment(Assignment assignment) throws SQLException {
        
         DbCon.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into assignment values (?,?,?,?,?,?)";
        try {
            ps = DbCon.getConnection().prepareStatement(sql);

            
            ps.setInt(1, assignment.getAssignment_id());
            ps.setString(2, assignment.getTitle());
            ps.setString(3, assignment.getDescription());
            ps.setDate(4, (Date) assignment.getSub_date_time());
            ps.setDouble(5,assignment.getOral_mark());
            ps.setDouble(6,assignment.getTotal_mark());
            
            

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    
    
}
