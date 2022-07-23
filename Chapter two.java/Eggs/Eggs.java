import java.util.Scanner;
public class Eggs
{ public static void main(String[]  args)
   { int numberEggs;
     int numberOfDozens;
     int individualEggs;
     double totalAmount;
     final double priceDozen = 3.25;
     final double priceIndividual = 0.45;
     final int eggDozen = 12;
     Scanner inputDevice = new Scanner(System.in);
     System.out.print("How many eggs do you want to order? >> ");
     numberEggs = inputDevice.nextInt();
     numberOfDozens = numberEggs/eggDozen;
     individualEggs = numberEggs%eggDozen;
     totalAmount = (numberOfDozens * priceDozen) + (individualEggs * priceIndividual);
     System.out.println("You ordered " + numberEggs + " eggs, that is " +
                         numberOfDozens + " dozen at $" + priceDozen + " per dozen and " +
                         individualEggs + " eggs at " + priceIndividual + " cents each for a total of $" +
                         totalAmount + ".");
    }
}
                         
         
     
     
     