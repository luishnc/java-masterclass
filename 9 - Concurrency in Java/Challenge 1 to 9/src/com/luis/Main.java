package com.luis;

public class Main {

    public static void main(String[] args) {

        BankAccountMy account = new BankAccountMy("12345-678", 1000.00);
//Option 1 (my solution)
        Thread customer1 = new Thread(){
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
                System.out.println(account.getBalance());
            }
        };

        Thread customer2 = new Thread(){
            @Override
            public void run() {
                account.deposit(203.75);
                account.deposit(100.00);
                System.out.println(account.getBalance());

            }
        };

        //option 2 (Tim 2nd option) just implemented Runnable new Thread(new Runnable(){}
        customer1.start();
        customer2.start();



    }
}
