public class DrugTest
{    public static void main(String[]  args)
          {  int numEmployee;
             final int NUMBER_LINE = 4;
             final int WEEK = 54;
             int count;
             int i;
                      for(i = 1; i <= WEEK; ++i)
                         {   numEmployee = 1 + (int) (Math.random() * 30);
                              System.out.print(numEmployee + " ");
                            if(i % (NUMBER_LINE)== 0)
                                      System.out.println();
                          }
             }
}