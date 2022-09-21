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
public class TrainersCourse {
    
    private int trainer_id;
    private String first_name;
    private String last_name;
    private String subject;
     private int course_id;
    private String title;
    private String stream;
    private String type;
    private Date start_date;
    private Date end_date;

    public TrainersCourse() {
    }

    public TrainersCourse(int trainer_id, String first_name, String last_name, String subject, int course_id, String title, String stream, String type, Date start_date, Date end_date) {
        this.trainer_id = trainer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.subject = subject;
        this.course_id = course_id;
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
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
        return "TrainersCourse{" + "trainer_id=" + trainer_id + ", first_name=" + first_name + ", last_name=" + last_name + ", subject=" + subject + ", course_id=" + course_id + ", title=" + title + ", stream=" + stream + ", type=" + type + ", start_date=" + start_date + ", end_date=" + end_date + '}';
    }
    
    
    
    
    
    
    
}
