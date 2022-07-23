public class Perfect
{  public static void main(String[]  args)
     {  final int LIMIT = 1000;
        int x;
        int val;
        int factor;
           for( x = 1; x <= LIMIT; ++x)
             {  factor = 0;
                for(val = 1; val < x ; ++val)
                   { if(x % val == 0)
                     {  factor += val;
                   }
                     }
                      if( factor == x)   
                 { System.out.print(x + " ");
                      System.out.println();
                     }
               }
       }
}