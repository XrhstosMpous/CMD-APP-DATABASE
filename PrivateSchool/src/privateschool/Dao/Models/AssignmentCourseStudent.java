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
public class AssignmentCourseStudent {
    
    private int assignment_id;
    private String title;
    private String description;
    private Date sub_date_time;
    private double oral_mark;
    private double total_mark;
    private String ctitle;
    private String cstream;
    private String Ctype;
    private Date cstart_date;
    private Date cend_date;
    private String first_name;
    private String last_name;
    private Date date_of_birth;
    private double tuition_fees;

    public AssignmentCourseStudent() {
    }

    public AssignmentCourseStudent(int assignment_id, String title, String description, Date sub_date_time, double oral_mark, double total_mark, String ctitle, String cstream, String Ctype, Date cstart_date, Date cend_date, String first_name, String last_name, Date date_of_birth, double tuition_fees) {
        this.assignment_id = assignment_id;
        this.title = title;
        this.description = description;
        this.sub_date_time = sub_date_time;
        this.oral_mark = oral_mark;
        this.total_mark = total_mark;
        this.ctitle = ctitle;
        this.cstream = cstream;
        this.Ctype = Ctype;
        this.cstart_date = cstart_date;
        this.cend_date = cend_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.tuition_fees = tuition_fees;
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
        return "AssignmentCourseStudent{" + "assignment_id=" + assignment_id + ", title=" + title + ", description=" + description + ", sub_date_time=" + sub_date_time + ", oral_mark=" + oral_mark + ", total_mark=" + total_mark + ", ctitle=" + ctitle + ", cstream=" + cstream + ", Ctype=" + Ctype + ", cstart_date=" + cstart_date + ", cend_date=" + cend_date + ", first_name=" + first_name + ", last_name=" + last_name + ", date_of_birth=" + date_of_birth + ", tuition_fees=" + tuition_fees + '}';
    }
    
    
    
    
    
    
}
