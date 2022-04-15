package com.company;

public class Var4_1 {

    public static void main(String[] args) {
        System.out.println("Вариант 4 №1");
        int m =2;
        Cours[] cours = new Cours[m];
        for (int i = 0; i < m; i++) {
            cours[i] = new Cours(i);
            cours[i].createfile();
        }
    }
}
