package com.anhpdt2008110004.Lab4;

public class Account {
    int number_account;
    int number_balance;

    Account(int a, int b){
    number_account = a;
    number_balance = b;
    }

    public void showData() {
        System.out.println("Account Number = "+number_account);
        System.out.println("Account Balance = "+number_balance+" tỷ");
    }

    public void showDeposit(int money) {
        number_balance += money; 
    }
    
    public void showWithdraw(int money) {
        number_balance -= money; 
    }    
}
