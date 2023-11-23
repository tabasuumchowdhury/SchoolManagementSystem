package org.example.dto;
import lombok.*;

@ToString
public class Teacher {
    private String fname;
    private String lname;
    private Department department;
    private String id;

    String name = fname + lname;
}
