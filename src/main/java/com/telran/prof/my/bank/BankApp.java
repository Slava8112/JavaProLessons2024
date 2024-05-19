package com.telran.prof.my.bank;

public class BankApp {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100.00); // создание счета
        System.out.println("Before transactions. "); // вывод баланса
        ba1.deposit(74.35); // Внесение средств
        ba1.withdraw(20.00); //снятие средств

        System.out.println("After transactions");
        ba1.display(); // вывод баланса
    }
}
