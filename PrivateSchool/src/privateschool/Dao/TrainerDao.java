/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package privateschool.Dao;


import java.util.List;
import privateschool.Dao.Models.Trainer;
import java.sql.SQLException;
/**
 *
 * @author PSO
 */
public interface TrainerDao {
    
    
    Trainer selectTrainer(int trainer_id);
    
    
    
    List<Trainer> selectAllTrainers();
    
    
    boolean insertTrainer(Trainer trainer) throws SQLException;
    
    
    
}
