package com.company;
import java.util.Arrays;
public class Main1 {

    public static void main(String[] args) {
    try
    {
        System.out.println("\nВариант 1 №1");
        int n = 6;
        MyVector vector = new MyVector(n);
        //Вывод Сложения
        System.out.println("\nСложение");
        System.out.println(Arrays.toString(vector.get_sum(0, 1)));
        //Вывод вычитания
        System.out.println("\nВычитание");
        System.out.println(Arrays.toString(vector.get_subtract(2, 3)));
        //Вывод инкремента вектора
        System.out.println("\nИнкремент");
        System.out.println(Arrays.toString(vector.get_inc(0)));
        //Вывод декремента вектора
        System.out.println("\nДекремент");
        System.out.println(Arrays.toString(vector.get_dec(0)));
        //Вывод индекса указанного вектора
        System.out.println("\nИндекс");
        System.out.println(vector.get_index(1, 3));
        //Вывод скалярного произведения
        System.out.println("\nСкалярное произведение");
        System.out.println(vector.get_scalar(0, 1));
        //Вывод длины вектора
        System.out.println("\nДлина вектора");
        System.out.println(vector.get_length(1));
        //Угол векторов
        System.out.println("\nУгол вектора");
        System.out.println(vector.get_corner(0, 1));


        System.out.println("\nВариант 1 №10");
        BoolMatrix m_1 = new BoolMatrix(6,6);
        m_1.m_print();
        BoolMatrix m_2 = new BoolMatrix(6,6);
        m_2.m_print();
        BoolMatrix.m_summ(m_1,m_2);
        BoolMatrix.m_umn(m_1,m_2);
        m_1.m_invers();
        m_1.b_sort();
    }
    catch (Exception e)
    {
        System.out.println(e.toString());
    }
    catch (StackOverflowError mem)
    {
        System.out.println(mem.toString());
    }
    }
}
