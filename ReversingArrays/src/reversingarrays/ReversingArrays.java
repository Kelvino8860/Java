/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversingarrays;

/**
 *
 * @author NJORO
 */
public class ReversingArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] list = {1, 2, 3, 4, 5, 6};
          reverse(list);
          for(int e : reverse(list))
            System.out.print(e + " ");
         }
public static int[] reverse(int[]  list)
     {  int[] result = new int[list.length];
            for(int i = 0, j = result.length - 1; 
                  i < list.length; ++i, j--)
               {  result[j] = list[i];
                 }
           return result;
        }
    
    
}
