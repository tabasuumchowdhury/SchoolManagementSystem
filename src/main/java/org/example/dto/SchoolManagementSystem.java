package org.example.dto;
import lombok.*;

@Getter
@Setter
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENT_NUM = 5;
    private int departmentNum = 0;
    private Department[] departments;

    private static final int MAX_STUDENT_NUM = 200;
    private int studentNum = 0;
    private Student[] students;

    private static final int MAX_TEACHER_NUM = 20;
    private int teacherNum = 0;
    private Teacher[] teachers;

    private static final int MAX_COURSES_NUM = 30;
    private int courseNum = 0;
    private Course[] courses;

    public SchoolManagementSystem() {
        this.departments = new Department[MAX_DEPARTMENT_NUM];
        this.students = new Student[MAX_STUDENT_NUM];
        this.teachers = new Teacher[MAX_TEACHER_NUM];
        this.courses = new Course[MAX_COURSES_NUM];
    }

    /**
     * i) Searches for a department based on the departmentId.
     *
     * @param departmentId used to find the department.
     * @return the department, or if there's no matches it returns null.
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department != null) {
                if (departmentId.equals(department.getId())) {
                    return department;
                }
            }
        }
        return null;
    }

    /**
     * j) Searches for a teacher based on the teacherId.
     *
     * @param teacherId used to find the teacher.
     * @return the teacher, or if there's no matches it returns null.
     */
    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                if (teacherId.equals(teacher.getId())) {
                    return teacher;
                }
            }
        }
        return null;
    }

    /**
     * k) Searches for a course based on the courseId.
     *
     * @param courseId used to find the course.
     * @return the course, or if there's no matches it returns null.
     */
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course != null) {
                if (courseId.equals(course.getId())) {
                    return course;
                }
            }
        }
        return null;
    }

    /**
     * l) Searches for a student based on the studentId.
     *
     * @param studentId used to find the student.
     * @return the student, or if there's no matches it returns null.
     */
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student != null) {
                if (studentId.equals(student.getId())) {
                    return student;
                }
            }
        }
        return null;
    }

    /**
     * a) Adds a new department if limit has not been reached.
     * The id is automatically created.
     *
     * @param departmentName the name of the department created
     */
    public void addDepartment(String departmentName) {
        if (departmentNum < MAX_DEPARTMENT_NUM) {
            departments[departmentNum] = new Department(departmentName);
            System.out.printf("Add department %s successfully\n", departments[departmentNum++]);
        } else {
            System.out.println("Max department reached, add a new department failed.");
        }
    }

    /**
     * b) Adds a student if limit has not been reached.
     *
     * @param fname        Student's first name
     * @param lname        Student's last name
     * @param departmentId the department they're registered to
     */
    public void addStudent(String fname, String lname, String departmentId) {
        if (studentNum < MAX_STUDENT_NUM) {
            students[studentNum] = new Student(fname, lname, findDepartment(departmentId));
            System.out.printf(students[studentNum++] + " added successfully \n");
        } else {
            System.out.println("Max student reached, add a new student failed.");
        }
    }

    /**
     * c) Adds a new teacher to the school if limit has not been reached.
     * ID is automatically created.
     *
     * @param fname        teacher's first name
     * @param lname        teache's last name
     * @param departmentId the department they're registered to.
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        if (teacherNum < MAX_TEACHER_NUM) {
            teachers[teacherNum] = new Teacher(fname, lname, findDepartment(departmentId));
            System.out.printf(teachers[teacherNum++] + " added successfully \n");
        } else {
            System.out.println("Max teachers reached, add a new teacher failed.");
        }
    }

    /**
     * d) Adds a course if limit has not been reached
     *
     * @param courseName   the name of the course being added
     * @param credit       the number of credits the course counts for
     * @param departmentId the department the course is registered to.
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        if (courseNum < MAX_COURSES_NUM) {
            courses[courseNum] = new Course(courseName, credit, findDepartment(departmentId));
            System.out.printf(courses[courseNum++] + " added successfully \n");
        } else {
            System.out.println("Max courses reached, add a new course failed.");
        }
    }

    /**
     * e) Displays all the departments of a school, that aren't null.
     */
    public void printDepartments() {
        String departmentsStr = "";
        for (Department department : departments) {
            if (department != null) {
                departmentsStr += department;
            }
        }
        System.out.println(departmentsStr);
    }

    /**
     * f) Displays all the student of a school, that aren't null
     * Displays if there are any courses or departments.
     */
    public void printStudents() {
        String studentsStr = "";
        for (Student student : students) {
            if (student != null) {
                studentsStr += student;
            }
        }
        System.out.println(studentsStr);
    }

    /**
     * g) Displays all the teachers of a school, that aren't null
     * Displays if there are any courses or departments.
     */
    public void printTeachers() {
        String teachersStr = "";
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                teachersStr += teacher;
            }
        }
        System.out.println(teachersStr);
    }

    /**
     * h) Displays all the courses of a school, that aren't null
     * Displays if there are any teachers, students or departments.
     */
    public void printCourses() {
        String coursesStr = "";
        for (Course course : courses) {
            if (course != null) {
                coursesStr += course;
            }
        }
        System.out.println(coursesStr);
    }

    /**
     * m) Modifies the teacher of a course
     *
     * @param teacherId teacher being assigned
     * @param courseId  course assigned to
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        // registers teacher to a course if both Ids belong to an existing teacher and course
        if (findTeacher(teacherId) != null && findCourse(courseId) != null) {
            findCourse(courseId).setTeacher(findTeacher(teacherId));
            System.out.printf("%s teacher info updated successfully. \n", findCourse(courseId));
        }
        // prints message if courseId does not belong to a course
        if (findCourse(courseId) == null) {
            System.out.printf("Cannot find any course match with courseId %s, modify teacher for course %s failed. \n", courseId, courseId);
        }
        // prints message if teacherId does not belong to a teacher
        if (findTeacher(teacherId) == null) {
            System.out.printf("Cannot find any teacher match with teacherId %s, modify teacher for course %s failed.\n", teacherId, courseId);
        }
    }

    /**
     * n) Registers a course for a student, but prints a message if any failure occurs.
     *
     * @param studentId the student being registered.
     * @param courseId  course that they're being registered to.
     */
    public void registerCourse(String studentId, String courseId) {
        int numOfStudents = 0;
        int numOfRegisteredCourses = 0;

        // checks if the courseId belongs to a course
        if (findCourse(courseId) == null) {
            System.out.printf("Cannot find any course match with courseId %s, register student for course %s failed. \n", courseId, courseId);
            return;
        }
        // checks if the studentId belongs to a student
        if (findStudent(studentId) == null) {
            System.out.printf("Cannot find any student match with studentId %s, register student for course %s failed.\n", studentId, courseId);
            return;
        }

        // counts number of students in Students[] inside given course class
        for (Student student : findCourse(courseId).getStudents()) {
            if (student != null) {
                numOfStudents++;
            }
        }
        // checks if number of students has reached limit
        if (numOfStudents >= 5) {
            System.out.printf("Course %s has been fully registered, register %s for student %s failed.\n", courseId, courseId, studentId);
            return;
        }

        // counts number of courses in Course[] inside given student class
        for (Course course : findStudent(studentId).getCourses()) {
            if (course != null) {
                numOfRegisteredCourses++;
            }
        }
        // checks if number of registered courses has reached limit
        if (numOfRegisteredCourses >= 5) {
            System.out.printf("Student %s has already registered 5 courses, register course for student %s has failed.\n", studentId, studentId);
            return;
        }

        // registers student to course, course to student and prints updated info
        findStudent(studentId).setNewCourse(findCourse(courseId));
        findCourse(courseId).setNewStudent(findStudent(studentId));
        System.out.println("Student register course succesfully");
        System.out.printf("Latest course info: %s\n", courses);
        System.out.printf("Latest student info: %s\n", students);
    }
}
