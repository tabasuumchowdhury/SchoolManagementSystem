package org.example.dto;
import lombok.*;

@ToString
public class Student {
    private String fname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private int nextId;
    private String lname;
    private Department department;

    String name = fname + lname;
}
