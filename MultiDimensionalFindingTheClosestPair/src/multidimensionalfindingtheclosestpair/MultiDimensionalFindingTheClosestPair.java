/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalfindingtheclosestpair;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class MultiDimensionalFindingTheClosestPair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points >> ");
        int numPoints = input.nextInt();
        
        //create arrays to store points
        double[][] points = new double[numPoints][3];
        for(int i = 0; i < points.length; i++)
        {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
            points[i][2] = input.nextDouble();
        }
        
        //initialize two points
        //p1 and p2 are indices in the points array
        int p1 = 0, p2 = 1;
        double shortDistance = distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0],
                points[p2][1],points[p2][2]);
        //compute distance for every two points
        for(int i = 0; i < points.length; i++)
        {
            for(int j = i + 1; j < points.length; j++)
            {
                double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0],
                                           points[j][1],points[j][2]);
            if(shortDistance > distance)
            {
               p1 = i;
               p2 = j;
               shortDistance = distance;
            } 
            }
        }
        for(int i = 0; i < points.length; i++)
        {
            for(int j = i + 1; j < points.length; j++)
            {
               double distance21 = distance(points[i][0], points[i][1], points[i][2], points[j][0],
                                            points[j][1],points[j][2]);
                if(shortDistance == distance21)
                 {
                     System.out.println("The closest three points are " +
                             " (" + points[i][0] + ", " + points[i][1] + ", " + points[i][2] + ") and ("
                                     + points[j][0] + ", " + points[j][1] + ", " + points[j][2] + ")");
                }
            }
        }
    }
    
    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2)
    {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));
    }
    
}
