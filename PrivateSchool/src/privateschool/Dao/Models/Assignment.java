/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao.Models;

import java.util.Date;

/**
 *
 * @author PSO
 */
public class Assignment {
    private int assignment_id;
    private String title;
    private String description;
    private Date sub_date_time;
    private double oral_mark;
    private double total_mark;

    public Assignment() {
    }

    public Assignment(int assignment_id, String title, String description, Date sub_date_time, double oral_mark, double total_mark) {
        this.assignment_id = assignment_id;
        this.title = title;
        this.description = description;
        this.sub_date_time = sub_date_time;
        this.oral_mark = oral_mark;
        this.total_mark = total_mark;
    }

    public int getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(int assignment_id) {
        this.assignment_id = assignment_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSub_date_time() {
        return sub_date_time;
    }

    public void setSub_date_time(Date sub_date_time) {
        this.sub_date_time = sub_date_time;
    }

    public double getOral_mark() {
        return oral_mark;
    }

    public void setOral_mark(double oral_mark) {
        this.oral_mark = oral_mark;
    }

    public double getTotal_mark() {
        return total_mark;
    }

    public void setTotal_mark(double total_mark) {
        this.total_mark = total_mark;
    }

    @Override
    public String toString() {
        return "Assignment{" + "assignment_id=" + assignment_id + ", title=" + title + ", description=" + description + ", sub_date_time=" + sub_date_time + ", oral_mark=" + oral_mark + ", total_mark=" + total_mark + '}';
    }
    
    
    
    
    
    
}
