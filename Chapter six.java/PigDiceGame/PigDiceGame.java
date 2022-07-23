import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAdder;
public class PigDiceGame
{  public static void main(String[]  args)
      {  PigDice player = new PigDice();
         PigDice computer = new PigDice();
         int LIMIT = 100;
         int reset = 0;
         int playAgain = 0;
         int continuePlaying;
         int score;
         int playerTotal = 0; int computerTotal = 0;
      Scanner inputDevice = new Scanner(System.in);
         do{  do{  player.roll();
                  if(player.getValDie1() != 1 && player.getValDie2() != 1)
                       {  playerTotal += player.getTotal();
                          System.out.println("Player's Die one : " + player.getValDie1());
                          System.out.println("Player's Die two : " + player.getValDie2());
                          System.out.println("Players score : " + playerTotal + "\n");
                              if(playerTotal >= 100)
                              {  System.out.println("CONGRATULATIONS!!! PLAYER WINS");
                                  break;
                               }
                          System.out.print("To continue playing enter 1 >> ");
                          playAgain = inputDevice.nextInt();
                        }
                    else
                     if(player.getValDie1() == 1 && player.getValDie2() == 1)
                       {    playerTotal *= player.getReset();
                          System.out.println("Player's Die one : " + player.getValDie1());
                          System.out.println("Player's Die two : " + player.getValDie2());
                          System.out.println("Players score : " + playerTotal + "\n");
                         break;
                        }
                    else
                     if(player.getValDie1() == 1 || player.getValDie2() == 1)
                         {   
                             System.out.println("Player's Die one : " + player.getValDie1());
                             System.out.println("Player's Die two : " + player.getValDie2());
                             System.out.println("Players score : " + playerTotal + "\n");
                              break;
                           }
                 }while(playAgain == 1);
            
              do{  computer.roll();
                   if(computer.getValDie1() != 1 && computer.getValDie2() != 1)
                       {  computerTotal += computer.getTotal();
                          System.out.println("Computer's Die one : " + computer.getValDie1());
                          System.out.println("Computer's Die two : " + computer.getValDie2());
                          System.out.println("Computer score : " + computerTotal + "\n");
                             if(computerTotal >= 100)
                                 { System.out.println("COMPUTER WINS!!!");
                                   break;
                                  }
                          computer.compRoll();
                        }
                   else
                    if(computer.getValDie1() == 1 && computer.getValDie2() == 1)
                         {  computerTotal *= computer.getReset();
                            System.out.println("Computer's Die one : " + computer.getValDie1());
                            System.out.println("Computer's Die two : " + computer.getValDie2());
                            System.out.println("Computer score : " + computerTotal + "\n");
                            break;
                          }
                   else
                     if(computer.getValDie1() == 1 || computer.getValDie2() == 1)
                            {   
                               
                                System.out.println("Computer's Die one : " + computer.getValDie1());
                                System.out.println("Computer's Die two : " + computer.getValDie2());
                                System.out.println("Computer score : " + computerTotal + "\n");
                                 break;
                             }
                }while(computer.getValComp() >= 0.5);
                 if(playerTotal >= 100)
                    {  System.out.println("CONGRATULATIONS!!! PLAYER WINS");
                       break;
                      }
                  else
                    if(computerTotal >= 100)
                      { System.out.println("COMPUTER WINS!!!!");
                        break;
                       }
       }while(true);
   }
}    
