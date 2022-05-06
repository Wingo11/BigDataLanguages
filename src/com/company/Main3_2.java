package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main3_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        FileOutputStream fout = new FileOutputStream(file);

        String greetings = "1 2 3 4 5 6\r\n7 8 9 1 2 3\n4 5 6 7 8 9\n";

        fout.write(greetings.getBytes());

        fout.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        String zap = "";

        ArrayList<ArrayList<Integer>> mass = new ArrayList<>();
        ArrayList<ArrayList<String>> mass_str = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = br.readLine())!= null){
            ArrayList<String> mass_str_c = new ArrayList<>();
            mass.add(IntStream.of(Arrays.stream(line.split(" ")).mapToInt(Integer::valueOf).toArray()).boxed().collect(Collectors.toCollection(ArrayList::new)));
            mass_str_c.addAll(Arrays.asList(line.split(" ")));
            mass_str.add(mass_str_c);
        }
        System.out.println("Двумерный массив исходной матрицы: ");
        System.out.println(mass);
        System.out.println("Размерность x - "+mass.size()+" y - "+mass.get(0).size());
        System.out.println("");

        String new_str_file = "";
        for (int i=0; i!=mass_str.size(); i++){
            new_str_file+= String.join(" ", mass_str.get(i));
            new_str_file+="\n";
        }
        System.out.println("Исходная матрица: ");
        System.out.println(new_str_file);

        System.out.println("Результат поворота матрицы на 90 градусов по часовой стрелке: ");
        ArrayList<ArrayList<Integer>> mass_r = new ArrayList<>();
        for (int i = 0; i < mass.get(0).size(); i++) {
            ArrayList<Integer> mass_line = new ArrayList<>();
            for (int j = mass.size() - 1; j >= 0; j--) {
                mass_line.add(mass.get(j).get(i));
                System.out.print(mass.get(j).get(i) + "\t");
            }
            mass_r.add(mass_line);
            System.out.println();
        }

        System.out.print(mass_r);
        System.out.println();
    }
}
