public class FiveDice
{  public static void main(String[]   args)
      { Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die();
        Die die4 = new Die();
        Die die5 = new Die();
        die1 = getData(die1);
        die2 = getData(die2);
        die3 = getData(die3);
        die4 = getData(die4);
        die5 = getData(die5);
        System.out.println("Display computer's value of the first die >> " + die1.getRandomValue());
        System.out.println("Display computer's value of the second die >> " + die2.getRandomValue());
        System.out.println("Display computer's value of the third die >> " + die3.getRandomValue());
        System.out.println("Display computer's value of the fourth die >> " + die4.getRandomValue());
        System.out.println("Display computer's value of the fifth die >> " + die5.getRandomValue());
       }
 public static Die getData(Die details)
    {  int randomValue;
       final int HIGHEST_DIE_VALUE = 6;
       final int LOWEST_DIE_VALUE = 1;
       randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
                       LOWEST_DIE_VALUE);
       details.setRandomMine(randomValue);
        System.out.println("Display value of my dice >> " + details.getRandomMine());
      return details;
    }
}