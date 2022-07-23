/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dicepermutation;

/**
 *
 * @author NJORO
 */
public class DicePermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Dice oneObject = new Dice();
      int dice1 = oneObject.getDice1();
      int dice2 = oneObject.getDice2();
      int dice3 = oneObject.getDice3();
      int[] array = new int[3];
      System.out.println(dice1 + " " + dice2 + " " + dice3);
     int sum = dice1 + dice2 + dice3;
     if(sum == 9)
     {
        array[0] = dice1; array[1] = dice2; array[2] = dice3;
        permutation(array,0);
     }
    }
    public static void printArray(int[] a)
    {  System.out.println("");
        for(int j = 0; j < a.length; j++)
            System.out.print(a[j] + "");
    }
    public static void swap(int[] a, int i, int cid)
    {
        int temp = a[i];
        a[i] = a[cid];
        a[cid] = temp;
    }
    public static void permutation(int[] a, int cid)
    {   if(cid == a.length - 1)
    {
        printArray(a);
        return;
    }
        for(int i = cid; i < a.length; i++)
        {   swap(a, i ,cid);
            permutation(a, cid + 1);
            swap(a, i ,cid);
        }
    }
}
