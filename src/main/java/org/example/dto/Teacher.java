package org.example.dto;
import lombok.*;

/**
 * @author tabasuum chowdhury
 * The teachers (max 20) of a school with IDs.
 */
@ToString
@Getter
@Setter
public class Teacher {
    private static int nextId = 1;
    private String fname;
    private String lname;
    private Department department;
    private String id;

    public Teacher(String fname, String lname, Department department) {
        this.id = String.format("T%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
        this.department = department;
    }
}
