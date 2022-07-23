import java.util.Scanner;
public class PigLatin
{   public static void main(String[]  args)
      { String word;
        String newWord = "";
        Scanner inputDevice = new Scanner(System.in);
         System.out.print("Enter word >> ");
          word = inputDevice.nextLine();
        for(int i = 0; i < word.length(); ++i)
          { char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
                ch == 'u')
                  {  newWord = word.substring(i) + word.substring(0, i) + "ay";
                     break;
                  }
            else
             { System.out.println("Word has no vowel in it");
                 break;
              }
          }
          for(int x = 1; x < word.length(); ++x)
             {    char gh = word.charAt(x);
                  if(gh == 'y')
                     {  newWord = word.substring(x) + word.substring(0, x) + "ay";
                        break;
                     }
             }
      System.out.println(word + " " + newWord);
       }
}