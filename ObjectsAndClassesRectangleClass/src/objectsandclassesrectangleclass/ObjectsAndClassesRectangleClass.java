/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectsandclassesrectangleclass;

/**
 *
 * @author NJORO
 */
public class ObjectsAndClassesRectangleClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create two rectangle objects
        Rectangle object1 = new Rectangle(4,40);
        Rectangle object2 = new Rectangle(3.5,35.9);
        display(object1,object2);
    }
    public static void display(Rectangle t, Rectangle r)
    {
        System.out.println("The width of rectangle-1 is " + t.width +
                "\nThe height of rectangle-1 is " + t.height + "\nThe area of rectangle-1 is " + 
                   t.getArea() + "\nThe perimeter of rectangle-1 is " + t.getPerimeter() + "\n");
        
        System.out.println("The width of rectangle-2 is " + r.width +
                "\nThe height of rectangle-2 is " + r.height + "\nThe area of rectangle-2 is " + 
                   r.getArea() + "\nThe perimeter of rectangle-2 is " + r.getPerimeter());
    }
    
}
