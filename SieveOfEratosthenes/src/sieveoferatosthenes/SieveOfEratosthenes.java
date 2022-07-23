/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sieveoferatosthenes;

/**
 *
 * @author NJORO
 */
public class SieveOfEratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialize your limit
        //create a boolean array and initialize it to true
        //with a length of limit + 1
        int limit = 50;
        boolean[] prime = new boolean[limit + 1];
        for(int i = 0; i <= limit; ++i)
        {
            prime[i] = true;
        }
        
        //create a loop through the limit
        //if the number multiplied by itself is within the limit
        //it continues to the if...statement
        for(int p = 2; p * p <= limit; ++p)
            if(prime[p] == true)
            {
                //create a loop through the limit to get rid of all
                //multiples of the number and icrementing it with the
                //number itself.If the number is a multiple set it to false
                for(int i = p * p; i <= limit; i += p)
                {
                    prime[i] = false;
                }
            }
        //Display all the prime numbers
        for(int i = 2; i <= limit; ++i)
        {
            if(prime[i] == true)
            {
                System.out.print(i + " ");
            }
        }
    }
    
}
