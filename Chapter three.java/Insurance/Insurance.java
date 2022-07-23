import java.util.Scanner;
public class Insurance
{ public static void main(String[]  args)
     { int yearBirth;
       int yearCurrent;
       Scanner inputDevice = new Scanner(System.in);
       System.out.print("Enter the current year >> ");
       yearCurrent = inputDevice.nextInt();
       System.out.print("Enter the year of birth >> ");
       yearBirth = inputDevice.nextInt();
       premiumAmount(yearCurrent, yearBirth);
       System.out.println("Your premium amount is $" + premiumAmount(yearCurrent, yearBirth));
           }
  public static int premiumAmount(int yearCurrent, int yearBirth)
       {  int age;
          int decade;
          int premium;
          final int ADDING_TO_AGE = 15;
          final int MULTIPLYING_AGE = 20;
          final int NO_OF_DECADE = 10;
          age = yearCurrent - yearBirth;
          decade = age / NO_OF_DECADE;
          premium = (decade + 15) * 20;
          return premium;
       }  
}