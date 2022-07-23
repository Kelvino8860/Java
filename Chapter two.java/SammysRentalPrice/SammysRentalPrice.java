import java.util.Scanner;
public class SammysRentalPrice
{public static void main(String[]  args)
  { int noMinutes;
    int noHours;
    int remainingMin;
    int totalPrice;
    final int minToHours = 60;
    final int costPerHour = 40;
    final int costAddMin = 1;
    Scanner inputDevice = new Scanner(System.in);
    System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
    System.out.println("SsSs                                                SsSs");
    System.out.println("SsSs   Sammy's makes it fun in the sun              SsSs");
    System.out.println("SsSs                                                SsSs");
    System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
    System.out.print("Number of minutes rented a piece of sports equipments >> ");
    noMinutes = inputDevice.nextInt();
    noHours = noMinutes/minToHours;
    remainingMin = noMinutes%minToHours;
    totalPrice = (costPerHour*noHours) + (costAddMin*remainingMin);
    System.out.println("Total number of minutes >> " + noMinutes + "\nTotal number of hours >> " +
                        noHours + "\nAdditional minutes >> " + remainingMin + "\nTotal price >>$" + totalPrice);
    
   }
}
  