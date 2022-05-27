package com.company;

import java.util.Scanner;


class QueueThread extends Thread
{
    private String doIt;
    public QueueThread(String it)
    {
        this.doIt=it;
    }

    @Override
    public void run() {
        System.out.println(doIt);
    }
}


public class Robot {
    //Реализуем класс Потока

    public static void main(String[] args) throws InterruptedException{
	int cntStep;//Количество шагов
        Scanner cin=new Scanner(System.in);
        cntStep=Integer.parseInt(cin.nextLine());
        while(cntStep>0)
        {
            if(cntStep!=0)
            {
                QueueThread qleft=new QueueThread("<<<<Left");
                cntStep--;
                qleft.start();
                qleft.join();
            }
            if(cntStep!=0)
            {
                QueueThread qright=new QueueThread("Right>>>>>");
                qright.start();
                cntStep--;
                qright.join();
            }
        }
    }
}
