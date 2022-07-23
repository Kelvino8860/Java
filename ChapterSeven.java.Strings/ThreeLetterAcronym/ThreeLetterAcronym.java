import java.util.Scanner;
public class ThreeLetterAcronym
{  public static void main(String[]  args)
        {  String threeWords;
           String restWord = "";
            Scanner inputDevice = new Scanner(System.in);
            System.out.print("Enter three words >> ");
             threeWords = inputDevice.nextLine();
          int spaces = 0;
          int spaces2 = 0;
          char char1, char2, char3;
             for(int i = 0; i < threeWords.length(); ++i)
                {  spaces = threeWords.indexOf(' ');
                   restWord = threeWords.substring(spaces + 1, threeWords.length());
                 }
          char1 = threeWords.charAt(0);
            for(int x = 0; x < restWord.length(); ++x)
                {  spaces2 = restWord.indexOf(' ');
                   }
                   char2 = restWord.charAt(0);
                   char3 = restWord.charAt(spaces2 + 1);
                 char1 = Character.toUpperCase(char1);
                 char2 = Character.toUpperCase(char2);
                 char3 = Character.toUpperCase(char3);
              System.out.println("Characters are >> " + char1 + char2 + char3);
          }
}