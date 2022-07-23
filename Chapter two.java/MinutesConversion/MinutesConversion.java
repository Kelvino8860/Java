import java.util.Scanner;
public class MinutesConversion
{ public static void main(String[]  args)
  { float hours;
    float days;
    float minutes;
    final float maxMinutes = 60;
    final float maxHours = 24;
    Scanner inputDevice = new Scanner(System.in);
    System.out.print("Input number of minutes.>> ");
    minutes = inputDevice.nextFloat();
    hours = minutes/maxMinutes;
    days = minutes/(maxMinutes*maxHours);
    System.out.println("There are " + days + " days and " +
                        hours + " hours in " + minutes + " minutes.");
  }
}
    