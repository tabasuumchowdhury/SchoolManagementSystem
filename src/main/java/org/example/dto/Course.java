package org.example.dto;
import lombok.*;

/**
 * @author tabasuum chowdhury
 * The courses (max 30) offered by a school, with IDs,
 * which are later assigned to 1 teacher and
 * can be registered by a maximum of 5 students.
 */
@Setter
@Getter
@ToString
public class Course {
    private static int nextId = 1;
    private static final int MAX_STUDENT_NUM  = 5;
    private int studentNum = 0;

    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private Teacher teacher;
    private String courseName;

    public Course(String courseName, double credit, Department department) {
        this.id = String.format("C%03d", nextId++);
        this.credit = credit;
        this.courseName = courseName;
        this.department = department;
        this.teacher = null;
        this.students = new Student[MAX_STUDENT_NUM];
        this.studentNum = 0;
    }
}
