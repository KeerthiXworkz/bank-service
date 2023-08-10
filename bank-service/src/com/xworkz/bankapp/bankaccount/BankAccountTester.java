package com.xworkz.bankapp.bankaccount;
   // FQCN =fully qualified class name
import java.time.LocalDate;

public class BankAccountTester {

    public static void main(String []bank){

        BankAccount myAccount = new SavingsAccount();

        myAccount.credit(2000);
        System.out.println("balance of my account is "+ LocalDate.now()+" "+ myAccount.getBalance());

        myAccount.debit(500);
        System.out.println("balance of my account after debit is"+ LocalDate.now()+" "+myAccount.getBalance());

        BankAccount hotelAccount = new SavingsAccount();
        myAccount.transfer(700,hotelAccount);
        System.out.println("Balance on myaccount" + myAccount.getBalance());

        BankAccount fatherAccount = new SavingsAccount();
        myAccount.transfer(300 ,fatherAccount);
        System.out.println("balance on my myaccount" + myAccount.getBalance());
        fatherAccount.transfer(200 ,myAccount);
        System.out.println("balance on myAccount" + LocalDate.now()+" "+myAccount.getBalance());

        BankAccount teaStallAccount = new SavingsAccount();
        myAccount.transfer(100 ,teaStallAccount);
        System.out.println("balance on myAccount" + LocalDate.now()+" "+myAccount.getBalance());

        System.out.println("after claculating the rate of interest");

         SavingsAccount interest = new SavingsAccount();
        interest.credit(10000);
        System.out.println("balance on savings account"+interest.getBalance());
         interest.getRateOfInterest();
        System.out.println("balance on savings account"+interest.getBalance());

    }
}
