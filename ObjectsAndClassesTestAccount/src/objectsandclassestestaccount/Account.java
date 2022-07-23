/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsandclassestestaccount;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author NJORO
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account()
    {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    public Account(int id,double balance)
    {
        this.id = id;
        this.balance = balance;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated()
    {
        return dateCreated = new Date();
    }
    public int getId()
    {
        return id;
    }
    public double getBalance()
    {
        return balance;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/1200;
    }
    public double getMonthlyInterest()
    {
        return balance * getMonthlyInterestRate();
    }
    public double withdraw(double withdraw)
    {
       return withdraw;
    }
    public double deposit(double deposit)
    {
        return deposit;
    }
}
