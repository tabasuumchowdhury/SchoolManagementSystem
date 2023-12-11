package org.example.dto;
import lombok.*;

/**
 * @author tabasuum chowdhury
 * The courses (max 30) offered by a school, with IDs,
 * which are later assigned to 1 teacher and
 * can be registered by a maximum of 5 students.
 */
@Setter
@Getter
public class Course {
    private static int nextId = 1;
    private static final int MAX_STUDENT_NUM  = 5;
    private int studentNum;

    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private Teacher teacher;
    private String courseName;

    public Course(String courseName, double credit, Department department) {
        this.id = String.format("C%03d", nextId++);
        this.credit = credit;
        this.courseName = courseName;
        this.department = department;
        this.teacher = null;
        this.students = new Student[MAX_STUDENT_NUM];
        this.studentNum = 0;
    }

    public void setNewStudent(Student newStudent) {
        for (Student student : students) {
            if (student != null && student.getId() == newStudent.getId()) {
                System.out.println("Student has already registered for course, register course for student failed");
                return;
            }
        }
        students[++studentNum] = newStudent;
    }

    @Override
    public String toString() {
        String courseStr = "Course{" +
                "studentNum=" + studentNum +
                ", credit=" + credit +
                ", id='" + id + '\'' +
                ", students=[";

        if (students[1] != null) {
            for (Student student : students) {
                if (student != null) {
                    courseStr += student.getFname() + " " + student.getLname() + ", ";
                }
            }
        }

        courseStr += "], department=" + department;
        if (teacher != null) {
            courseStr += ", teacher=" + teacher.getFname() + " " + teacher.getLname();
        } else {
            courseStr += ", teacher=null";
        }
        courseStr += ", courseName='" + courseName + '\'' + '}';
        return courseStr;
    }
}
