public class Population
{   public static void main(String[]   args)
       {  long mexicanPopulation = 128000000;
          long americanPopulation = 323000000;
          double mexicanRate = 1.01;
          double americanRate = 0.15;
          int years = 0;
          double j,k;
             while(years < 10)
               {  ++years;
                 j = Math.pow(1 + mexicanRate, years);
                   mexicanPopulation *= j;
                  k = Math.pow(1 - americanRate, years);
                    americanPopulation *= k;
                      System.out.println("YEAR : " + years + "\nAmerican Population : " + americanPopulation +
                                           "\nMexican Population : " + mexicanPopulation);
                  if(mexicanPopulation > americanPopulation)
                         break;
                 }
          }
}