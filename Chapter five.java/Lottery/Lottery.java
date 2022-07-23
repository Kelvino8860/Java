import java.util.Scanner;
public class Lottery
{  public static void main(String[]   args)
      {  int random1 = 1 + (int)(Math.random() * 9);
         int random2 = 1 + (int)(Math.random() * 9);
         int random3 = 1 + (int)(Math.random() * 9);
         int myGuess1;
         int myGuess2;
         int myGuess3;
         final int ONE_MATCH = 10;
         final int TWO_MATCH = 100;
         final int THREE_MATCH = 1000;
         final int ORDER_MATCH = 1000000;
         final int NO_MATCH = 0;
       Scanner inputDevice = new Scanner(System.in);
       System.out.println("Guess three values from 1 to 9");
        myGuess1 = inputDevice.nextInt();
        myGuess2 = inputDevice.nextInt();
        myGuess3 = inputDevice.nextInt();
      System.out.print("Your guess is >> " + myGuess1 + ", " + myGuess2 + ", " + myGuess3);
      System.out.print("\nRandomly generated numbers >> " + random1 + ", " + random2 + ", " + random3);
  if(myGuess1 == random1 && myGuess2 == random2 && myGuess3 == random3)
       System.out.println("\nCONGRATULATIONS!!! You have won $" + ORDER_MATCH);
    else
       if((myGuess1 == random1 || myGuess1 == random2 || myGuess1 == random3) &&
          (myGuess2 == random1 || myGuess2 == random2 || myGuess2 == random3) &&
          (myGuess3 == random1 || myGuess3 == random2 || myGuess3 == random3))
        System.out.println("\nCONGRATULATIONS!!! You have won $" + THREE_MATCH);
   else
     if(((myGuess1 == random1 || myGuess1 == random2 || myGuess1 == random3) &&
          (myGuess2 == random1 || myGuess2 == random2 || myGuess2 == random3)) ||
         ((myGuess1 == random1 || myGuess1 == random2 || myGuess1 == random3) &&
          (myGuess3 == random1 || myGuess3 == random2 || myGuess3 == random3)) ||
         ((myGuess2 == random1 || myGuess2 == random2 || myGuess2 == random3) &&
          (myGuess3 == random1 || myGuess3 == random2 || myGuess3 == random3)))
              System.out.println("\nCONGRATULATIONS!!! You have won $" + TWO_MATCH);
   else
     if((myGuess1 == random1 || myGuess1 == random2 || myGuess1 == random3) ||
        (myGuess2 == random1 || myGuess2 == random2 || myGuess2 == random3) ||
        (myGuess3 == random1 || myGuess3 == random2 || myGuess3 == random3))
              System.out.println("\nCONGRATULATIONS!!! You have won $" + ONE_MATCH); 
   else
     if((myGuess1 != random1 || myGuess1 != random2 || myGuess1 != random3) &&
          (myGuess2 != random1 || myGuess2 != random2 || myGuess2 != random3) &&
          (myGuess3 != random1 || myGuess3 != random2 || myGuess3 != random3))
               System.out.println("\nOOOPPS!!! You have won $" + NO_MATCH); 
     }
}