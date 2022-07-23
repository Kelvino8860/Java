/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectsandclassesrandomclass2;

import java.util.Random;

/**
 *
 * @author NJORO
 */
public class ObjectsAndClassesRandomClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator2 = new Random(1000);
        System.out.print("From generator2 >> ");
        for(int i = 0; i < 50; i++)
            System.out.print(generator2.nextInt(100) + " ");
    }
    
}
