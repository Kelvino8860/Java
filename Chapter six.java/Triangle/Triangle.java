public class Triangle
{   public static void main(String[]   args)
        {  int row = 10;
           int i,j,k;
             for(i = 1; i < row; i += 2)
              {   for(k = 0; k < (row - i / 2); ++k)
                     { System.out.print(" ");
                          }
                   for(j = 0; j < i  ; ++j)
                      {   System.out.print("T");
                          }
                   System.out.println();
               }
        }
}