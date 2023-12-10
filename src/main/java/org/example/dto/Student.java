package org.example.dto;
import lombok.*;

/**
 * @author tabasuum chowdhury
 * The students (max 200) a school contains with IDs.
 * All information stored, except classes.
 */
@ToString
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

    public Student(String studentFname, String lname, Department department) {
        this.id = String.format("S%03d", nextId++);
        this.fname = studentFname;
        this.lname = lname;
        this.department = department;
        this.courseNum = 0;
        this.courses = new Course[MAX_COURSE_NUM];
        String name = fname + lname;
    }
}
