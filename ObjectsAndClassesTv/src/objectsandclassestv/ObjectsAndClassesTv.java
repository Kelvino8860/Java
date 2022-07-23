/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectsandclassestv;

/**
 *
 * @author NJORO
 */
public class ObjectsAndClassesTv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TvClass tv1 = new TvClass();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TvClass tv2 = new TvClass();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
    
}
