/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomnumberselector;
import java.util.Random;
/**
 *
 * @author NJORO
 */
public class RandomNumberSelector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[] numbers = {1,34,45,80,90,40,56,2,36,50};
     getRandom(numbers);
     System.out.println(getRandom(numbers));
    }
    public static int getRandom(int...numbers)
    {   Random num = new Random();
        int temp = numbers[num.nextInt(numbers.length)];
        return temp;
    }
    
}
