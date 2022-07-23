public class Factorials
{   public static void main(String[]  args)
      {  int x;
         int factorial = 1;
           for(x = 1; x <= 10; ++x)
              {   factorial *= x;
                System.out.print("The factorial of  " + x + " is " +factorial);
                     System.out.println();
                 }
       }
}