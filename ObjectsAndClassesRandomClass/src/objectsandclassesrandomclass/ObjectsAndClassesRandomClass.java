/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectsandclassesrandomclass;

import java.util.Random;

/**
 *
 * @author NJORO
 */
public class ObjectsAndClassesRandomClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator1 = new Random(10);
        System.out.print("From generator1: ");
        for(int i = 0; i < 10; i++)
            System.out.print(generator1.nextInt(1000) + " ");
        
        System.out.println();
        
        Random generator2 = new Random(10);
         System.out.print("From generator2: ");
        for(int i = 0; i < 10; i++)
            System.out.print(generator2.nextInt(1000) + " ");
    }
    
}
