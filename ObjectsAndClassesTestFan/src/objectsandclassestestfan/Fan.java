/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsandclassestestfan;

/**
 *
 * @author NJORO
 */
public class Fan {
    public static final int SLOW = 1,MEDIUM = 2,FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    public Fan()
    {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public void setOn(boolean on)
    {
        this.on = on;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    public boolean getOn()
    {
        return on;
    }
    public double getRadius()
    {
        return radius;
    }
    public String getColor()
    {
        return color;
    }
    
    public String toString()
    {
        String result;
        if(on)
          {
             result = "Speed: " + speed + ", Color: " + color +
                       ", Radius: " + radius;
                  }
        else
            result = "Color: " + color + ", Radius: " + radius + "; fan is off.";
        
        return result;
    }
}
