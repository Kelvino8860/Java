import java.util.Scanner;
public class Die2
{  private int randomValue1;
   private int randomValue2;
   private int total;
   private final int HIGHEST_DIE_VALUE = 6;
   private final int LOWEST_DIE_VALUE = 1;
   public Die2()
    {   roll(); 
         }
public void roll()
    {    randomValue1 = ((int)(Math.random() * 100) %  + HIGHEST_DIE_VALUE +
                      LOWEST_DIE_VALUE);
             randomValue2 = ((int)(Math.random() * 100) %  + HIGHEST_DIE_VALUE +
                      LOWEST_DIE_VALUE);
           }
public int getTotal()
   {  return randomValue1 + randomValue2;
      }
public int getRandomValue1()
       {  return randomValue1;
             }
public int getRandomValue2()
      {  return randomValue2;
           }
}