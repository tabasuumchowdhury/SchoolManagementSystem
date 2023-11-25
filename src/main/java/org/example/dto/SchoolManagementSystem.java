package org.example.dto;

import org.example.dto.Course;
import org.example.dto.Department;
import org.example.dto.Student;
import org.example.dto.Teacher;

import java.util.Objects;

public class SchoolManagementSystem {

    /**
     * a) Adds a new department
     * The id is automatically created
     * @param departmentName the name of the department created
     */
    public static void addDepartment(String departmentName) {
    }

    /**
     * b) Adds a course
     * @param fname Student's first name
     * @param lname Student's last name
     * @param departmentName the department they're registered to
     */
    public static void addStudent(String fname, String lname, String departmentName) {
    }

    /**
     * c) Adds a new teacher to the school.
     * ID is automatically created.
     * @param fname teacher's first name
     * @param lname teache's last name
     * @param departmentName the department they're registered to.
     */
    public static void addTeacher(String fname, String lname, String departmentName){
    }

    /**
     * d) Adds a course
     * @param courseName the name of the course being added
     * @param credit the number of credits the course counts for
     * @param deparmentName the department the course is registered to.
     */
    public static void addCourse(String courseName, double credit, String deparmentName) {
    }

    /**
     * e) Displays all the departments of a school, that aren't null.
     */
    public static void printDepartments() {
    }

    /**
     * f) Displays all the student of a school, that aren't null
     * Displays if there are any courses or departments.
     */
    public static void printStudents() {
    }

    /**
     * g) Displays all the teachers of a school, that aren't null
     * Displays if there are any courses or departments.
     */
    public static void printTeachers(){
    }

    /**
     * h) Displays all the courses of a school, that aren't null
     * Displays if there are any teachers, students or departments.
     */
    public static void printCourses(){
    }

    /**
     * i) Searches for a department based on the departmentId.
     * @param departmentId used to find the department.
     * @return the department, or if there's no matches it returns null.
     */
    public static Department findDepartment(String departmentId){
        return null;
    }

    /**
     * j) Searches for a teacher based on the teacherId.
     * @param teacherId used to find the teacher.
     * @return the teacher, or if there's no matches it returns null.
     */
    public static Teacher findTeacher(String teacherId) {
        return null;
    }

    /**
     * k) Searches for a course based on the courseId.
     * @param courseId used to find the course.
     * @return the course, or if there's no matches it returns null.
     */
    public static Course findCourse(String courseId) {
        return null;
    }

    /**
     * l) Searches for a student based on the studentId.
     * @param studentId used to find the student.
     * @return the student, or if there's no matches it returns null.
     */
    public static Student findStudent(String studentId) {
        return null;
    }

    /**
     * m) Modifies the teacher of a course
     * @param teacherId teacher being assigned
     * @param courseId course assigned to
     */
    public static void modifyCourseTeacher(String teacherId, String courseId) {
    }

    /**
     * n) Registers a course for a student, but prints a message if any failure occurs.
     * @param studentId the student being registered.
     * @param courseId course that they're being registered to.
     */
    public static void registerCourse(String studentId, String courseId) {
    }
}
