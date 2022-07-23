/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dicepermutation;

/**
 *
 * @author NJORO
 */
public class Dice {
    private final int LARGEST_NUM = 6;
    private final int SMALLEST_NUM = 1;
    private int dice1,dice2,dice3;
 public Dice()
 {
     
 }
 public int getDice1()
 {
     return dice1 = (int)(Math.random()*LARGEST_NUM + SMALLEST_NUM);
 }
 public int getDice2()
 {
     return dice2 = (int)(Math.random()*LARGEST_NUM + SMALLEST_NUM);
 }
 public int getDice3()
 {
     return dice3 = (int)(Math.random()*LARGEST_NUM + SMALLEST_NUM);
 }
}
