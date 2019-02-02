package Lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends Person  implements  Comparable<Student> {
    private double gpa;
    private List<Course> listCourses;

    public Student(String name, String phone, int age, double gpa){
        super(name, phone, age);
        this.gpa = gpa;
        listCourses = new ArrayList<>();
    }
    public void addCourse(Course course){
        listCourses.add(course);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<Course> getListCourses() {
        return listCourses;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Double.compare(student.getGpa(), getGpa()) == 0 &&
                Objects.equals(getListCourses(), student.getListCourses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGpa(), getListCourses());
    }

    public void setListCourses(List<Course> listCourses) {
        this.listCourses = listCourses;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("\tClass " + this.getClass().getSimpleName())
                .append("\tname: "+name)
                .append("\tphone: "+phone)
                .append("\tage: "+age)
                .toString();
//        return super.toString();
    }
}














