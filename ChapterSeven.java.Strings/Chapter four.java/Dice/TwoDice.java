public class TwoDice
{  public static void main(String[]   args)
      { Die die1 = new Die();
        Die die2 = new Die();
        System.out.println("Display value of the first die >> " + die1.getRandomValue());
        System.out.println("Display value of the second die >> " + die2.getRandomValue());
          if(die1.getRandomValue() > die2.getRandomValue())
               System.out.println("The first die has a hire value");
          else
            if(die2.getRandomValue() > die1.getRandomValue())
                 System.out.println("The second die has a hire value");
          else
            if(die1.getRandomValue() == die2.getRandomValue())
               System.out.println("The two dice are equal");
       }
}