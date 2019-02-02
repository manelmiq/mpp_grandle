package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String   Number ;
    private String   Title ;
    private int  units ;
    private Faculty faculty;

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Course(String number, String title, int unit, Person faculty) {
        Number = number;
        Title = title;
        units = unit;
        this.faculty = (Faculty)faculty;
    }
}
