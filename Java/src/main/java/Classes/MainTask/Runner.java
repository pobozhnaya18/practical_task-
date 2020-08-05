package Classes.MainTask;

import java.util.Calendar;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {

        Student.Address address = new Student.Address("Minsk", "st. Sverdlov", 1, 5);
        Date date1 = new Date(98, Calendar.FEBRUARY, 1);
        Student st1 = new Student("Ахрамович", "Ирена", "Иосифовна", date1,
                "+375335667712", "Infocommunications", 1, 123);
        Date date2 = new Date(97, Calendar.MAY, 12);
        Student st2 = new Student("Гаврилова", "Анна", "Андреевна", date2,
                "+375335667713", "Computer Systems and Networks", 2, 321);
        Date date3 = new Date(96, Calendar.AUGUST, 10);
        Student st3 = new Student("Горлов", "Александр", "Валерьевич", date3,
                "+375335667714", "Computer-aided Design", 3, 231);
        Date date4 = new Date(99, Calendar.OCTOBER, 4);
        Student st4 = new Student("Давыдов", "Алекс", "Андреевич", date4,
                "+375335667715", "Infocommunications", 1, 123);
        Date date5 = new Date(98, Calendar.MAY, 3);
        Student st5 = new Student("Жданович", "Артём", "Кириллович", date5,
                "+375335667716", "Computer Systems and Networks", 2, 321);
        Date date6 = new Date(98, Calendar.FEBRUARY, 7);
        Student st6 = new Student("Кабариха", "Виктор", "Александрович", date6,
                "+375335667717", "Computer-aided Design", 3, 231);
        Date date7 = new Date(96, Calendar.DECEMBER, 3);
        Student st7 = new Student("Кожемякин", "Павел", "Николаевич", date7,
                "+375335667718", "Infocommunications", 1, 123);
        Date date8 = new Date(97, Calendar.AUGUST, 15);
        Student st8 = new Student("Мошко", "Алексей", "Александрович", date8,
                "+375335667719", "Computer Systems and Networks", 2, 321);
        Date date9 = new Date(98, Calendar.MAY, 23);
        Student st9 = new Student("Науменко", "Даниил", "Константинович", date9,
                "+375335667720", "Computer-aided Design", 3, 231);
        Date date10 = new Date(98, Calendar.FEBRUARY, 5);
        Student st10 = new Student("Пархоменко", "Артем", "Иванович", date10,
                "+375335667721", "Infocommunications", 1, 123);
        Date date11 = new Date(97, Calendar.JUNE, 12);
        Student st11 = new Student("Писчик", "Алексей", "Сергеевич", date11,
                "+375335667722", "Computer Systems and Networks", 2, 321);
        Date date12 = new Date(96, Calendar.DECEMBER, 14);
        Student st12 = new Student("Тагиев", "Вадим", "Назимович", date12,
                "+375335667723", "Computer-aided Design", 3, 231);
        Date date13 = new Date(99, Calendar.OCTOBER, 13);
        Student st13 = new Student("Шульга", "Александр", "Владимирович", date13,
                "+375335667724", "Infocommunications", 1, 123);
        Date date14 = new Date(98, Calendar.OCTOBER, 11);
        Student st14 = new Student("Шухова", "Анастасия", "Сергеевна", date14,
                "+375335667725", "Computer Systems and Networks", 2, 321);

        StudentsList newList = new StudentsList();
        newList.addStudent(st1);
        newList.addStudent(st2);
        newList.addStudent(st3);
        newList.addStudent(st4);
        newList.addStudent(st5);
        newList.addStudent(st6);
        newList.addStudent(st7);
        newList.addStudent(st8);
        newList.addStudent(st9);
        newList.addStudent(st10);
        newList.addStudent(st11);
        newList.addStudent(st12);
        newList.addStudent(st13);
        newList.addStudent(st14);
        newList.addStudent(st5);
        newList.addStudent(st3);

        //список студентов заданного факультета
        newList.getStudentsByFaculty("Computer Systems and Networks");
        //списки студентов для каждого факультета и курса
        newList.getStudentsByFacultyAndCourse("Infocommunications", 1);
        //список студентов, родившихся после заданного года
        Date my_date = new Date(97, Calendar.JANUARY, 0);
        newList.getStudentsByYearOfBirth(my_date);
        //список учебной группы.
        newList.getStudentsByGroupNumber(231);
    }
}
