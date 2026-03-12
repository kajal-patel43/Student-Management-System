package studentsproject;

import java.io.Serializable;

public class Student implements Serializable {

    private int rollNo;
    private String name;
    private int age;
    private String course;
    private double marks;

    public Student(int rollNo, String name, int age, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo +
                " | Name: " + name +
                " | Age: " + age +
                " | Course: " + course +
                " | Marks: " + marks;
    }
}