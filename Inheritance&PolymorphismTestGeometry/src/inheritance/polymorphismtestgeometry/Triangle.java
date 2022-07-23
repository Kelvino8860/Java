/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.polymorphismtestgeometry;

/**
 *
 * @author NJORO
 */
public class Triangle extends Geometry {
    private double width;
    private double height;
    
    public Triangle()
    {
    }
    
    public Triangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    
    public Triangle(double width, double height, String color, boolean filled)
    {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
    
    /** Return width */
    public double getWidth()
    {
        return width;
    }
    
    /** Set width */
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    /** Return height */
    public double getHeight()
    {
        return height;
    }
    
    /** Set height*/
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    /** Return Area */
    public double getArea()
    {
        return width * height;
    }
    
    /** Return perimeter */
    public double getPerimeter()
    {
        return 2 * (width + height);
    }
}
