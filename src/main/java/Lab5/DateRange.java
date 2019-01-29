package Lab5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class DateRange {
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;

    public DateRange(GregorianCalendar startDate, GregorianCalendar endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static String format(GregorianCalendar calendar){
        SimpleDateFormat fmt = new SimpleDateFormat("MM-dd-yyyy");
        fmt.setCalendar(calendar);
        String dateFormatted = fmt.format(calendar.getTime());
        return dateFormatted;
    }


    public boolean isInRange(GregorianCalendar dateRange ){
        long time = dateRange.getTimeInMillis();
        long starTime = startDate.getTimeInMillis();
        long endTime = endDate.getTimeInMillis();
        return (time >= starTime) && (time <= endTime);
    }

    @Override
    public String toString() {
        return "DateRange{" +
                "startDate=" + format(startDate) +
                ", endDate=" + format(endDate) +
                '}';
    }

    public int getLastDayOfMonth(Date date){
        return date.getDay();
    }

    public int getFirstDayOfMonth(Date date){
        return date.getDay();
    }
}
