package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private double accountBalance = 0;

    public Account(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Account() {
        this.accountBalance = 0;
    }

    void deposit(double money) {
        accountBalance += money;
    }

    void withdraw(double money) {
        if(accountBalance - money < 0) {
            System.out.println("Insufficient funds for withdrawl.");
        } else {
            accountBalance -= money;
        }
    }

    double getAccountBalance() {
        return accountBalance;
    }
}
