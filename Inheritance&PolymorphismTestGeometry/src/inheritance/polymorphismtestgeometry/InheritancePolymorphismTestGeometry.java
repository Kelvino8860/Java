/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance.polymorphismtestgeometry;

/**
 *
 * @author NJORO
 */
public class InheritancePolymorphismTestGeometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circle circle = new Circle(1);
       System.out.println("A circle " + circle.toString());
       System.out.println("The color is " + circle.getColor());
       System.out.println("The radius is " + circle.getRadius());
       System.out.println("The area is " + circle.getArea());
       System.out.println("The diameter is " + circle.getDiameter());
       
       Triangle triangle = new Triangle(2,4);
       System.out.println("\nA rectangle " + triangle.toString());
       System.out.println("The area is " + triangle.getArea());
       System.out.println("The perimeter is " + triangle.getPerimeter());
    }
    
}
