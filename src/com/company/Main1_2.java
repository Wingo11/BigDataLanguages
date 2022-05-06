package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main1_2 {

    public static double MNKR(Stack<Double>I, Queue<Double>U)
    {
        double n=(double) I.size();
        Stack<Double>revI=new Stack<Double>();  // direct order is needed so stack is used (because stack is LIFO)
        while(!I.empty())
        {
            revI.push(I.pop());  // add
        }
        // approximation using MNK
        double su2,su,si,siu;
        double a,b,d,da,db;
        su2=su=si=siu=0.0;  // initialization
        // sum in MNK
        while(!U.isEmpty())
        {
            su+=U.peek();
            si+=revI.peek();
            su2+=(U.peek()*revI.peek());
            siu+=(U.peek()*revI.peek());
            U.poll();
            revI.pop();
        }
        // basic logic of MNK
        d=n*su2-su*su;
        da=n*siu-su*si;
        db=su2*si-su*siu;
        a=da/d;
        b=db/d;  // regression
        return 1/a;
    }
    public static void main(String[] args)
    {
        Stack<Double>I=new Stack<Double>();
        Queue<Double>U=new LinkedList<Double>();  // because Queue is only an interface
        int n;
        Scanner cin=new Scanner(System.in);  // quantity
        System.out.print("Введите N:");
        n=cin.nextInt();
        System.out.println("Введите "+n+" напряжение тока:");
        for(int i=0;i<n;i++)
        {
            double cur=cin.nextDouble();
            U.add(cur);
        }
        System.out.println("Введите "+n+" сила тока:");
        for(int i=0;i<n;i++)
        {
            double cur=cin.nextDouble();
            I.push(cur);
        }
        double R=MNKR(I,U);
        System.out.printf("%f",R);
    }
}
