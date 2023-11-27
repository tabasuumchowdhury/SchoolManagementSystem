package org.example.dto;
import lombok.*;

/**
 * @author tabasuum chowdhury
 * The teachers (max 20) of a school with IDs.
 */
@ToString
public class Teacher {
    private String fname;
    private String lname;
    private Department department;
    private String teacherId;

    String name = fname + lname;
}
