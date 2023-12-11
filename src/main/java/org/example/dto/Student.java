package org.example.dto;
import lombok.*;

/**
 * @author tabasuum chowdhury
 * The students (max 200) a school contains with IDs.
 * All information stored, except classes.
 */
@Getter
@Setter
public class Student {

    private static int nextId = 1;
    private static final int MAX_COURSE_NUM = 5;
    private int courseNum = 0;

    private String fname;
    private Course[] courses;
    private String id;
    private String lname;
    private Department department;

    public Student(String fname, String lname, Department department) {
        this.id = String.format("S%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.courseNum = 0;
        this.courses = new Course[MAX_COURSE_NUM];
    }

    /**
     * adds a course to Course[]
     * @param newCourse course that is being added
     */
    public void setNewCourse (Course newCourse) {
        for (Course course : courses) {
            if (course != null && newCourse.getId() == course.getId()) {
                return;
            }
        }
        courses[++courseNum] = newCourse;
    }

    @Override
    public String toString() {
        String studentStr = "Student{" +
                "courseNum=" + courseNum  +
                ", name='" + fname + " " + lname + '\'' +
                ", courses=[";

        // checks if Course[] is empty and only adds courseName for courses that exist
        if (courses[1] != null) {
            for (Course course : courses) {
                if (course != null) {
                    studentStr += course.getCourseName() + ", ";
                }
            }
        }

        studentStr += "], id='" + id + '\'' +
                ", department=" + department +
                '}';
        return studentStr;
    }
}
