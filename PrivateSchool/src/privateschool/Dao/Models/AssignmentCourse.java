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
public class AssignmentCourse {
    
    private int assignment_id;
    private String title;
    private String description;
    private Date sub_date_time;
    private double oral_mark;
    private double total_mark;
    private int course_id;
    private String ctitle;
    private String cstream;
    private String Ctype;
    private Date cstart_date;
    private Date cend_date;

    public AssignmentCourse() {
    }

    public AssignmentCourse(int assignment_id, String title, String description, Date sub_date_time, double oral_mark, double total_mark, int course_id, String ctitle, String cstream, String Ctype, Date cstart_date, Date cend_date) {
        this.assignment_id = assignment_id;
        this.title = title;
        this.description = description;
        this.sub_date_time = sub_date_time;
        this.oral_mark = oral_mark;
        this.total_mark = total_mark;
        this.course_id = course_id;
        this.ctitle = ctitle;
        this.cstream = cstream;
        this.Ctype = Ctype;
        this.cstart_date = cstart_date;
        this.cend_date = cend_date;
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

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCtitle() {
        return ctitle;
    }

    public void setCtitle(String ctitle) {
        this.ctitle = ctitle;
    }

    public String getCstream() {
        return cstream;
    }

    public void setCstream(String cstream) {
        this.cstream = cstream;
    }

    public String getCtype() {
        return Ctype;
    }

    public void setCtype(String Ctype) {
        this.Ctype = Ctype;
    }

    public Date getCstart_date() {
        return cstart_date;
    }

    public void setCstart_date(Date cstart_date) {
        this.cstart_date = cstart_date;
    }

    public Date getCend_date() {
        return cend_date;
    }

    public void setCend_date(Date cend_date) {
        this.cend_date = cend_date;
    }

    @Override
    public String toString() {
        return "AssignmentCourse{" + "assignment_id=" + assignment_id + ", title=" + title + ", description=" + description + ", sub_date_time=" + sub_date_time + ", oral_mark=" + oral_mark + ", total_mark=" + total_mark + ", course_id=" + course_id + ", ctitle=" + ctitle + ", cstream=" + cstream + ", Ctype=" + Ctype + ", cstart_date=" + cstart_date + ", cend_date=" + cend_date + '}';
    }
    
    
    
    
    
    
}
