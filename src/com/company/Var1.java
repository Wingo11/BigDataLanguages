package com.company;

import java.util.Arrays;
import java.util.Collection;

class Student
{
    private String name;  // Название
    private int ball;  // Балл
    public Student(String nm,int bl)
    {
        this.ball=bl;
        this.name=nm;
    }
    public String getName()
    {
        return this.name;
    }
    public  int getBall()
    {
        return  ball;
    }
}
public class Var1 {

    public static void main(String[] args) {
     ///STREAM    APIIII
        Collection<Student> students= Arrays.asList(
                new Student("Ivan",40),
                new Student("Petr",60),
                new Student("Olga",70)
        );
        // Через StreamAPI находим средний (AveragingInt используем)
      double ans=students.stream().mapToInt(x->x.getBall()).average().getAsDouble();
      System.out.println(ans);
    }
}
