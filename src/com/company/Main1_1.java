package com.company;

import java.util.*;


public class Main1_1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(7, 8, 9, 1, 2, 3));

        System.out.println("Изначальное множество 1: ");
        System.out.println(list1);
        System.out.println("Изначальное множество 2: ");
        System.out.println(list2);
        System.out.println();

        System.out.println("Пересечение множеств: ");
        System.out.println(new Main1_1().intersection(list1, list2));
        System.out.println("Объединение множеств: ");
        System.out.println(new Main1_1().union(list1, list2));
    }

    public <T> List<T> union(List<T> list1, List<T> list2) {
        Set<T> set = new HashSet<T>();

        set.addAll(list1);
        set.addAll(list2);

        return new ArrayList<T>(set);
    }

    public <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();

        for (T t : list1) {
            if(list2.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }
}
