/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maltidimensionalarrayswithmethods;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class MaltiDimensionalArraysWithMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] m = getArray();
       sum(m);
       System.out.println("Sum of all elements " + sum(m));
    }
    public static int[][] getArray()
    {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and " +
                           m[0].length + " columns : ");
        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[i].length; j++)
            {
                m[i][j] = input.nextInt();
            }
        }
       return m;
        }
    public static int sum(int[][] m)
    {
        int total = 0;
        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[i].length; j++)
                total += m[i][j];
        }
        return total;
    }
    
}
