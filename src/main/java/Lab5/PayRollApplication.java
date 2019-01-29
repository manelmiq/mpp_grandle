package Lab5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PayRollApplication {
    public static void main (String[] args){
        Employee  employee1 = new Salaried(1000);
        Employee  employee2 = new HourlyEmployee(1000, 20);
        Employee  employee3 = new Commissioned(0.07, 1000);
        GregorianCalendar date1 = new GregorianCalendar(2000, Calendar.FEBRUARY, 1);
        GregorianCalendar date2 = new GregorianCalendar(2000, Calendar.FEBRUARY, 29);
        GregorianCalendar date3 = new GregorianCalendar(2000, Calendar.MARCH, 2);
        Order order1 = new Order(1, date1, 1000  );
        Order order2 = new Order(2, date2, 1000  );
        Order order3 = new Order(3, date3, 1000  );
        ((Commissioned) employee3).addOrder(order1);
        ((Commissioned) employee3).addOrder(order2);
        ((Commissioned) employee3).addOrder(order3);


        GregorianCalendar startDate = new GregorianCalendar(2000, 1, 1);
        GregorianCalendar endDate =  new GregorianCalendar( 2000, 1, 1);
        endDate.add(GregorianCalendar.MONTH, 1);
        endDate.add(GregorianCalendar.DAY_OF_MONTH, -1);
        DateRange dateRange = new DateRange(startDate, endDate);

        boolean range1 = dateRange.isInRange(order1.getOrderDate());
        boolean range2 = dateRange.isInRange(order2.getOrderDate());
        boolean range3 = dateRange.isInRange(order3.getOrderDate());


        System.out.println(employee1.calcCompensation(1,2000 ));
        System.out.println(employee2.calcCompensation(1,2000 ));
        System.out.println(employee3.calcCompensation(1,2000 ));


    }
}
