package Lab2;

import java.util.ArrayList;
import java.util.List;


public class Faculty  extends  Person{
	double salary;
	List<Course> courseList;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(Course course){
	    courseList.add(course);
    }


    public Faculty(String name, String phone, int age, double salary){
        super(name, phone, age);
        this.salary = salary;
        courseList = new ArrayList<>();
    }

    public int getUnits(){
	    int totalUnits = 0;
	    for(Course course : courseList){
	        totalUnits += course.getUnits();
        }
	    return totalUnits;
    }
    public double getSalary(){
        return  salary;
    }

}
