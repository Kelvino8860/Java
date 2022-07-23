/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decendingbubblesort;

/**
 *
 * @author NJORO
 */
public class DecendingBubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {1,2,5,7,4,8,3,9,6,10};
        bubbleSort(numbers);
        for(int e : bubbleSort(numbers))
            System.out.print(e + " ");
    }
    public static int[] bubbleSort(int[] numbers)
    {
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers.length - 1; j++)
            {
                if(numbers[j] < numbers[j + 1])
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
    
}
