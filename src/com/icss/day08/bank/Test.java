package com.icss.day08.bank;

public class Test {
    public static void main(String[] args) {
        Account a = new Account(10000);
        System.out.println("创建一个账户，并存入"+a);
        a.deposit(500);
        a.withdraw(8000);
        System.out.println("The account has a balance of "+a.getBalance()+" yuan");

    }
}
