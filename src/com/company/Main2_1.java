package com.company;

import java.util.Scanner;

public class Main2_1 {
    public static void main(String[] args) {
        Numbers nm=new Numbers();
        boolean quit=false;
        Scanner cin=new Scanner(System.in);
        while (! quit)
        {
            System.out.println("1 -Добавить число: ");
            System.out.println("2 -Удалить число: ");
            System.out.println("3 -Найти ближайшее число к заданному: ");
            System.out.println("4 -Выход: ");
            byte cn= cin.nextByte();
            switch (cn)
            {
                case 1:
                {
                    System.out.println("Введите число");
                    double num=cin.nextDouble();
                    nm.add(num);
                    System.out.println("=================После переобразования==============");
                    System.out.println(nm);
                    break;
                }
                case 2:
                {
                    System.out.println("Введите число для удаления");
                    double num=cin.nextDouble();
                    nm.remove(num);
                    System.out.println("=================После переобразования==============");
                    System.out.println(nm);
                    break;
                }
                case 3:
                {
                    System.out.println("Введите число для нахождения ближайшего");
                    double m= cin.nextDouble();
                    System.out.println("Самое близкое: "+nm.findNear(m));
                    break;
                }
                case 4:
                {
                    quit=true;
                    break;
                }

            }
        }

    }
}
