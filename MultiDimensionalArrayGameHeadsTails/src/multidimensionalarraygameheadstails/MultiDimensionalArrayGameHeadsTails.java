/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarraygameheadstails;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MultiDimensionalArrayGameHeadsTails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] coins = {{1,0,1},{0,0,1},{1,0,0}};
        
        toDecimal(coins);
    }
    
    public static void toDecimal(int[][] coins)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 to 511 >> ");
        int num = input.nextInt();
        
        for(int row = 0; row < coins.length; row++)
        {
            for(int col = 0; col < coins[row].length; col++)
            {
                if(num % 2 == 0)
                {
                   System.out.print("H");
                }
                else
                {
                    System.out.print("T");
                }
                num /=2;
            }
            System.out.println();
        }
    }
    
}
