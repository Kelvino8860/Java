public class DivideEvenly
{   public static void main(String[]  args)
        {   int LIMIT = 100;
            int var;
        System.out.print(LIMIT + " is evenly divisible by ");
           for(var = 1; var <= LIMIT / 2; ++var)
             if(LIMIT % var == 0)
                  System.out.print(var + " ");
              System.out.print(LIMIT);
            System.out.println();
        }
}