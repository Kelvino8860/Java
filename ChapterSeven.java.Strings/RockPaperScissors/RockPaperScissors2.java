import java.util.Scanner;
public class RockPaperScissors2
{   public static void main(String[]   args)
      {  String player;                       int countComputerWin = 0;                                    final int ROCK_CODE = 1;
         int playerInt = 0;                   final int PAPER_CODE = 2;
         int countTie = 0;                    final int LIMIT = 10;                                        final int SCISSORS_CODE = 3;
         int countPlayerWin = 0;              Scanner inputDevice = new Scanner(System.in);
             System.out.println("WELCOME TO ROCK, PAPER, SCISSORS GAME");
             for(int i = 0; i < LIMIT; ++i)
                   {    int randomInt = ((int) (Math.random() * 100) % 3 + 1);
                       System.out.print("Enter rock, paper or scissors to play >> ");
                                   player = inputDevice.nextLine();
                         while(true) 
                           {  
                               if(player.toLowerCase().startsWith("sc") || player.toLowerCase().startsWith("ro") ||
                                  player.toLowerCase().startsWith("pa"))
                                    break;
                               else
                                  {   System.out.print("Enter rock, paper or scissors to play >> ");
                                        player = inputDevice.nextLine();
                                   }
                             }     
                             if(player.toLowerCase().startsWith("ro"))
                                 {  playerInt = ROCK_CODE;
                                     }
                             else
                               if(player.toLowerCase().startsWith("pa"))
                                   {  playerInt = PAPER_CODE;
                                     }
                             else
                               if(player.toLowerCase().startsWith("sc"))
                                    {  playerInt = SCISSORS_CODE;
                                      }
                      if(playerInt == randomInt)
                           {   System.out.println("THE GAME WAS A TIE!!!");
                                 ++countTie;
                            }
                      if((playerInt == SCISSORS_CODE && randomInt == PAPER_CODE) || (playerInt == ROCK_CODE && randomInt == SCISSORS_CODE) ||
                          (playerInt == PAPER_CODE && randomInt == ROCK_CODE))
                           {  System.out.println("CONGRATULATIONS!!!PLAYER WINS!!!");
                                 ++countPlayerWin;
                            }
                    else
                      if((randomInt == SCISSORS_CODE && playerInt == PAPER_CODE) || (randomInt == ROCK_CODE && playerInt == SCISSORS_CODE) ||
                          (randomInt == PAPER_CODE && playerInt == ROCK_CODE))
                               { System.out.println("SORY!!!COMPUTER WINS!!!");
                                    ++countComputerWin;
                                 }
                    }   
              System.out.println("\nTOTAL NUMBER OF PLAYER'S WIN : " + countPlayerWin + "\nTOTAL NUMBER OF COMPUTER'S WIN : " + countComputerWin +
                                 "\nTOTAL NUMBER OF TIES : " + countTie);           
        }
}