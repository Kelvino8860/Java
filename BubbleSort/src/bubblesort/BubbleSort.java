/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

/**
 *
 * @author NJORO
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create array
        int numbers[] = {1,2,3,5,7,4,8,3,9,6,10};
        sortMethod(numbers);
        for(int e : sortMethod(numbers))
        System.out.print(e + " ");
    }
    public static int[] sortMethod(int[] numbers)
    { for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers.length - 1; j++)
            {
                if(numbers[j] < numbers[j + 1])
                {
                    var temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
         }
    return numbers;
    }
}
