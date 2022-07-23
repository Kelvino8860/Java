import java.util.Scanner;
public class CountWords
{  public static void main(String[]  args)
   { String word;
      Scanner input = new Scanner(System.in);
       System.out.print("Enter string >> ");
          word = input.nextLine();
     count(word);
     System.out.println("There are " + count(word) + " words in the string");
   }
 public static int count(String word)
    {    if(word == null || word.isEmpty())
          { return 0;
               }
           int wordCount = 0;
           boolean isWord = false;
           int endOfLine = word.length() - 1;
           char[]  characters = word.toCharArray();

         for(int i = 0; i < word.length(); ++i)
           { if(Character.isLetter(characters[i]) && i != endOfLine)
               {  isWord = true;
                }
             else
              if(!Character.isLetter(characters[i]) && isWord)
                   {  wordCount++;
                      isWord = false;
                    }
             else
               if(Character.isLetter(characters[i]) && i == endOfLine)
                  { wordCount++;
                    }
            }
       return wordCount;
    } 
}