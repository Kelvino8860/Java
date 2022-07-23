/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsandclassestestcircle;

/**
 *
 * @author NJORO
 */
public class Circle {
    private double radius;
    private static int numberOfObjects = 0;
    
    public Circle()
    {  
        radius = 1;
        numberOfObjects++;
    }
    public Circle(double newRadius)
    {
        radius = newRadius;
        numberOfObjects++;
    }
    public void setRadius(double newRadius)
    {
        radius = (newRadius >= 0)? newRadius : 0;
    }
    public static int getNumberOfObjects()
    {
        return numberOfObjects;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return radius * radius * Math.PI;
    }
}
