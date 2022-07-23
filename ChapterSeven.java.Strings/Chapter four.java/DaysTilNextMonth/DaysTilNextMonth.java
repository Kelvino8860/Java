import java.time.*;
public class DaysTilNextMonth
{  public static void main(String[]  args)
    { LocalDate date = LocalDate.now();
      int day = date.getDayOfMonth();
      int month = date.lengthOfMonth();
      int daysLeft = month - day;
      LocalDate next_month = date.plusDays(daysLeft + 1);
      Month mon = next_month.getMonth();
      System.out.println("There are " + daysLeft + " days until " + mon);
       }
}