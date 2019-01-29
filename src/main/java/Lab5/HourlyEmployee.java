package Lab5;

public class HourlyEmployee extends Employee {

    private double hourlyWage;
    private double hoursPerWeek;

    public HourlyEmployee(double hourlyWage, double hoursPerWeek) {
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(DateRange dateRange) {
        return hourlyWage * hoursPerWeek;
    }


    public void print() {

    }
}
