package com.company;

import java.util.Random;

public class Bank {
    public int balance;
    Random random = new Random();

    public static void main(String[] args){

        System.out.println("Start");
        new Bank().doStart();
    }
    void doStart() {
        balance = 0;
        new Thread(minus).start();
        new Thread(plus).start();
    }

    Runnable minus = new Runnable() {
        @Override
        public void run() {
            while (true) {
                int sum = random.nextInt(10000);
                if (sum > balance) {
                    System.out.println("Недостаточный баланс");
                } else {
                    balance -= sum;
                    System.out.println("Текущий баланс = " + balance);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    Runnable plus = new Runnable() {
        @Override
        public void run() {
            while (true) {
                int sum = random.nextInt(10000);
                balance += sum;
                System.out.println("Текущий баланс = " + balance);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
}
