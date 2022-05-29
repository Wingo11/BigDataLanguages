package com.company;

import java.util.Arrays;
import java.util.Collection;


enum Sex{
    MAN,
    WOMAN;
}
class People
{
    String name;  // Имя
    int age;  // Возраст
    Sex sex;
    public People(String nm,int ag,Sex s)
    {
        this.name=nm;
        this.age=ag;
        this.sex=s;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;

    }
// еше нам нужен компаратор для нахождения возраста
public static int compare (People p1, People p2){
    if(p1.getAge() > p2.getAge())
        return 1;
    return -1;
}
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
public class Var2 {

    public static void main(String[] args) {
        Collection<People>peoples=Arrays.asList(
            new People("Ivan",16,Sex.MAN),
                new People("Petr",23,Sex.MAN),
                new People("Maria",42,Sex.WOMAN)
        );
        People p=peoples.stream().filter(x->x.sex==Sex.MAN).max(People::compare).get();
        System.out.println("Самый старший человек мужского пола");
        System.out.println(p);
    }
}
