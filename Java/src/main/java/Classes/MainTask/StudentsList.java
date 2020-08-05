package Classes.MainTask;

//Создать массив объектов. Вывести:
//        a) список студентов заданного факультета;
//        b) списки студентов для каждого факультета и курса;
//        c) список студентов, родившихся после заданного года;
//        d) список учебной группы.

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentsList {
    private List<Student> studentsList = new ArrayList<>();

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void getStudentsByFaculty(String faculty) {
        System.out.println("List of students of the Faculty of " + faculty + ":");
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st.toString());
            }
        }
    }

    public void getStudentsByFacultyAndCourse(String faculty, int course) {
        System.out.println("List of students of the Faculty of " + faculty + " course " + course + ":");
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty) & st.getCourse() == course) {
                System.out.println(st.toString());
            }
        }
    }

    public void getStudentsByFacultyAndCourse(String faculty) {
        System.out.println("List of students of the Faculty of " + faculty + " of all courses:");
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st.toString());
            }
        }
    }

    public void getStudentsByFacultyAndCourse(int course) {
        System.out.println("List of students of all faculties, course " + course + ":");
        for (Student st : studentsList) {
            if (st.getCourse() == course) {
                System.out.println(st.toString());
            }
        }
    }

    public void getStudentsByYearOfBirth(Date date) {
        System.out.println("List of students who were born after " + date + ":");
        for (Student st : studentsList) {
            if (st.getDate().after(date)) {
                System.out.println(st.toString());
            }
        }
    }

    public void getStudentsByGroupNumber(long group) {
        System.out.println("List of students in the group " + group + ":");
        for (Student st : studentsList) {
            if (st.getGroup() == group) {
                System.out.println(st.fullName());
            }
        }
    }
}

