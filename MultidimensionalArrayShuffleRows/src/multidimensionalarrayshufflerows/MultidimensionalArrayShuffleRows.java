/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrayshufflerows;

/**
 *
 * @author NJORO
 */
public class MultidimensionalArrayShuffleRows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array = {{1,2},{3,4},{5,6},{7,8},{9,10}};
        shuffle(array);
    }
    
    public static void shuffle(int[][] array)
    {
        int f = (int)(Math.random()*5);
        System.out.println(f);
        
        for(int i = 0; i < array.length; i++)
        {
            int[] temp = array[i];
            array[i] = array[f];
            array[f] = temp;
        }
        
         for(int row = 0; row < array.length; row++)
        {
           for(int col = 0; col < array[row].length; col++)
           {
               System.out.print(array[row][col] + " ");
           }
           System.out.println();
        }
    }
    
}
