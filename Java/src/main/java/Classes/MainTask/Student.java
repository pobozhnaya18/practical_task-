package Classes.MainTask;

//Создать классы, спецификации которых приведены ниже.
//        Определить конструкторы и методы setТип(), getТип(), toString().
//        Определить дополнительно методы в классе, создающем массив объектов.
//        Задать критерий выбора данных и вывести эти данные на консоль.
//        В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.

import java.util.Date;

public class Student {
    private static int currentId;
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private Date date;
    private Address address;

    public static class Address {
        private String city;
        private String street;
        private int houseId;
        private int flatId;

        public Address() {
            this.city = "city";
            this.street = "street";
            this.houseId = 3;
            this.flatId = 6;
        }

        public Address(String city, String street, int houseId, int flatId) {
            this.city = city;
            this.street = street;
            this.houseId = houseId;
            this.flatId = flatId;
        }
    }

    private String phoneNumber;
    private String faculty;
    private int course;
    private long group;

    public Student() {
    }

    public Student(String surname, String name, String middleName, Date date,
                   String phoneNumber, String faculty, int course, long group) {
        currentId++;
        this.id = currentId;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(String surname, String name, String middleName, Date date, Address address,
                   String phoneNumber, String faculty, int course, long group) {
        currentId++;
        this.id = currentId;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.date = date;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(long group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getDate() {
        return date;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public long getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id =" + id +
                ", surname ='" + surname + '\'' +
                ", name ='" + name + '\'' +
                ", middleName ='" + middleName + '\'' +
                ", date =" + date +
                ", address =" + address +
                ", phoneNumber =" + phoneNumber +
                ", faculty ='" + faculty + '\'' +
                ", course =" + course +
                ", group =" + group +
                '}';
    }

    public String fullName() {
        return surname + " " + middleName + " " + name;
    }
}

