package Lab5;



public class Salaried extends Employee {

    public Salaried(double salary) {
        this.salary = salary;

    }

    private double salary;

    @Override
    public double calcGrossPay(DateRange dateRange) {
        return salary;
    }



    @Override
    public void print() {

    }
}
