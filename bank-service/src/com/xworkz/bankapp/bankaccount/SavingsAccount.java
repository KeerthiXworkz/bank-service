package com.xworkz.bankapp.bankaccount;

public class SavingsAccount extends BankAccount{

    double interestRate = 2;
    public void getRateOfInterest(){
      double interest = (getBalance() * interestRate)/100;
      credit(interest);

 }
}
