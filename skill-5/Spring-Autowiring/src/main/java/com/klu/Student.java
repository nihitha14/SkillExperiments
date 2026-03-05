package com.klu;

public class Student {

    private int studentId;
    private String studentName;
    private String gender;
    private Course course;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void display() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Gender : " + gender);
        System.out.println("Course : " + course);
    }
}