/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author USER
 */

    public class Course {
    private String courseCode;
    private int courseUnit;
    private String grade;

    public Course(String courseCode, int courseUnit, String grade) {
        this.courseCode = courseCode;
        this.courseUnit = courseUnit;
        this.grade = grade;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCourseUnit() {
        return courseUnit;
    }

    public String getGrade() {
        return grade;
    }
}
