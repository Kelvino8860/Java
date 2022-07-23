/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarraytic.tac.toe;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MultiDimensionalArrayTicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] array = {{".",",","."},
                            {".",",","."},
                            {",",".",","}};
        
        fillArray(array);
    }
    
    public static void fillArray(String[][] array)
    {
        Scanner input = new Scanner(System.in);
        String xToken = "X", oToken = "O", playerId = "";
        int timesPlay = 0;
        
          for(int row = 0; row < array.length; row++)
             {
                 for(int col = 0; col < array[row].length; col++)
                   {
                          System.out.print(array[row][col] + " ");
                    }
                System.out.println();
             }
       
       do{
           //for player one
       
          System.out.print("Enter a row (0,1 or 2) >> ");
         int row1 = input.nextInt();
          System.out.print("Enter a column (0,1 or 2) >> ");
          int col1 = input.nextInt();
          array[row1][col1] = xToken;
          
           for(int row = 0; row < array.length; row++)
             {
                 for(int col = 0; col < array[row].length; col++)
                   {
                          System.out.print(array[row][col] + " ");
                    }
                System.out.println();
             }
          timesPlay++;
           
           //player one winnings
             //all horizontals
             if(array[0][0].equals(array[0][1]) && array[0][1].equals(array[0][2]))
             {
                 System.out.println(array[0][0] + " player won");
                 break;
             }
             if(array[1][0].equals(array[1][1]) && array[1][1].equals(array[1][2]))
             {
                 System.out.println(array[1][0] + " player won");
                 break;
             }
             if(array[2][0].equals(array[2][1]) && array[2][1].equals(array[2][2]))
             {
                 System.out.println(array[2][0] + " player won");
                 break;
             }
             
             //allaverticles
             if(array[0][0].equals(array[1][0]) && array[1][0].equals(array[2][0]))
             {
                 System.out.println(array[0][0] + " player won");
                 break;
             }
             if(array[0][1].equals(array[1][1]) && array[1][1].equals(array[2][1]))
             {
                 System.out.println(array[0][1] + " player won");
                 break;
             }
             if(array[0][2].equals(array[1][2]) && array[1][2].equals(array[2][2]))
             {
                 System.out.println(array[0][2] + " player won");
                 break;
             }
             
             //all diagonals
             if(array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2]))
             {
                 System.out.println(array[0][0] + " player won");
                 break;
             }
             //reverse diagonals
             if(array[2][2].equals(array[1][1]) && array[1][1].equals(array[0][0]))
             {
                 System.out.println(array[0][0] + " player won");
                 break;
             }
           
            
           
          //for player two
          
          System.out.print("Enter a row (0,1 or 2) >> ");
         int row2 = input.nextInt();
          System.out.print("Enter a column (0,1 or 2) >> ");
          int col2 = input.nextInt();
          array[row2][col2] = oToken;
          
           for(int row = 0; row < array.length; row++)
             {
                 for(int col = 0; col < array[row].length; col++)
                   {
                          System.out.print(array[row][col] + " ");
                    }
                System.out.println();
             }
           
            //player two winnings
             //all horizontals
             if(array[0][0].equals(array[0][1]) && array[0][1].equals(array[0][2]))
             {
                 System.out.println(array[0][0] + " player won");
                 break;
             }
             if(array[1][0].equals(array[1][1]) && array[1][1].equals(array[1][2]))
             {
                 System.out.println(array[1][0] + " player won");
                 break;
             }
             if(array[2][0].equals(array[2][1]) && array[2][1].equals(array[2][2]))
             {
                 System.out.println(array[2][0] + " player won");
                 break;
             }
             
             //allaverticles
             if(array[0][0].equals(array[1][0]) && array[1][0].equals(array[2][0]))
             {
                 System.out.println(array[0][0] + " player won");
                 break;
             }
             if(array[0][1].equals(array[1][1]) && array[1][1].equals(array[2][1]))
             {
                 System.out.println(array[0][1] + " player won");
                 break;
             }
             if(array[0][2].equals(array[1][2]) && array[1][2].equals(array[2][2]))
             {
                 System.out.println(array[0][2] + " player won");
                 break;
             }
             
             //all diagonals
             if(array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2]))
             {
                 System.out.println(array[0][0] + " player won");
                 break;
             }
             //reverse diagonals
             if(array[2][2].equals(array[1][1]) && array[1][1].equals(array[0][0]))
             {
                 System.out.println(array[0][0] + " player won");
                 break;
             }
             
             System.out.println();
             
              if(timesPlay == 5)
             {
                 System.out.println("The game is a draw");
                 break;
             }
           
        }while(true);
    }
    
}
