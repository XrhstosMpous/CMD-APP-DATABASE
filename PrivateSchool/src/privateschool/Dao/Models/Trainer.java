/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao.Models;

/**
 *
 * @author PSO
 */
public class Trainer {
    
    private int trainer_id;
    private String first_name;
    private String last_name;
    private String subject;

    public Trainer() {
    }

    public Trainer(int trainer_id, String first_name, String last_name, String subject) {
        this.trainer_id = trainer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.subject = subject;
    }

    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Trainer{" + "trainer_id=" + trainer_id + ", first_name=" + first_name + ", last_name=" + last_name + ", subject=" + subject + '}';
    }
    
    
    
}
