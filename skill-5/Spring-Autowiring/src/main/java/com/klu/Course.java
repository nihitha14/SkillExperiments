package com.klu;

public class Course {

    private int id;
    private String course;
    private String dateOfCompletion;

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDateOfCompletion(String dateOfCompletion) {
        this.dateOfCompletion = dateOfCompletion;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", course=" + course +
               ", dateOfCompletion=" + dateOfCompletion + "]";
    }
}