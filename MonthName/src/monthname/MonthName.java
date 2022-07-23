/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monthname;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MonthName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] array = {"January","February","March","April","May","June",
                          "July","August","September","October","November","December"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 12 to display month of year >> ");
        int key = input.nextInt();
        
        display(array,key);
    }
    public static void display(String[] a, int b)
    {
        switch(b)
                {
                    case 1:
                    {
                       System.out.println(a[0]);
                    }
                    case 2:
                    {
                        System.out.println(a[1]);
                    }
                      case 3:
                    {
                        System.out.println(a[2]);
                    }
                      case 4:
                    {
                        System.out.println(a[3]);
                    }
                      case 5:
                    {
                        System.out.println(a[4]);
                    }
                      case 6:
                    {
                        System.out.println(a[5]);
                    }
                      case 7:
                    {
                        System.out.println(a[6]);
                    }
                      case 8:
                    {
                        System.out.println(a[7]);
                    }
                      case 9:
                    {
                        System.out.println(a[8]);
                    }
                      case 10:
                    {
                        System.out.println(a[9]);
                    }
                      case 11:
                    {
                        System.out.println(a[10]);
                    }
                      case 12:
                    {
                        System.out.println(a[11]);
                    }
                }
        
    }
    
}
