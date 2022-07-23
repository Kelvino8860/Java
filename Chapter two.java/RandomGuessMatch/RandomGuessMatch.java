import java.util.Scanner;
public class RandomGuessMatch
{ public static void main(String[]   args)
   {int random =  1 + (int)(Math.random() * 5);
    int guess;
    boolean isEquall;
    Scanner inputDevice = new Scanner(System.in);
    System.out.print("Guess a random number from 1 to 5.>> ");
    guess = inputDevice.nextInt();
    System.out.println("The number is >> " + random);
    isEquall = guess == random;
    System.out.println("\nThe random number is " + random + " making your answer " + isEquall + ".");
   }
}