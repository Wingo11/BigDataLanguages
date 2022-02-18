package com.company;

import java.util.*;
import java.util.Map.Entry;
import static java.util.Collections.*;


public class Main {
    private static Map<Integer, Integer> sortNumbersWithDescByValue(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> frequencyList = new LinkedList<Map.Entry<Integer, Integer>>(
                map.entrySet());
        sort(frequencyList, new Comparator<Object>() {
            @SuppressWarnings("unchecked")
            public int compare(Object o1, Object o2) {
                return ((Entry<Integer, Integer>) (o2)).getValue().compareTo(
                        ((Map.Entry<Integer, Integer>) (o1)).getValue());
            }
        });
        Map<Integer, Integer> result = new LinkedHashMap<Integer, Integer>();
        for (Entry<Integer, Integer> frequency : frequencyList) {
            result.put(frequency.getKey(), frequency.getValue());
        }
        return result;
    }

    private static void findNumbersFrequencyByDesc(Integer[] sourceNumbers) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (Integer sourceNumber : sourceNumbers) {
            map.put(sourceNumber, frequency(Arrays.asList(sourceNumbers), sourceNumber));
        }
        System.out.println("Числа в порядке убывания частоты встречаемости чисел <Число=Встречаемость>: "
                + sortNumbersWithDescByValue(map));
    }

    private static void findHappyNumbers(Integer[] sourceNumbers) {
        String number;
        List<Integer> result = new ArrayList<Integer>();
        for (Integer sourceNumber : sourceNumbers) {
            number = sourceNumber.toString();
            if (number.length() == 4
                    && number.charAt(0) + number.charAt(1) == number.charAt(2)
                    + number.charAt(3)) {
                result.add(sourceNumber);
            }
        }
        System.out.println("Счастливые числа (Сумма 1-ой пары чисел = Сумме 2-ой пары): " + result);
    }

    public static void main(String[] args) {
        // Коломенский И.С. Вар10.
        //Лаб1, вариант 1, задание 4.
        /* 4. Создать приложение для ввода пароля из командной строки и сравнения его со строкой-образцом.*/

        System.out.println("Лаб1, вариант 1, задание 4");
        Scanner in = new Scanner(System.in);
        String input;
        String input_control = "abc";
        boolean flag = false;
        while(flag!=true) {
            System.out.println("Введите пароль ");
            input = in.nextLine();
            if((input_control).equals(input)) {
                System.out.println("Верно");
                flag = true;
            } else {
                System.out.println("Неверно");
            }
        }

        //Лаб1, вариант 1, задание 5.
        /* 5. Создать программу ввода целых чисел как аргументов командной строки, подсчета их суммы (произведения) и
        вывода результата на консоль.*/

        // Scanner in = new Scanner(System.in);
        in = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Лаб1, вариант 1, задание 5");
        System.out.print("Введите количество чисел, участвующих в операции:");
        int all = in.nextInt();
        int[] arg = new int[all];
        int sum = 0;
        int pro = 1;
        for (int i = 0; i < all; i++) {
            System.out.print("Введите значение " + i + " аргумента: ");
            arg[i] = in.nextInt();
            sum += arg[i];
            pro *= arg[i];
        }
        System.out.println("Сумма введенных чисел - " + sum);
        System.out.println("Произведение введенных чисел - " + pro);

        System.out.println("Лаб1, вариант 2, задание 10 и 11");
        // Ввести с консоли n целых чисел и поместить их в массив.
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        // Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        Integer[] sourceNumbers = new Integer[size];
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = in.nextInt();
        }

        //Лаб1, вариант 2, задание 10.
        // 10. Числа в порядке убывания частоты встречаемости чисел.
        findNumbersFrequencyByDesc(sourceNumbers);

        //Лаб1, вариант 2, задание 11.
        // 11. “Счастливые” числа.
        findHappyNumbers(sourceNumbers);
    }
}