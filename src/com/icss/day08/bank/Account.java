package com.icss.day08.bank;

public class Account {
    private double balance;

    public Account(double init_balance){
            this.balance = init_balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amt){
        this.balance += amt;
        System.out.println("存入"+amt+"元");
    }

    public void withdraw(double amt){
        this.balance -= amt;
        System.out.println("取出"+amt+"元");
    }

    @Override
    public String toString() {
        return this.balance+"元";
    }
}
