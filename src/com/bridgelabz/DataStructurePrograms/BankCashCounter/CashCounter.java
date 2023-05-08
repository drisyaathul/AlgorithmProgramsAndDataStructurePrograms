package com.bridgelabz.DataStructurePrograms.BankCashCounter;

import java.util.Scanner;

public class CashCounter {
    public static void main(String[] args) {
        Queue<Integer> cashCounterQueue = new Queue<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Initial account balance : ");
        Integer accountBalance = Integer.valueOf(scanner.next());
        cashCounterQueue.enqueue(accountBalance);
        System.out.println("-- CASH COUNTER --");
        System.out.println("1. Cash Deposit\n"+"2. Cash WithDraw\n");
        System.out.println("Choose any Option");
        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Enter the Amount to be Deposit : ");
                Integer amount = Integer.valueOf(scanner.next());
                cashCounterQueue.enqueue(amount);
                accountBalance = accountBalance + amount;
                System.out.println("Current Balance : ");
                System.out.println(accountBalance);
                cashCounterQueue.dequeue();
                break;
            case 2:
                System.out.println("Enter the Amount to be withdraw : ");
                Integer debitAmount = Integer.valueOf(scanner.next());

                if (accountBalance<debitAmount) {
                    cashCounterQueue.enqueue(debitAmount);
                    System.out.println("Insufficient Balance");
                }else {
                    cashCounterQueue.enqueue(debitAmount);
                    accountBalance = accountBalance - debitAmount;
                }
                System.out.println("Current Balance : ");
                System.out.println(accountBalance);
                cashCounterQueue.dequeue();
                break;
        }
    }
}
