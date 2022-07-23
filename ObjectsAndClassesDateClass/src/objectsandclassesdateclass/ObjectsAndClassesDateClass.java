/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectsandclassesdateclass;

/**
 *
 * @author NJORO
 */
public class ObjectsAndClassesDateClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println("The elapsed time since Jan 1, 1970 is " +
                date.getTime() + " milliseconds");
        System.out.println(date.toString());
    }
    
}
