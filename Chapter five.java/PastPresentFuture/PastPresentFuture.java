import java.time.*;
import java.util.Scanner;
public class PastPresentFuture
{    public static void main(String[]  args)
      {  int month, date, year, monthLocal, dateLocal, yearLocal, earlierMonth, laterMonth;
         LocalDate enteredDate;
         LocalDate localDateToday = LocalDate.now();
         Scanner inputDevice = new Scanner(System.in);
         System.out.print("Enter value of month >> ");
         month = inputDevice.nextInt();
         System.out.print("Enter value of day of month >> ");
         date = inputDevice.nextInt();
         System.out.print("Enter value of year >> ");
         year = inputDevice.nextInt();
         enteredDate = LocalDate.of(year, month, date);
         monthLocal = localDateToday.getMonthValue();
         dateLocal = localDateToday.getDayOfMonth();
         yearLocal = localDateToday.getYear();
            if(year > yearLocal || year < yearLocal)
                System.out.println("Not this year.");
           else
            if(year == yearLocal && monthLocal > month)
                  System.out.println("In an earlier month this year.");
            else
              if(year == yearLocal && monthLocal < month)
                   System.out.println("In a later month this year.");
            else
              if(year == yearLocal && monthLocal == month)
                    System.out.println("This month.");
      }
}