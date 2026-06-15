package com.example.InterfaceExample;
import java.util.*;
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String messages) {
        super(messages);
    }
}

public class BankAccount {

    double balance = 5000;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        else {
        balance = balance - amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + balance);
        }
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int amount=sc.nextInt();
    	
        BankAccount acc = new BankAccount();

        try {
            acc.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}