/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsandclassesrectangleclass;

/**
 *
 * @author NJORO
 */
public class Rectangle {
     double width;
     double height;
    
    public Rectangle()
    {
        width = 1;
        height = 1;
    }
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public double getArea()
    {
        return width*height;
    }
    public double getPerimeter()
    {
        return 2*(width + height);
    }
}
