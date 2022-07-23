/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eliminateduplicate;

/**
 *
 * @author NJORO
 */
public class EliminateDuplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numbers = {1,2,3,4,2,5,6,4,7,8,9,5,3,5,0};
       java.util.Arrays.sort(numbers);
       int length = numbers.length;
       for(int e : numbers)
       System.out.print(e + " ");
       System.out.println(" ");
       length = eliminateDup(numbers, length);
       for(int i = 0; i < length; i++)
       {
           System.out.print(numbers[i] + " ");
       }
    }
    public static int eliminateDup(int[] numbers, int n)
    {
        int[] temp = new int[n];
        int j = 0;
        for(int i = 0; i < n - 1; i++)
        {
            if(numbers[i] != numbers[i + 1])
            {
                temp[j++] = numbers[i];
            }
        }
        temp[j++] = numbers[n - 1];
        for(int i = 0; i < j; i++)
        {
            numbers[i] = temp[i];
        }
    return j;   
    }
    
}
