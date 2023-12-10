package org.example;

import org.example.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem1 = new SchoolManagementSystem();
        schoolManagementSystem1.addDepartment("compSci");
        schoolManagementSystem1.addCourse("Intro to prog", 4, "D001");
        schoolManagementSystem1.addTeacher("Yi", "Wang", "D001");
        schoolManagementSystem1.addStudent("Tab", "Chow", "D001");
        schoolManagementSystem1.findDepartment("D001");
        schoolManagementSystem1.findCourse("C001");
        schoolManagementSystem1.findStudent("S001");
        schoolManagementSystem1.findTeacher("T001");
        schoolManagementSystem1.modifyCourseTeacher("T001", "C001");
        schoolManagementSystem1.registerCourse("S001", "C001");
        schoolManagementSystem1.printCourses();
        schoolManagementSystem1.printDepartments();
        schoolManagementSystem1.printTeachers();
        schoolManagementSystem1.printStudents();
    }
}