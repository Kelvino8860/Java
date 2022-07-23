/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partitionoflist;

/**
 *
 * @author NJORO
 */
public class PartitionOfList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize the array
        int[] array = {10,1,5,16,61,9,11,1};
        partition(array);
        for(int e : partition(array))
            System.out.print(e + " ");
    }
    
    //pass array to method for partition
    public static int[] partition(int[] array)
    {
        int pivot = array[0];
        int last = array.length - 1;
        int temp;
        
     
        
        for(int i = 1; i < array.length; i++)
        {
            //if the number after the element is less than
            //or equal to the pivot swap positions with pivot
            if(array[i] <= pivot)
            {
                temp = array[i];
                array[i] = pivot;
                array[i - 1] = temp;
            }
            
            //if number after pivot is greter than pivot 
            //swap the element with the last element in array 
            else
            if(array[i] > pivot && last > i)
            {
                temp = array[i];
                array[i] = array[last];
                array[last] = temp;
                last-=1;
                i--;
            }
            else
                break;
        }
        return array;
    }
    
}
