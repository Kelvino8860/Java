/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package couponcollectorsproblem;

/**
 *
 * @author NJORO
 */
public class CouponCollectorsProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //creat an array for deck of 52 cards
       //array for suit
       //array for rank
       int[] deck = new int[52];
       String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
       String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10",
                         "Jack","Queen","King"};
       cardsMethod(deck,suits,ranks);
    }
    public static void cardsMethod(int[] decks, String[] suits, String[] ranks)
    {
        //Initialize the cards
        for(int i = 0; i < decks.length; i++)
            decks[i] = i;
        
        //pick four cards
        int countSpades = 0, countHearts = 0, countDiamonds = 0, countClubs = 0;
        int j, countPicks = 1; String Suit = null,Ranks = null;
       while(true)
       {
            //shufle the cards
        for(int i = 0; i < decks.length; i++)
        {
          int index = (int)(Math.random() * decks.length);
          int temp = decks[i];
          decks[i] = decks[index];
          decks[index] = temp;
        }
        for(j = 0; j < 4; j++)
        {
            Suit = suits[decks[j] / 13];
            Ranks = ranks[decks[j] % 13];
            System.out.println("Card number " + decks[j] + ": " + Ranks + " of " +
                                Suit);
            //use if...statements to determine how many times
            //a suit appears in the four cards picked each round
            if(Suit.equals(suits[0]))
                countSpades++;
            if(Suit.equals(suits[1]))
                countHearts++;
            if(Suit.equals(suits[2]))
                countDiamonds++;
            if(Suit.equals(suits[3]))
                ++countClubs;
           
        }
        System.out.println();
        if(countSpades == 1 && countHearts == 1 && countDiamonds == 1 && countClubs == 1)
        { 
            System.out.println("Perfect");
           break;
        }
            countSpades = 0; countHearts = 0;
            countDiamonds = 0; countClubs = 0;
        countPicks++;
       }
       System.out.println("Number of picks " + countPicks);
    }
    
}
