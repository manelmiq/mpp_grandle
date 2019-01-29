package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    List<Department> departmentList;

    public double getSalary(){
        double companySalary = 0.0;
        for(Department department : departmentList) {
            companySalary += department.getSalary();
        }
        return  companySalary;
    }

    public void addDepartment(Department department){
        departmentList.add(department);
    }


    public Company(String name) {
        this.name = name;
        departmentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        for(Department department : departmentList){
            department.print();
        }
    }
}
