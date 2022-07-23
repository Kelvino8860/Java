import java.util.Scanner;
public class Alphabetize
{   public static void main(String[]  args)
       {  String str1 = "", str2 = "", str3 = "";
             Scanner inputDevice = new Scanner(System.in);
          String[] strings = {str1, str2, str3};
            for(int i = 0; i < 3; ++i)
               {  System.out.print("Enter string >> ");
                   strings[i] = inputDevice.nextLine();
                   }
           if(strings[0].compareToIgnoreCase(strings[1]) < 0 &&
              strings[0].compareToIgnoreCase(strings[2]) < 0 && strings[1].compareToIgnoreCase(strings[2]) < 0)
                  System.out.println("You entered your strings in alphabetic order.");
           else
            System.out.println("The strings you entered are not in alphabetic order.");
        }
}