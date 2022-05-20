package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Locale;
import java.util.logging.SocketHandler;


public class Main {
    public static void main(String[] args) {
      boolean quit=false;
      Scanner cin=new Scanner(System.in);
      while(!quit)
      {
          System.out.println("11 -Вариант 1, задание 1");
          System.out.println("110 -Вариант 1, задание 10");
          System.out.println("21 -Вариант 2, задание 1");
          System.out.println("210 -Вариант 2, задание 10");
          System.out.println("31 -Вариант 3, задание 1");
          System.out.println("310 -Вариант 3, задание 10");
          System.out.println("41 -Вариант 4, задание 1");
          System.out.println("410 -Вариант 4, задание 10");
          System.out.println("5 -Выход");
          int cmd=Integer.parseInt(cin.nextLine());
          switch (cmd)
          {
              case 11:
              {
                  System.out.println("Вариант 1 №1");
                  System.out.println("Введите текст: ");
                  String text= cin.nextLine();  // enter text
                  int k;
                  System.out.println("Введите k: ");
                  k = Integer.parseInt(cin.nextLine());
                  char ch;
                  System.out.println("Введите символ для замены: ");
                  ch=cin.nextLine().charAt(0);
                  System.out.println(WorkText.changeKSymbolWord(text,k,ch));
                  break;
              }
              case 110:
              {
                  System.out.println("Вариант 1 №10");
                  String text2 = "Hello, " +
                          "How (are you doing, " +
                          "I am fine, " +
                          ")I am done.";
                  StringBuilder str = new StringBuilder(text2);
                  System.out.print("Введите символы для удаления через пробел - ");
                  String[] in_word;
                  Scanner in2 = new Scanner(System.in);
                  in_word = in2.nextLine().split(" ");
                  System.out.println(Arrays.toString(in_word));
                  System.out.println(str);
                  int i1 = text2.indexOf(in_word[0]);
                  int i2 = text2.indexOf(in_word[1]);
                  System.out.println(text2.length());
                  System.out.println(i1+" "+i2);
                  for (int i =i1; i!=i2+1; i++){
                      // text2 = text2.(String.valueOf(text2.charAt(i)), "7"), ;
                      str.setCharAt(i, '7');
                  }
                  text2 = str.toString().replace("7", "");
                  System.out.println(text2);
                  break;
              }
              case 21:
              {
                  System.out.println("Вариант 2 №1");
                  System.out.println("Введите текст: ");
                  String text= cin.nextLine();
                  WorkText.PairPolindrom(text);
                  break;
              }
              case 210:
              {
                  System.out.println("\nВариант 2 №10");

                  String[] alph = "a b c d e f g h i j k l m n o p q r s t u v w x y z".split(" ");
                  String text4 = "Hello, " +
                          "How (are you doing, 2345 " +
                          "I am 523 fine, " +
                          ")I am done.";
                  String[] words4 = text4.split(" ");
                  String result = "";
                  boolean str_res = false;
                  for (int i=0; i!= words4.length; i++){
                      for (int j=0; j!=words4[i].length(); j++){
                          if (!Arrays.asList(alph).contains(String.valueOf(words4[i].charAt(j)).toLowerCase(Locale.ROOT))){
                          } else {
                              str_res = false;
                          }
                      }
                      if (str_res && words4[i].length() > result.length()){
                          result = words4[i];
                      }
                      str_res  =true;
                  }
                  System.out.println(result);
                  break;
              }
              case 31:
              {
                  System.out.println("Вариант 3 №1");
                  System.out.println("Введите текст: ");
                  String text= cin.nextLine();
                  WorkText.CyclikWords(text);
                  System.out.println("\n");
                  break;
              }
              case 310:
              {
                  System.out.println("Вариант 3 №10");
                  String[] alph6 = "a e i o u y".split(" ");
                  String text6 = "Hello, " +
                          "How (are you doing, 2345 " +
                          "I am 523 fine, " +
                          ")I am done.";
                  String[] words6 = text6.split(" ");
                  int[] words_mass = new int[words6.length];
                  System.out.println(text6);
                  for (int i = 0; i!=words6.length; i++){
                      int gl_count=0;
                      for (int j=0; j!=words6[i].length(); j++){
                          if (Arrays.asList(alph6).contains(String.valueOf(words6[i].charAt(j)).toLowerCase(Locale.ROOT))){
                              gl_count+=1;
                          }
                      }
                      words_mass[i] = gl_count;
                  }

                  for (int i=0; i!=words_mass.length; i++){
                      for (int j=0; j!=words_mass.length; j++){
                          if (words_mass[i] < words_mass[j]){
                              int cash = words_mass[i];
                              words_mass[i] = words_mass[j];
                              words_mass[j] = cash;

                              String cashS = words6[i];
                              words6[i] = words6[j];
                              words6[j] = cashS;
                          }
                      }
                  }
                  System.out.println(Arrays.toString(words6));
                  break;
              }
              case 41:
              {
                  System.out.println("Вариант 4 №1");
                  System.out.println("Введите текст: ");
                  String text= cin.nextLine();
                  char sym;
                  System.out.println("Введите букву: ");
                  sym=cin.nextLine().charAt(0);
                  System.out.println(WorkText.SortWordBySym(text,sym));
                  break;
              }
              case 410:
              {
                  System.out.println("Вариант 4 №10");
                  String text8 = "Hello,\n" +
                          "How (are you doing, 2345 H\n" +
                          "I am 523 fine, \n" +
                          ")I am done.\n";
                  String[] words8 = text8.split("\n");
                  System.out.println(text8);
                  System.out.println();
                  int[] str_l = new int[words8.length];
                  String cash_str = "";
                  for (int i =0 ; i!=words8.length; i++){
                      if (String.valueOf(words8[i].charAt(0)).toLowerCase(Locale.ROOT).equals(String.valueOf(words8[i].
                              charAt(words8[i].length()-1)).toLowerCase(Locale.ROOT))){
                          if (cash_str.length() < words8[i].length()) cash_str = words8[i];
                      }
                  }
                  System.out.println(text8.replace(cash_str, ""));
                  break;
              }
              case 5:
              {
                  quit=true;
                  break;
              }
          }
      }
    }
}
