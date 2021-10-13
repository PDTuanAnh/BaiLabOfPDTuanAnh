package com.anhpdt2008110004.Lab4;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account;

        account = new Account(1234,1);
        account.showData();
        account.showDeposit(300);
        account.showData();
        account.showWithdraw(200);
        account.showData();
    }
}
