/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.Dao.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PSO
 */
public class StudentCourse {
    
    private int stud_id;
    private String first_name;
    private String last_name;
    private Date date_of_birth;
    private double tuition_fees;
    private int course_id;
    private String title;
    private String stream;
    private String type;
    private Date start_date;
    private Date end_date;

    public StudentCourse() {
    }

    public StudentCourse(int stud_id, String first_name, String last_name, Date date_of_birth, double tuition_fees, int course_id, String title, String stream, String type, Date start_date, Date end_date) {
        this.stud_id = stud_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.tuition_fees = tuition_fees;
        this.course_id = course_id;
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
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

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "StudentCourse{" + "stud_id=" + stud_id + ", first_name=" + first_name + ", last_name=" + last_name + ", date_of_birth=" + date_of_birth + ", tuition_fees=" + tuition_fees + ", course_id=" + course_id + ", title=" + title + ", stream=" + stream + ", type=" + type + ", start_date=" + start_date + ", end_date=" + end_date + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
