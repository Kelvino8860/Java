public class Die
{  private int randomValue;
   private int randomMine;
   private final int HIGHEST_DIE_VALUE = 6;
   private final int LOWEST_DIE_VALUE = 1;
   public Die()
    {  randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
                        LOWEST_DIE_VALUE);
            }
public void setRandomMine(int random)
       {  randomMine = random;
             }
public int getRandomValue()
   {   return randomValue;
        }
public int getRandomMine()
   {  return randomMine;
        }
}