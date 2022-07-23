/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectandclassesstockclass;

/**
 *
 * @author NJORO
 */
public class ObjectAndClassesStockClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stock object1 = new Stock("ORCL","OracleCorporation");
        object1.previousClosingPrice = 34.5;
        object1.currentPrice = 34.35;
        
        System.out.println("The price change percentage is " + object1.getChangePercentage() + "%.");
    }
    
}
