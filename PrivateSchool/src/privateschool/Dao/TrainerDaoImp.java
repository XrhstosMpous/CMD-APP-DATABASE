/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import privateschool.Dao.Models.Trainer;
import privateschool.DbUtils.DbCon;
import java.util.List;

/**
 *
 * @author PSO
 */
public class TrainerDaoImp implements TrainerDao {

    @Override
    public Trainer selectTrainer(int trainer_id) {
        
        DbCon.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from trainer where trainer_id=?";
        try{
        ps = DbCon.getConnection().prepareStatement(sql);
        ps.setInt(1, trainer_id);
        rs = ps.executeQuery();
         if (rs.next()) {
               Trainer train=new Trainer(); 
               train.setTrainer_id(rs.getInt(1));
               train.setFirst_name(rs.getString(2));
               train.setLast_name(rs.getString(3));
               train.setSubject(rs.getString(4));
               
              return train;  
            }
        
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;        
    }

    @Override
    public List<Trainer> selectAllTrainers() {
        List<Trainer> list = new ArrayList<Trainer>();
        Connection con = DbCon.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from trainer";
        try{
          ps = DbCon.getConnection().prepareStatement(sql);
          rs = ps.executeQuery();
        while (rs.next()) {
                Trainer train = new Trainer();
                train.setTrainer_id(rs.getInt(1));
                train.setFirst_name(rs.getString(2));
                train.setLast_name(rs.getString(3));
                train.setSubject(rs.getString(4));
                

                list.add(train);
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
        return list;        
    }

    @Override
    public boolean insertTrainer(Trainer trainer) throws SQLException {
        
        DbCon.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into trainer values (?,?,?,?)";
        try {
            ps = DbCon.getConnection().prepareStatement(sql);

            ps.setInt(1,trainer.getTrainer_id());
            ps.setString(2, trainer.getFirst_name());
            ps.setString(3, trainer.getLast_name());
            ps.setString(4, trainer.getSubject());
            

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
        
        
    }
     
}  
    
    
    
    
    
    

