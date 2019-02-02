package Lab2;

public class Staff extends Person {
    private double salary;

    public Staff(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
    }


    public double getSalary(){
        return  salary;
    }
}
