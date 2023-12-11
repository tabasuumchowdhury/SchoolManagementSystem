package org.example;

import org.example.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem sMS1 = new SchoolManagementSystem();

        sMS1.addDepartment("compSci");
        sMS1.printDepartments();
        System.out.println(sMS1.findDepartment("D001") + "\n");

        sMS1.addTeacher("Yi", "Wang", "D001");
        sMS1.printTeachers();
        System.out.println(sMS1.findTeacher("T001" ) + "\n");

        sMS1.addStudent("Tab", "Chow", "D001");
        sMS1.printStudents();
        System.out.println(sMS1.findStudent("S001") + "\n");

        sMS1.addCourse("Intro to prog", 4, "D001");
        sMS1.modifyCourseTeacher("T001", "C001");
        sMS1.printCourses();
        System.out.println(sMS1.findCourse("C001") + "\n");

        sMS1.registerCourse("S001", "C001");
    }
}