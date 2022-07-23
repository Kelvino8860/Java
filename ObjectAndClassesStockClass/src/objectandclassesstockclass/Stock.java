/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectandclassesstockclass;

/**
 *
 * @author NJORO
 */
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    public Stock(String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercentage()
    {
        return 100 - ((currentPrice * 100)/previousClosingPrice);
    }
}
