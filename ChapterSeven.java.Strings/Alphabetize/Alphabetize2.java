import java.util.Scanner;
public class Alphabetize2
{   public static void main(String[]  args)
       {  String str1 = "", str2 = "", str3 = "";
             Scanner inputDevice = new Scanner(System.in);
          String[] strings = {str1, str2, str3};
            for(int i = 0; i < 3; ++i)
               {  System.out.print("Enter string >> ");
                   strings[i] = inputDevice.nextLine();
                   }
           if(strings[0].compareToIgnoreCase(strings[1]) < 0 &&
              strings[0].compareToIgnoreCase(strings[2]) < 0 && 
              strings[1].compareToIgnoreCase(strings[2]) < 0)
                  System.out.println(strings[0] + "\n" + strings[1] + "\n" + strings[2]);
           else
            if(strings[0].compareToIgnoreCase(strings[1]) < 0 &&
               strings[0].compareToIgnoreCase(strings[2]) < 0 && 
               strings[2].compareToIgnoreCase(strings[1]) < 0)
                 System.out.println(strings[0] + "\n" + strings[2] + "\n" + strings[1]);
           else
            if(strings[1].compareToIgnoreCase(strings[0]) < 0 &&
               strings[1].compareToIgnoreCase(strings[2]) < 0 && 
               strings[0].compareToIgnoreCase(strings[2]) < 0)
                  System.out.println(strings[1] + "\n" + strings[0] + "\n" + strings[2]);
           else
            if(strings[1].compareToIgnoreCase(strings[0]) < 0 &&
               strings[1].compareToIgnoreCase(strings[2]) < 0 && 
               strings[2].compareToIgnoreCase(strings[0]) < 0)
                  System.out.println(strings[1] + "\n" + strings[2] + "\n" + strings[0]);
            else
             if(strings[2].compareToIgnoreCase(strings[0]) < 0 &&
                strings[2].compareToIgnoreCase(strings[1]) < 0 && 
                strings[0].compareToIgnoreCase(strings[1]) < 0)
                  System.out.println(strings[2] + "\n" + strings[0] + "\n" + strings[1]);
            else
             if(strings[2].compareToIgnoreCase(strings[0]) < 0 &&
                strings[2].compareToIgnoreCase(strings[2]) < 0 && 
                strings[1].compareToIgnoreCase(strings[0]) < 0)
                  System.out.println(strings[2] + "\n" + strings[1] + "\n" + strings[0]);
        }
}