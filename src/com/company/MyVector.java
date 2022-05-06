package com.company;

import java.util.Arrays;
public class MyVector {
    private int[][] vector_date_mas;
    private Object[] vector_mas;
    private int last_obj;

    public MyVector(){
        int n = 4;
        this.vector_date_mas = new int[2][n];

        if(this.vector_date_mas==null)//Если памяти не выделялось
            throw new StackOverflowError("Памяти не хватает");

        for (int i = 0; i < n; i++) {
            vector_date_mas[0][i] = (int) (Math.random() * 10);
            vector_date_mas[1][i] = (int) (Math.random() * 10);
        }
        this.vector_mas = new Object[n];
        if(this.vector_mas==null)//Если память не выделялась
            throw new StackOverflowError("Памяти не хватает");
        for (int i = 0; i < n; i++) {
            vector_mas[i] = new int[2];
            if(this.vector_mas[i]==null)//Если память не выделялась
                throw new StackOverflowError("Памяти не хватает");
            vector_date_mas[0][i] = (int) (Math.random() * 10);
            vector_date_mas[1][i] = (int) (Math.random() * 10);
        }
    }

    public MyVector(int n){
        this.vector_date_mas = new int[2][n];
        if(this.vector_date_mas==null)//Если память не выделялась
            throw new StackOverflowError("Памяти не хватает");
        for (int i = 0; i < n; i++) {
            vector_date_mas[0][i] = (int) (Math.random() * 10);
            vector_date_mas[1][i] = (int) (Math.random() * 10);
        }
        this.vector_mas = new Object[n];
        for (int i = 0; i < n; i++) {
            vector_mas[i] = new int[2];
            vector_date_mas[0][i] = (int) (Math.random() * 10);
            vector_date_mas[1][i] = (int) (Math.random() * 10);
        }
    }

    public int[][] getVector_date_mas() {
        return vector_date_mas;
    }

    @Override
    public String toString() {
        return "MyVector{" +
                "vector_date_mas=" + Arrays.toString(vector_date_mas) +
                '}';
    }

    public int[] get_sum(int x, int y){
        int[] sum = new int[2];
        if(sum==null)//Если память не выделялась
            throw new StackOverflowError("Памяти не хватает");
        sum[0] = vector_date_mas[0][x] + vector_date_mas[0][y];
        sum[1] = vector_date_mas[1][x] + vector_date_mas[1][y];
        return sum;
    }

    public int[] get_subtract(int x, int y){
        int[] sum = new int[2];
        if(sum==null)//Если память не выделялась
            throw new StackOverflowError("Памяти не хватает");
        sum[0] = vector_date_mas[0][x] - vector_date_mas[0][y];
        sum[1] = vector_date_mas[1][x] - vector_date_mas[1][y];
        return sum;
    }

    public int[] get_inc(int x){
        int[] sum = new int[2];
        if(sum==null)//Если память не выделялась
            throw new StackOverflowError("Памяти не хватает");


        sum[0] = vector_date_mas[0][x] +1;
        sum[1] = vector_date_mas[1][x] +1;
        return sum;
    }

    public int[] get_dec(int x){
        int[] sum = new int[2];
        if(sum==null)//Если память не выделялась
            throw new StackOverflowError("Памяти не хватает");

        sum[0] = vector_date_mas[0][x] -1;
        sum[1] = vector_date_mas[1][x] -1;
        return sum;
    }

    public int get_index(int x, int y){
        int index = vector_date_mas[x][y];
        return index;
    }
    public int get_scalar(int x, int y){
        int[] sum = new int[2];
        if(sum==null)//Если память не выделялась
            throw new StackOverflowError("Памяти не хватает");
        int scalar = 0;
        sum[0] = vector_date_mas[0][x] * vector_date_mas[0][y];
        sum[1] = vector_date_mas[1][x] * vector_date_mas[1][y];
        scalar = sum[0] + sum[1];
        return scalar;
    }
    public double get_length(int x){
        double leng = 0;
        leng = Math.sqrt(vector_date_mas[0][x]*vector_date_mas[0][x]+vector_date_mas[1][x]*vector_date_mas[1][x]);
        return leng;
    }

    public double get_corner(int x, int y){
        double scal = get_scalar(x , y);
        double modul1 = get_length(x);
        double modul2 =get_length(y);
        double corne = scal/(modul1*modul2);
        return corne;
    }

    public boolean get_collin(int x, int y){
        boolean collin;
        if (vector_date_mas[0][y] != 0 && vector_date_mas[1][y] != 0)
            if ((vector_date_mas[0][x]/vector_date_mas[0][y]) == (vector_date_mas[1][x]/vector_date_mas[1][y])) {
                collin = true;
            } else
                collin = false;
        else
            collin = false;
        return collin;
    }
    public boolean get_ortogonal(int x, int y){
        boolean ortogonal;
        if (get_scalar(x,y) == 0)
            ortogonal = true;
        else
            ortogonal = false;
        return ortogonal;
    }

}
