/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamelockerpuzzle;

/**
 *
 * @author NJORO
 */
public class GameLockerPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an array of boolean to represent
        //the lockers and initialize them to false meaning 
        //they are all closed
        
        boolean[] lockers = new boolean[100];
        for(int i = 0; i < lockers.length; i++)
        {
            lockers[i] = false;
        }
        solvePuzzle(lockers);
    }
    public static void solvePuzzle(boolean[] lockers)
    {
        for(int f = 0; f < lockers.length; f++)
        {
            lockers[f] = true;
        }
        for(int i = 1; i < lockers.length; i++)
        {
            for(int j = i; j < lockers.length; j += i)
            {
                if(lockers[j] == false)
                {
                    lockers[j] = true;
                }
                else
                    if(lockers[j] == true)
                    {
                        lockers[j] = false;
                    }
            }
        }
        for(int p = 0; p < lockers.length; p++)
        {
            if(lockers[p] == true)
            {
                System.out.print(p + " ");
               
            }
        }
    }
    
}
