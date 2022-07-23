import java.util.Scanner;
import java.util.Random;
public class PickTwoCards
{ public static void main(String[]   args)
      { Cards firstCards = new Cards();
        Cards secondCards = new Cards();
           int myValOne;
           int myValTwo;

   //Randomly select suits from a string
           String suitOne;
           String suitTwo;
           String suitsChar = "shdc";
           Random random1 = new Random();
           Random random2 = new Random();
           int suit1 = random1.nextInt(suitsChar.length());
           int suit2 = random2.nextInt(suitsChar.length());
        if(suitsChar.charAt(suit1) == 's')
             {  suitOne = "Spades";
                firstCards.setSuits(suitOne);
               }
        else
          if(suitsChar.charAt(suit1) == 'h')
             {  suitOne = "Hearts";
                firstCards.setSuits(suitOne);
               }
        else
           if(suitsChar.charAt(suit1) == 'd')
             {  suitOne = "Diamonds";
                firstCards.setSuits(suitOne);
               }
         else
            if(suitsChar.charAt(suit1) == 'c')
             {  suitOne = "Clubs";
                firstCards.setSuits(suitOne);
               }
        if(suitsChar.charAt(suit2) == 's')
             {  suitTwo = "Spades";
                secondCards.setSuits(suitTwo);
               }
        else
           if(suitsChar.charAt(suit2) == 'h')
             {  suitTwo = "Hearts";
                secondCards.setSuits(suitTwo);
               }
        else
          if(suitsChar.charAt(suit2) == 'd')
             {  suitTwo = "Diamonds";
                secondCards.setSuits(suitTwo);
               }
         else
          if(suitsChar.charAt(suit2) == 'c')
             {  suitTwo = "Clubs";
                secondCards.setSuits(suitTwo);
               }
         
//Randomly select an integer 

           final int CARDS_IN_SUIT = 13;
           myValOne = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
           myValTwo = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
           firstCards.setValues(myValOne);
           secondCards.setValues(myValTwo);
           System.out.println("Computer card " + firstCards.getRep() + " of " + firstCards.getSuits());
           System.out.println("Players card " + secondCards.getRep() + " of " + secondCards.getSuits());
              if(myValOne > myValTwo)
                 {  System.out.println("The hire card is >> " + firstCards.getRep() + " of " + firstCards.getSuits());
                    System.out.println("The computer won!!!");
                   }
              else
               if(myValTwo > myValOne)
                {   System.out.println("The hire card is >> " + secondCards.getRep() + " of " + secondCards.getSuits());
                    System.out.println("Congratularion!!! You won.");
                  }
              else
                if(myValOne == myValTwo)
                    System.out.println("The cards are equal.");
                 }
}