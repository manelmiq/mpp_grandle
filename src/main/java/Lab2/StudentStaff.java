package Lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentStaff extends Person {
    private double gpa;
    private double salary;
    private Date dateOfFirstClass;
    List<Course> listCourses;

    public StudentStaff(String name, String phone, int age, double gpa, double salary, Date dateOfFirstClass) {
        super(name, phone, age);
        this.gpa = gpa;
        this.salary = salary;
        this.dateOfFirstClass = dateOfFirstClass;
        listCourses = new ArrayList<>();
    }
    public void addCourse(Course course){
        listCourses.add(course);
    }

    public double getGpa(){
        return gpa;
    }
    public double getSalary(){
        return salary;
    }
}