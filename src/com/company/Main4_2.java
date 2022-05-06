package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main4_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        ArrayList<ArrayList<Integer>> mass = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = br.readLine())!= null){
            mass.add(IntStream.of(Arrays.stream(line.split(" ")).mapToInt(Integer::valueOf).toArray()).boxed().collect(Collectors.toCollection(ArrayList::new)));
        }

        Scanner in = new Scanner(System.in);
        System.out.println(mass);
        System.out.print("Введите m (слов) - ");
        int m = in.nextInt();
        System.out.print("Введите n (строк) - ");
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> mass_str_l_nm = new ArrayList<>();
        for (int i=mass.size()-n; i!=mass.size(); i++){
            ArrayList<Integer> mass_s = new ArrayList<>();
            for (int j=mass.get(i).size()-m; j!=mass.get(i).size(); j++){
                mass_s.add(mass.get(i).get(j));
            }
            mass_str_l_nm.add(mass_s);
        }
        System.out.println(mass_str_l_nm);
    }
}
