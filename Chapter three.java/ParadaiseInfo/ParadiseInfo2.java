import java.util.Scanner;
public class ParadiseInfo2
{ public static void main(String[]  args)
     {    
        double price;
        double discount;
        double savings;
        Scanner inputDevice = new Scanner (System.in);
        System.out.println("Enter cutoff price for discount >> ");
        price = inputDevice.nextDouble();
        System.out.println("Enter discount rate as whole number >> ");
        discount = inputDevice.nextDouble();
        ParadiseInfo.displayInfo();
        computeDiscountInfo(price,discount);
        savings = computeDiscountInfo(price, discount);
        System.out.println( "Special this week for any service over " + price + "\nDiscount of "
                                          + discount + "percent." + "\nThats a saving of at least $" + savings);
     }
       public static double computeDiscountInfo(double price, double discountRate)
           { double savings;
             savings = price * discountRate / 100;
             return savings;
            }
    
}      