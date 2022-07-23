/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package permutationaarray;

/**
 *
 * @author NJORO
 */
public class PermutationaArray {

    /**
     * @param args the command line arguments
     */
   
    public static void printArray(int[] arrays)
    {    System.out.println("");
        for(int i = 0; i < arrays.length; i++)
        System.out.print(arrays[i] + " ");
    }
    public static void swap(int[] arrays, int i, int cid)
    {
        int temp = arrays[i];
        arrays[i] = arrays[cid];
        arrays[cid] = temp;
    }
    public static void printPermutations(int[] arrays, int cid)
    {
        if(cid == arrays.length - 1)
        {
         printArray(arrays);
         return;
        }
        
        for(int i = cid; i < arrays.length; i++)
        {  
            swap(arrays, i, cid);
            printPermutations(arrays, cid+1);
            swap(arrays, i, cid);
        }
    }
     public static void main(String[] args) {
       int[] arrays = {6786,4578,9060,3457};
       printPermutations(arrays, 0);
    }
    
}
