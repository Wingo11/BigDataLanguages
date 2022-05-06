package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main3_1 {  // edit configuration -> build and run -> set program arguments to
    // C://Users//Wingo//IdeaProjects//BigDataLanguages// input.txt output.txt
     public static String DelSubString(String source,String del)
     {
         return source.replace(del,"");
     }

    public static void main(String[] args) {
     try
     {
         System.out.println(args[1]);
         if(args.length<3)
             throw new IOException("Недостаточно параметров");
         File inp=new File(args[0]+args[1]);
         File out=new File(args[0]+args[2]);
         if(!inp.isFile())
             throw new IOException("Ошибка: входной файл не существует");
         if(!out.isFile())  // file does not exist
         {
            out.createNewFile();
         }
         FileReader reader=new FileReader(inp);
         Scanner sc=new Scanner(reader);
         FileWriter writer=new FileWriter(out);
         Scanner cin=new Scanner(System.in);
         System.out.println("Введите подстроку: ");
         String sub= cin.next();
         while(sc.hasNextLine())
         {
             String str=sc.nextLine();
             str=DelSubString(str,sub);
             writer.write(str+"\n");
         }
         reader.close();;
         writer.close();
     }
     catch (IOException ex)
     {
         System.out.println(ex.toString());
     }
    }
}
