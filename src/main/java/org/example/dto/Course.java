package org.example.dto;
import lombok.*;

/**
 * @author tabasuum chowdhury
 * The courses (max 30) offered by a school, with IDs,
 * which are later assigned to 1 teacher and
 * can be registered by a maximum of 5 students.
 */
@ToString
public class Course {
    private double credit;
    private String courseId;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    int MAX_STUDENT_NUM = 5;
}
