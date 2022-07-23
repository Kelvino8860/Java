import java.util.Scanner;
public class ChiliToGo
{ public static void main(String[]  args)
   { int adultMeal;
     int childMeal;
     int totalAmountAdults;
     int totalAmountChild;
     int totalAllMeals;
     float profitChild;
     float profitAdult;
     float grandProfit;
     final int priceAdult = 7;
     final int priceChild = 4;
     final double coastAdult = 4.35;
     final double coastChild = 3.10;
     Scanner inputDevice = new Scanner(System.in);
     System.out.print("Number of adult meals sold >> ");
     adultMeal = inputDevice.nextInt();
     System.out.print("Number of children meals sold >> ");
     childMeal = inputDevice.nextInt();
     totalAmountAdults = adultMeal * priceAdult;
     totalAmountChild = childMeal * priceChild;
     totalAllMeals = totalAmountAdults + totalAmountChild;
     profitChild = (float) ((childMeal*priceChild)-(childMeal*coastChild));
     profitAdult = (float) ((adultMeal*priceAdult)-(adultMeal*coastAdult));
     grandProfit = (float) (profitChild + profitAdult);
     System.out.println("Total amount collected for adult meal $" + totalAmountAdults +
                         "\nTotal amount collected for children meal $" + totalAmountChild +
                         "\nTotal amount collected for both type of meals $" + totalAllMeals +
                         "\nTotal amount of profit for the children meals $" + profitChild +
                         "\nTotal amount of profit for the adult meals $" + profitAdult +
                         "\n Total grand profit for all types of meals $" + grandProfit);
    }
}