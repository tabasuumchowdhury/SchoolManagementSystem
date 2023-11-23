package org.example.dto;
import lombok.*;

@ToString
public class Course {
    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    int MAX_STUDENT_NUM = 5;
}
