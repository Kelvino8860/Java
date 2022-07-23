import java.time.*;
public class TestMonthHandling
{  public static void main(String[]  args)
      {  LocalDate date1 = LocalDate.of(2022, Month.JANUARY, 31);
         LocalDate date2 = LocalDate.of(2022, Month.DECEMBER, 31);
         final int NUM_OF_MONTHS1 = 1;
         final int NUM_OF_MONTHS2 = 2;
         final int NUM_OF_MONTHS3 = 3;
         System.out.println("Date displayed when 1 month is added to the date >> " +
                             date1.plusMonths(NUM_OF_MONTHS1));
         System.out.println("Date displayed when 2 months is added to the date >> " +
                             date1.plusMonths(NUM_OF_MONTHS2));
         System.out.println("Date displayed when 3 months is added to the date >> " +
                             date1.plusMonths(NUM_OF_MONTHS3));
         System.out.println("Date displayed when 1 month is added to the date >> " +
                             date2.plusMonths(NUM_OF_MONTHS1));
         System.out.println("Date displayed when 2 months is added to the date >> " +
                             date2.plusMonths(NUM_OF_MONTHS2));
         System.out.println("Date displayed when 3 months is added to the date >> " +
                             date2.plusMonths(NUM_OF_MONTHS3));
          }
}
