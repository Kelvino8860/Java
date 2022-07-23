public class CountSpaces
{  public static void main(String[]  args)
      {  String myInspiration = "You know yourself better than anyone else, yet you crumble at the words of someone who hasn't even lived a second of your life. Focus on your own voice,It's the only one that matters.";
        int count = 0;
        for(int i = 0; i < myInspiration.length(); ++i)
           {  if(myInspiration.charAt(i) == ' ')
               ++count;
             }
     System.out.println("Number of spaces in my quote is " + count);
      }
}