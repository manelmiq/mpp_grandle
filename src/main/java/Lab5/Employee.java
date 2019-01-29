package Lab5;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public abstract class Employee {
    private int employeeId;
    private List<Paycheck> paycheckList;

    public Employee() {
        this.employeeId = (int) (Math.random() % 100);
        this.paycheckList = new ArrayList<>();
    }

    public abstract double calcGrossPay(DateRange dateRange);

    public Paycheck calcCompensation(int month, int year) {
        GregorianCalendar startDate = new GregorianCalendar(year, month, 1);
        GregorianCalendar endDate =  new GregorianCalendar( year, month, 1);
        endDate.add(GregorianCalendar.MONTH, 1);
        endDate.add(GregorianCalendar.DAY_OF_MONTH, -1);
        DateRange dateRange = new DateRange(startDate, endDate);
        double grossSalary = this.calcGrossPay(dateRange);
        double fica = grossSalary * 0.23;
        double state = grossSalary * 0.05;
        double local = grossSalary * 0.01;
        double medicare = grossSalary * 0.03;
        double ssn = grossSalary * 0.075;
        Paycheck paycheck = new Paycheck(fica, grossSalary, state, local, medicare, ssn, dateRange);
        paycheckList.add(paycheck);
        return paycheck;
    }

    public abstract void print();
}
