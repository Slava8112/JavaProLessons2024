package com.telran.prof.my.bank;

public class BankAccount {
    private double balance; // баланс счетв
    public BankAccount(double openingBalance){ // конструктор
        balance = openingBalance;
    }

    public void deposit(double amount){ // внесение средств
        balance = balance + amount;
    }
    public void withdraw(double amount){ // снятие средств
        balance = balance - amount;
    }
    public void display(){ // вывод баланса
        System.out.println("balance=" + balance);
    }
}
