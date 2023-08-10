package com.xworkz.bankapp.bankaccount;

public class BankAccount {

     private double balance;
    public BankAccount() {

    }
     public BankAccount(double balance) {

        this.balance = balance;
    }

    public void credit(double amount) {
        if (amount > 0)
            this.balance = balance + amount;
        else
            System.out.println("amount should be greater then zero");
    }
    public void debit(double amount){
        if(amount <= balance)
            this.balance = balance - amount;
        else
            System.out.println("insuffient balance");
    }
    public void transfer(double amount, BankAccount benefeciaryAccount){
        this.debit(amount);
        benefeciaryAccount.credit(amount);

    }
    public double getBalance(){

        return balance;
    }
}
