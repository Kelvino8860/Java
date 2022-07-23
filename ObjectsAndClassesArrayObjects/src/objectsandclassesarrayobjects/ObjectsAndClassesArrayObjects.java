/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectsandclassesarrayobjects;

/**
 *
 * @author NJORO
 */
public class ObjectsAndClassesArrayObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Declare circle array
        Circle[] circleArray;
        
        //initialize circleArray
        circleArray = creatCircleArray();
        
        //print array and total areas of the circle
        printCircleArray(circleArray);
    }
    
    //creat array of circle objects
    public static Circle[] creatCircleArray()
    {
      Circle[] circleArray = new Circle[5];
      
      for(int i = 0; i < circleArray.length; i++)
      {
          circleArray[i] = new Circle((int)(Math.random()*100));
      }
      
      //return circle array
      return circleArray;
    }
    //print an array of circles and their area
    public static void printCircleArray(Circle[] circleArray)
    {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for(int i = 0; i < circleArray.length; i++)
        {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        
        System.out.println("________________________________________");
        
        //compute and display results
        System.out.printf("%-30s%-15f\n", "The total area of circles  is",
                           sum(circleArray));
    }
    
    //add circle areas
    public static double sum(Circle[] circleArray)
    {
        double sum = 0;
         
        //add areas to sum
        for(int i = 0; i < circleArray.length; i++)
        {
            sum += circleArray[i].getArea();
        }
        return sum;
    }
    
}
