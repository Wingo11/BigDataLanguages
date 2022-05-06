package com.company;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
      try {
          System.out.println("\nВариант 2 №1");
          int n = 6;
          int counter = 0;
          Student[] students = new Student[n];
          if(students==null)
              throw new StackOverflowError("Не возможно виделить память");
          for (int i = 0; i < n; i++) {
              students[i] = new Student(i);
          }
          System.out.println(Arrays.toString(students));
          //список студентов заданного факультета;
          System.out.println("Список студентов заданного факультета: ");
          for (int i = 0; i < n; i++) {
              if (students[i].getFaculty().equals("Faculty of Computer Science")) {
                  System.out.println(students[i]);
                  counter = 1;
              }
          }
          if (counter == 0)
              System.out.println("По заданному факультету студентов НЕТ");
          //списки студентов для каждого факультета и курса
          System.out.println("|_|_|_|_|_|_|_|_|");
          System.out.println("|_|_|_|_|_|_|_|_|");
          System.out.println("Списки студентов для каждого факультета и курса");

          for (int i = 0; i < Library.faculty.length; i++) {
              for (int j = 1; j < 7; j++) {
                  System.out.println("Факультет: " + Library.faculty[i] + " , Курс: " + j);
                  counter = 0;
                  for (int k = 0; k < n; k++) {
                      if (students[k].getFaculty().equals(Library.faculty[i]) && students[k].getCourse() == j) {
                          System.out.println(students[k]);
                          counter = 1;
                      }
                  }
                  if (counter == 0)
                      System.out.println("По заданному факультету и курсу студентов НЕТ");
              }
              counter = 0;
          }
          System.out.println("|_|_|_|_|_|_|_|_|");
          System.out.println("|_|_|_|_|_|_|_|_|");
          //список студентов, родившихся после заданного года
          counter = 0;
          System.out.println("Список студентов, родившихся после заданного года: Будет после 1999 ");
          for (int i = 0; i < n; i++) {
              if (Integer.parseInt(students[i].getDate().substring(students[i].getDate().length()-4)) > 1999) {
                  System.out.println(students[i]);
                  counter = 1;
              }
          }
          if (counter == 0)
              System.out.println("студентов сторше НЕТ");
          System.out.println("|_|_|_|_|_|_|_|_|");
          System.out.println("|_|_|_|_|_|_|_|_|");
          //список учебной группы.
          System.out.println("список учебной группы: Например Информатический факультет 1 курса 1 группы");
          students[1].setFaculty(Library.faculty[0]);
          students[1].setCourse(1);
          students[1].setGroup(1);
          for (int i = 0; i < n; i++) {
              if (students[i].getFaculty().equals("Faculty of Computer Science") && students[i].getCourse() == 1 && students[i].getGroup() == 1) {
                  System.out.println(students[i]);
                  counter = 1;
              }
          }

          System.out.println("\nВариант 2 №10");
          n = 8;
          Train[] masstr;
          masstr = Train.create_mass(n);
          for (int i=0; i!=n;i++)
          {
              masstr[i].Tr_print();
          }
          System.out.println("Запрос (а) список поездов, следующих до заданного пункта назначения");
          Train.select(masstr,n,"Москва",0,0);
          System.out.println("Запрос (б) список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа");
          Train.select(masstr,n,"Питер",10,0);
          System.out.println("Запрос (с) список поездов, отправляющихся до заданного пункта назначения и имеющих общие места");
          Train.select(masstr,n,"Надым",0,100);
      }
      catch (StackOverflowError mem)
      {
          System.out.println(mem.toString());
      }
      catch (Exception ex)
      {
          System.out.println(ex.toString());
      }
    }
}
