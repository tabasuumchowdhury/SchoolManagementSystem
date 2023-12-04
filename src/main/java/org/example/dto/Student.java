package org.example.dto;
import lombok.*;

/**
 * @author tabasuum chowdhury
 * The students (max 200) a school contains with IDs.
 * All information stored, except classes.
 */
@ToString
public class Student {
    private static final int MAX_COURSE_NUM  = 5;
    private static int nextId = 1;

    private String fname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private String lname;
    private Department department;

    public Student(String fname, String lname, Department department) {
        for (; nextId <= 200; nextId++) {
            this.id = String.format("S%03d", nextId++);
        }
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.courseNum = 0;
        this.courses = new Course[MAX_COURSE_NUM];
        String name = fname + lname;
    }
}
