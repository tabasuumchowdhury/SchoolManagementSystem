package org.example.dto;
import lombok.*;

/**
 * @author tabasuum chowdhury
 * The students (max 200) a school contains with IDs.
 * All information stored, except classes.
 */
@ToString
public class Student {
    private String fname;
    private Course[] courses = new Course[5];
    private String studentId;
    private int courseNum;
    private String lname;
    private Department department;
    private static int nextId;

    public Student(String fname, String lname, Department department) {
        for (nextId = 1; nextId <= 200; nextId++) {
            this.studentId = String.format("S%03d", nextId++);
        }
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        String name = fname + lname;
    }
}
