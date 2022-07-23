/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weather;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class Weather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // creat a multidimensional array
        final int NUMBER_OF_DAYS = 2;
        final int NUMBER_OF_HOURS = 24;
        Scanner input = new Scanner(System.in);
        double[][][] weather = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
        final int LIMIT = NUMBER_OF_DAYS * NUMBER_OF_HOURS;
        //fill array
        System.out.print("Enter day, hour,temperature and humidity >> ");
        for(int i = 0; i < LIMIT; i++)
        {  
             int day = input.nextInt();
             int hours = input.nextInt();
             double temp = input.nextDouble();
             double humidity = input.nextDouble();
            weather[i][hours - 1][0] = temp;
            weather[i][hours - 1][1] = humidity;
        }
        for(int j = 0; j < NUMBER_OF_DAYS; j++)
        {
            double totalTemp = 0; double totalHumidity = 0;
            double averageTemp = 0; double averageHumidity = 0;
            for(int i = 0; i < NUMBER_OF_HOURS; i++)
            {
                totalTemp += weather[j][i][0];
                totalHumidity += weather[j][i][1];
                averageTemp = totalTemp / NUMBER_OF_HOURS;
                averageHumidity = totalHumidity / NUMBER_OF_HOURS;
            }
            System.out.println("Day " + j + "'s average temperature is >> " + averageTemp);
            System.out.println("Day " + j + "'s average humidity is >> " + averageHumidity);
        }
    }
}

