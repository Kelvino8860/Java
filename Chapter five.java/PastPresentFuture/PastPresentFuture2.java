import java.time.*;
import java.util.Scanner;
public class PastPresentFuture2
{    public static void main(String[]  args)
      {  int month, date, year;
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
         boolean isBefore = localDateToday.isBefore(enteredDate);
         boolean isAfter = localDateToday.isAfter(enteredDate);
         boolean isEqual = localDateToday.equals(enteredDate);
          if(isBefore)
             System.out.println("The date entered is in the future.");
          else
          if(isAfter)
              System.out.println("The date entered is in the past.");
          else
          if(isEqual)
              System.out.println("The date entered is in the present.");
         
      }
}