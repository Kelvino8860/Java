public class DiagonalOs
{   public static void main(String[]   args)
       {  int row = 10;
         for(int i = 0; i <= row; ++i) //work for rows
           { for(int j = i; j > 0; --j)   //work for space
                 { System.out.print(" ");
                    }
              for(int j = 0; j < 1; ++j)    //work for columns
               {   System.out.print("O");
                    }
               System.out.println();
            }
        }
}
    