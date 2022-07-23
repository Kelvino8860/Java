import java.util.Scanner;
public class SecretPhrase
{  public static void main(String[]  args)
       {  char guess;
          String phrase = "Program";
          int ch = 0;
          int i;
          int count = 0;
          StringBuilder newPhrase = new StringBuilder("** ****");
          String newWord = "";
          Scanner inputDevice = new Scanner(System.in);
           System.out.print("Enter a letter >> ");
             guess = inputDevice.nextLine().charAt(0);
      do{ for(i = 0; i < phrase.length(); ++i);
                  ch = phrase.indexOf(guess); 
                 if(ch >= 0)
                        {  newPhrase.setCharAt(ch, guess);
                          System.out.println(newPhrase);
                               if(phrase.equals(newPhrase.toString()))
                                  { System.out.println("Congratulation!!!You got the phrase right");
                                      break;
                                   }
                             System.out.print("Enter a letter >> ");
                                guess = inputDevice.nextLine().charAt(0);
                        }
                    else
                      {   System.out.println("Sorry!!! This letter is not in the phrase.");
                         System.out.print("Enter a letter >> ");
                           guess = inputDevice.nextLine().charAt(0);
                      }
        }while(true);
      }
}