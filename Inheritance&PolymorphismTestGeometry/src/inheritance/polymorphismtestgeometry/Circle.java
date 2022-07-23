/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.polymorphismtestgeometry;

/**
 *
 * @author NJORO
 */
public class Circle extends Geometry {
    private double radius;
    
    public Circle()
    {  
    }
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    
    /** Return radius*/
    public double getRadius()
    {
        return radius;
    }
    
    /** Set radius*/
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    /** Return Area */
    public double getArea()
    {
        return radius * radius * Math.PI;
    }
    
    /** Return diameter */
    public double getDiameter()
    {
        return 2 * radius;
    }
    /** Return Perimeter */
    public double getPerimeter()
    {
        return radius * 2 * Math.PI;
    }
    
    /** Print the circle info */
    public void printCircle()
    {
        System.out.println("The circle is created " + getDateCreated() +
                           " and the radius is " + radius);
    }
}
