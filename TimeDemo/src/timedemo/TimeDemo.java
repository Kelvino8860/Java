/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timedemo;

/**
 *
 * @author NJORO
 */
public class TimeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time timeObject = new Time();
        System.out.println(timeObject.toMilitary());
        timeObject.setTime(4, 50, 45);
        System.out.println(timeObject.toMilitary());
    }
    
}
