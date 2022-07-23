public class CountByFive
{   public static void main(String[]   args)
       {  int x;
          int LIMIT = 500;
          int FACTOR = 50;
           for(x = 5; x <= LIMIT; x += 5)
              {  System.out.print(x + " ");
                   if((x % FACTOR) == 0)
                 System.out.println();
                }
       } 
}