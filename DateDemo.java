package Dates;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateDemo {
    public static void main(String[] args) {

        Date currentDate = new Date(); // we have created an object

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        Date futureDate = calendar.getTime();

        String formattedFutureDate = formatter.format(futureDate);
        System.out.println("Date after a week from now: " + formattedFutureDate);

        Date date1 = new Date(2000); // 15th Feb 2023
        Date date2 = new Date(20002); // 20th Feb 2023

        boolean isBefore = date1.before(date2);
        System.out.println("Is date1 before date2? " + isBefore);
    }
}