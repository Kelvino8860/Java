/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsandclasstestgeometry;

/**
 *
 * @author NJORO
 */
public class Geometry {
    private int n;
    private double side;
    private double x;
    private double y;
    
    public Geometry()
    {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    
    public Geometry(int n, double side)
    {
        this.n = n;
        this.side = side;
        x = 0; y = 0;
    }
    
    public Geometry(int n, double side, double x, double y)
    {
        this.n = n;  this.side = side; this.x = x; this.y = y;
    }
    
    public void setN(int n)
    {
        this.n = n;
    }
    public void setSide(double side)
    {
        this.side = side;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public void sety(double y)
    {
        this.y = y;
    }
    
    public int getN()
    {
        return n;
    }
    public double getSide()
    {
        return side;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    
    public double getPerimeter()
    {
        return n * side;
    }
    public double getArea()
    {
        double calc1 = n * (side*side);
        double calc2 = 4 * Math.tan(Math.PI/n);
        double area = calc1 / calc2;
        
        return area;
    }
}
