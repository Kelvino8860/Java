public class IncreasedProduction
{    public static void main(String[]  args)
         {  final double RATE = 6/100;
            final int LIMIT_M = 24;
            final int EXCEEDS = 7000;
            double production = 4000;
                   for(int m = 1; m <= LIMIT_M; ++m)
                        { double k = Math.pow((1.0 + 0.06), m); 
                          production *= k;
                                if(production > 7000)
                                  {  System.out.println("Monthly output : " + production);
                                     System.out.println("Your production exceeds : " + EXCEEDS);
                                     System.out.println("Month number : " + m + "\nWorker deserves a raise.");
                                   }
                                else
                                    {  System.out.println("Monthly output : " + production);
                                       System.out.println("Your production is below " + EXCEEDS + " parts" + "\nNo raise!!!");
                                     }   
                           }
        }
}