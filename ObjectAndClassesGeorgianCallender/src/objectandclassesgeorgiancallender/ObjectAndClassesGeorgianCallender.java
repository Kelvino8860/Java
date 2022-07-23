/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectandclassesgeorgiancallender;

import java.util.GregorianCalendar;

/**
 *
 * @author NJORO
 */
public class ObjectAndClassesGeorgianCallender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar object1 = new GregorianCalendar();
        System.out.println("Year: " + object1.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + object1.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + object1.get(GregorianCalendar.DAY_OF_MONTH)); 
        
        System.out.println();
        
        GregorianCalendar object2 = new GregorianCalendar();
        object2.setTimeInMillis(1234567898765L);
        System.out.println("Year: " + object2.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + object2.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + object2.get(GregorianCalendar.DAY_OF_MONTH)); 
    }
    
}
