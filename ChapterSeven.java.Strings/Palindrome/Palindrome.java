import java.util.Scanner;
public class Palindrome
{  public static void main(String[]  args)
       {  String phrase;
          StringBuilder newPhrase = new StringBuilder();  //string objects to be able to append 
          StringBuilder reversedPhrase = new StringBuilder();
          char ch, st;
             Scanner inputDevice = new Scanner(System.in);
              System.out.print("Enter phrase >> ");
                phrase = inputDevice.nextLine();
         for(int i = 0; i < phrase.length(); ++i)       //loop the original string to be able to filter out punctuation marks
            {  if(Character.isLetter(phrase.charAt(i))) //filter out and panctuation marks
                      {  ch = phrase.charAt(i);
                         newPhrase.append(ch);
                          }
            }
           newPhrase.toString(); //conver string object to string
             int lengths = newPhrase.length();
                 for(int j = 0; j < lengths; ++j) //loop for new string formed without loops
                              {   int k = lengths - j;
                                  st = newPhrase.charAt(k - 1); //reversed the characters arrangement in string
                                 reversedPhrase.append(st);
                               }
         reversedPhrase.toString();
         newPhrase.toString();
            if(newPhrase.toString().equalsIgnoreCase(reversedPhrase.toString())) 
                 { System.out.println("The phrase is a palindrome");
                   System.out.println(newPhrase + "\n" + reversedPhrase);
                  }
             else
               {  System.out.println("Sorry!!! This phrase is not a palindrome");
                  System.out.println(newPhrase + "\n" + reversedPhrase);
                }
         }
}