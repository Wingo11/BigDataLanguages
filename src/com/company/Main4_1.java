package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main4_1 {
    public static void main(String[] args) {
        try
        {
            System.out.println("Введите текст программы (конец текста пустая строка)");
            String program="";
            String line="";
            Scanner sc=new Scanner(System.in);
            while(sc.hasNextLine())
            {
                line= sc.nextLine();
                if(line.compareTo("")==0)//Если пустая строка
                    break;
                program=program+line+"\n";
            }
            program=program.replaceAll("public","private");
            System.out.println(program);
            File file=new File("MyDerictoriya");
            file.mkdirs();
            if(!file.exists())
                throw new IOException("Не возможно создать дерикторию");
            FileWriter writer=new FileWriter(file.toString()+"//output.txt");
            writer.write(program);
            writer.close();
        }
        catch (IOException ex)
        {
            System.out.println(ex.toString());
        }
    }
}
