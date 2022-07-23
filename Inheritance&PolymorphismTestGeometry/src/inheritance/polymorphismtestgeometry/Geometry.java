/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.polymorphismtestgeometry;

/**
 *
 * @author NJORO
 */
public class Geometry {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;
    
    /** Construct a default geometry object */
    public Geometry()
    {
       dateCreated = new java.util.Date();
    }
    /** Construct a geometry object with  the specified color
        and filled value*/
    public Geometry(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;        
    }
    
    /** Return color*/
    public String getColor()
    {
        return color;
    }
    
    /** Set a new color*/
    public void setColor(String color)
    {
        this.color = color;
    }
    
    /** Return filled. Since filled is boolean its getter method is
        is named isFilled*/
    public boolean isFilled()
    {
        return filled;
    }
    
    /** Set a new filled*/
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    
    /** get dateCreated */
    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }
    
    /** Return a string representation of this object*/
    public String toString()
    {
        return "Cretated on " + dateCreated + "\nColor " + color +
                " and filled: " + filled;
    }
    
}
