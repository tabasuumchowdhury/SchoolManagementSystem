package org.example.dto;
import lombok.*;

/**
 * @author tabasuum chowdhury
 * The Departments (max 5) of a school with IDs
 */
@ToString
public class Department {
    private String departmentId;
    private static int nextId = 1;
    public String departmentName;

    public Department(String departmentName) {
        for (nextId = 1; nextId <= 5; nextId++) {
            this.departmentId = String.format("D%03d", nextId++);
        }
        this.departmentName = departmentName;
    }

}
