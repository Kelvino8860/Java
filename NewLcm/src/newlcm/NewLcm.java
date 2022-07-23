/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newlcm;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class NewLcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        System.out.print("Enter 5 integers >> ");
        for(int i = 0; i < number.length; ++i)
        {
            number[i] = input.nextInt();
        }
        lcm(number);
        System.out.println("The lcm is: " + lcm(number));  
    }
    public static int lcm(int...number)
    {  int temp = number[0];
        for(int i = 0; i < number.length; ++i)
        {
            if(number[i] > temp)
            {
                temp = number[i];
            }
        }
        while(true)
        { if(temp % number[0] == 0 && temp % number[1] == 0 &&
           temp % number[2] == 0 && temp % number[3] == 0 && 
                temp % number[4] == 0)
            return temp;
        else
            ++temp;
        }
    }
    
}
