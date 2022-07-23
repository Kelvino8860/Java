import java.time.*;
import java.util.Scanner;
public class TenThousandDaysOld
{  public static void main(String[]  args)
     {  
        Scanner inputDevice = new Scanner(System.in);
        LocalDate birthDate;
        int mon;
        int day;
        int year;
        int age, numDays;
        final int NUM_OF_DAYS_YEAR = 365;
        final int NUM_OF_DAYS = 10000;
        System.out.print("Enter month of birth >> ");
        mon = inputDevice.nextInt();
        System.out.print("Enter date of birth >> ");
        day = inputDevice.nextInt();
        System.out.print("Enter year of birth >> ");
        year = inputDevice.nextInt();
        System.out.print("Enter current age >> ");
        age = inputDevice.nextInt();
        numDays = age * NUM_OF_DAYS_YEAR;
        birthDate = LocalDate.of(year, mon, day);
        System.out.println("\nYour date of birth is " + birthDate);
        System.out.println("You will have or have lived 10'000 days in this beautifull earth by the year " +
                                   birthDate.plusDays(NUM_OF_DAYS));
        System.out.println("You have lived " + numDays + " on this earth. Bwana umeishi sana pea wengine chance.");
       
        
     }
        
}