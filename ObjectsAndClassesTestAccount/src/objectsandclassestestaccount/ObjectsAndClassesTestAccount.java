/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectsandclassestestaccount;

import java.util.Date;

/**
 *
 * @author NJORO
 */
public class ObjectsAndClassesTestAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account object1 = new Account(1122,20_000);
        object1.setAnnualInterestRate(4.5);
        double balance1 = object1.getBalance() - object1.withdraw(2500);
        object1.setBalance(balance1);
        
        double balance2 = object1.getBalance() + object1.deposit(3000);
        object1.setBalance(balance2);
        
        System.out.println("Balance: $" + object1.getBalance() + "\nMonthly Interest: " +
                           (object1.getMonthlyInterestRate()*100) + "%" + "\nAccount created on: " +
                            object1.getDateCreated());
    }
    
}
