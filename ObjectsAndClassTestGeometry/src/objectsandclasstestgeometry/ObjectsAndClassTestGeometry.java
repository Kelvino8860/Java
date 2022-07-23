/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectsandclasstestgeometry;

/**
 *
 * @author NJORO
 */
public class ObjectsAndClassTestGeometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Geometry polygon1 = new Geometry();
        Geometry polygon2 = new Geometry(6,4);
        Geometry polygon3 = new Geometry(10,4,5.6,7.8);
        
        System.out.println("Perimeter of polygon1 is " + polygon1.getPerimeter() +
                           "\nArea of polygon1 is " + polygon1.getArea() + "\n");
        
        System.out.println("Perimeter of polygon2 is " + polygon2.getPerimeter() +
                           "\nArea of polygon2 is " + polygon2.getArea() + "\n");
        
        System.out.println("Perimeter of polygon3 is " + polygon3.getPerimeter() +
                           "\nArea of polygon3 is " + polygon3.getArea());
    }
    
}
