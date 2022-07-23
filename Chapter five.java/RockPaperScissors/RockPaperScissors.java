import java.util.Scanner;
public class RockPaperScissors
{   public static void main(String[]   args)
       { String opt1 = "Rock";
         String opt2 = "Paper";
         String opt3 = "Scissors"; 
         int player;
         int randomInt = ((int) (Math.random()*100) % 3 + 1);
     Scanner inputDevice = new Scanner(System.in);
         System.out.println("Enter a number 1 for rock, 2 for paper and 3 for scissors." + "\n ");
          player = inputDevice.nextInt();
     if(player == randomInt)
          System.out.println("RESULTS : Tie");
     if(player == 1 && randomInt == 3)
          System.out.println("RESULTS : Player wins" + "\n " + opt1 + " beats " + opt3);
    else
      if(player == 3 && randomInt == 2)
          System.out.println("RESULTS : Player wins" + "\n " + opt3 + " beats " + opt2); 
    else
      if(player == 2 && randomInt == 1)
          System.out.println("RESULTS : Player wins" + "\n " + opt2 + " beats " + opt1);
    else
      if(randomInt == 1 && player == 3)
          System.out.println("RESULTS : Computer wins" + "\n " + opt1 + " beats " + opt3);
    else
      if(randomInt == 3 && player == 2)
          System.out.println("RESULTS : Computer wins" + "\n " + opt3 + " beats " + opt2);
   else
      if(randomInt == 2 && player == 1)
          System.out.println("RESULTS : Computer wins" + "\n " + opt2 + " beats " + opt1);
   }
}