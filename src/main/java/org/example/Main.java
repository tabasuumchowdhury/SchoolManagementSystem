package org.example;

import org.example.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem1 = new SchoolManagementSystem();
        Course course1 = new Course("Intro to prog", 2, "compSci");
        Department department1 = new Department("compSci");
        Teacher teacher1 = new Teacher("Yi", "Wang", "compSci");
        Student student1 = new Student("Tab", "Chow", "compSci");
        schoolManagementSystem1.addDepartment("CompSci");
        schoolManagementSystem1.addCourse("Intro to prog");
        schoolManagementSystem1.addTeacher("Yi", "Wang", "compSci");
        schoolManagementSystem1.addStudent("Tab", "Chow", "compSci");
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