/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao.Models;

import java.sql.Date;

/**
 *
 * @author PSO
 */
public class Student {
    
   private int stud_id;
    private String first_name;
    private String last_name;
    private Date date_of_birth;
    private double tuition_fees;


    public Student() {
    } 

    public Student(String first_name, String last_name, Date date_of_birth, double tuition_fees) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.tuition_fees = tuition_fees;
    }

    
    
    
    
    public Student(int stud_id, String first_name, String last_name, Date date_of_birth, double tuition_fees) {
        this.stud_id = stud_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.tuition_fees = tuition_fees;
    }

    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
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

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public double getTuition_fees() {
        return tuition_fees;
    }

    public void setTuition_fees(double tuition_fees) {
        this.tuition_fees = tuition_fees;
    }

    @Override
    public String toString() {
        return "Student{" + "stud_id=" + stud_id + ", first_name=" + first_name + ", last_name=" + last_name + ", date_of_birth=" + date_of_birth + ", tuition_fees=" + tuition_fees + '}';
    }
    
    
    
    
    
    
}
