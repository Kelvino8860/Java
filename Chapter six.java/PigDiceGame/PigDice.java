public class PigDice
{  private int valDie1;
   private int valDie2;
   private int totalVal;
   private double valComp;
   private int reset;
   private final int HIGHEST_VAL = 6;
   private final int LOWEST_VAL = 1;
 public PigDice()
   {  roll();
      compRoll();
      reset = 0;
        }
 public void roll()
   {  valDie1 = ((int)(Math.random() * 100) % HIGHEST_VAL + LOWEST_VAL);
      valDie2 = ((int)(Math.random() * 100) % HIGHEST_VAL + LOWEST_VAL);
     }
 public void compRoll()
  {  valComp = Math.random();
     }
 public int getValDie1()
    {  return valDie1;
       }
 public int getValDie2()
    {  return valDie2;
       }
 public double getValComp()
    {  return valComp;
       }
 public int getTotal()
   {  return valDie1 + valDie2;
      }
 public int getReset()
   {  return (valDie1 + valDie2)*0;
     }
}