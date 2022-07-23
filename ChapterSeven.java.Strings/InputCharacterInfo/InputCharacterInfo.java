import java.util.Scanner;
public class InputCharacterInfo
{   public static void main(String[]  args)
           {   char aChar;
             Scanner inputDevice = new Scanner(System.in);
              System.out.print("Enter a character >> ");
                 aChar = inputDevice.nextLine().charAt(0);
              System.out.println("Character entered is >> " + aChar);
             if(Character.isUpperCase(aChar))
                 System.out.println(aChar + " is upper case.");
             else
                System.out.println(aChar + " is not upper case");
             if(Character.isLowerCase(aChar))
                System.out.println(aChar + " is lower case");
              else
                System.out.println(aChar + " is not lower case");
             aChar = Character.toLowerCase(aChar);
               System.out.println("After toLowerCase(), aChar is " + aChar);
             aChar = Character.toUpperCase(aChar);
               System.out.println("After toUpperCase(), aChar is " + aChar);
             if(Character.isLetterOrDigit(aChar))
               System.out.println(aChar + " is a letter or digit");
             else
               System.out.println(aChar + " is neither a letter or digit");
             if(Character.isWhitespace(aChar))
               	System.out.println(aChar + " is a whitespace");
             else
                System.out.println(aChar + " is not a whitespace");
            }
}