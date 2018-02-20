import java.util.Date;
import java.util.Calendar;
import java.util.*;

public class DateCalendarDemo
{
    	private static void displayCurrentDateTime() 
		{
			System.out.println("CURRENT DATE/TIME");
			System.out.println("=================================================================");
			Date now = Calendar.getInstance().getTime();
			System.out.println("  Calendar.getInstance().getTime() : " + now+"\n");
        }

    private static void displayDateDifference() 
	{
        System.out.println("DIFFERENCE BETWEEN TWO DATES");
        System.out.println("=================================================================");
        Date startDate1 = new GregorianCalendar(1994, 02, 14, 14, 00).getTime();
        Date endDate1   = new Date();;

        long diff = endDate1.getTime() - startDate1.getTime();

        System.out.println("  Difference between " + endDate1);
        System.out.println("  and " + startDate1 + " is " + (diff / (1000L*60L*60L*24L)) + " days."+"\n");
    }

    private static void calendarGetMethods() 
	{
        System.out.println("CALENDAR GET METHODS");
        System.out.println("=================================================================");
        Calendar c = Calendar.getInstance();

        System.out.println("  YEAR                 : " + c.get(Calendar.YEAR));
        System.out.println("  MONTH                : " + c.get(Calendar.MONTH));
        System.out.println("  DAY_OF_MONTH         : " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("  DAY_OF_WEEK          : " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("  DAY_OF_YEAR          : " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("  WEEK_OF_YEAR         : " + c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("  WEEK_OF_MONTH        : " + c.get(Calendar.WEEK_OF_MONTH));
        System.out.println("  DAY_OF_WEEK_IN_MONTH : " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("  HOUR                 : " + c.get(Calendar.HOUR));
        System.out.println("  AM_PM                : " + c.get(Calendar.AM_PM));
        System.out.println("  HOUR_OF_DAY (24-hour): " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("  MINUTE               : " + c.get(Calendar.MINUTE));
        System.out.println("  SECOND               : " + c.get(Calendar.SECOND)+"\n");
    }

    public static void main(String[] args) 
	{
        displayCurrentDateTime();
        displayDateDifference();
        calendarGetMethods();
    }
}
