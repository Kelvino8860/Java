import java.util.Scanner;
public class CarlysEventPrice
{  public static void main(String[] args)
   { String noGuestsString;
     int noGuests;
     int totalPrice;
     boolean isEquall;
     final int isLarge = 50;
     final int pricePerInd = 35;
     Scanner inputDevice = new Scanner(System.in);
     System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
     System.out.println("xx                                                     xx");
     System.out.println("xx  Carly's makes the food that makes it a party       xx");
     System.out.println("xx                                                     xx");
     System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
     System.out.print("\nNumber of guests >> ");
     noGuests = inputDevice.nextInt();
     totalPrice = noGuests * pricePerInd;
     isEquall = noGuests >= isLarge;
     System.out.println("Total number of guests are >> " + noGuests + "\nPrice per guest is >> " +
                         pricePerInd + "\nTotal price is >> " + totalPrice + "\nThe event was classified as a large event >> " +
                         isEquall); 
     }
}