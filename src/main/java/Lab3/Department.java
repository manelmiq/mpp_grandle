package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private String location;
    List<Position> positionList;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        positionList = new ArrayList<>();
    }

    public double getSalary() {
        double departmentSalary = 0;
        for (Position position : positionList) {
            departmentSalary += position.getSalary();
        }
        return departmentSalary;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addPosition(Position position1) {
        positionList.add(position1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department department = (Department) o;
        return Objects.equals(getLocation(), department.getLocation()) &&
                Double.compare(getSalary(), department.getSalary()) == 0 &&
                Objects.equals(getName(), department.getName());
    }


    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", positionList=" + positionList +
                '}';
    }

    public void print() {
        System.out.println(this.toString());
        for (Position position : positionList) {
            position.print();
        }
    }
}
