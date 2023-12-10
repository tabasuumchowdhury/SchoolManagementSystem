package org.example.dto;
import lombok.*;




/**
 * @author tabasuum chowdhury
 * The Departments (max 5) of a school with IDs
 */
@ToString
@Getter
@Setter
public class Department {
    private static int nextId = 1;
    private String id;
    private String departmentName;

    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }
}
