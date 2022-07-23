/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectsandclassestestcircle;

/**
 *
 * @author NJORO
 */
public class ObjectsAndClassesTestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circle c1 = new Circle();
       Circle c2 = new Circle(5);
       Circle c3 = new Circle(1);
       int value = 5;
       calculateArea(c3,value);
      
       
       System.out.println("The area of the circle of radius " + c1.getRadius() +
                  " is " + c1.getArea());
       System.out.println("The area of the circle of radius " + c2.getRadius()*3 +
                  " is " + c2.getArea());
       System.out.println("The number of objects created are " + Circle.getNumberOfObjects());
    }
    public static void calculateArea(Circle c, int times)
    {
        System.out.println("Radius \t\tArea");
        while(times >= 1)
        {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
    
}
