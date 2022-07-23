/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package permutations;



/**
 *
 * @author NJORO
 */
public class Permutations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       permute("1453");
    }
    public static void permute(String full)
    {
        if(full == null || full.length() == 0)
        {
            System.out.println("You must provide a string of length > 0");
            return;
        }
        permute("",full);
    }
    private static void permute(String prefix, String remaining)
    {
        if(remaining.length() == 0)
        {
            System.out.println(prefix);
            return;
        }
        for(int i = 0; i < remaining.length(); i++ )
        {
            permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1,
                      remaining.length()));
        }
    }
}