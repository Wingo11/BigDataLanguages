package com.company;
import java.util.Arrays;
import java.util.Random;
public  class BoolMatrix {
    int n;
    int m;
    int true_count;
    boolean[][] matrix;

    public BoolMatrix(int n, int m) throws Exception{
        if(n<=0||m<=0)
            throw new Exception("Размер не может быть равно 0 или отрицательним");
        Random r = new Random();
        this.n = n;
        this.m = m;
        this.matrix = new boolean[n][m];
        if(matrix==null)
            throw new StackOverflowError("Памяти не хватает!");
        for (int i = 0; i != n; i++) {
            for (int j = 0; j != m; j++) {
                this.matrix[i][j] = r.nextBoolean();
                if (this.matrix[i][j] == true)
                {
                    this.true_count++;
                }
            }
        }
    }
    public void m_print()
    {
        System.out.printf("\nМатрица размерностью %d на %d\n", this.n, this.m);
        for (int i=0; i!=this.n; i++)
        {
            for (int j=0;j!=this.m;j++)
            {
                System.out.printf("%2b\t", this.matrix[i][j]);
            }
            System.out.println("");
        }
        System.out.printf("В матрице содержиться %d элемента(ов) равных 1\n", this.true_count);
    }
    public static void m_summ(BoolMatrix m1, BoolMatrix m2)
    {
        System.out.println("\nЛогическое сложение матриц");
        for (int i=0;i!=m1.n;i++)
        {
            for (int j=0; j!=m1.m; j++)
            {
                System.out.printf("%1b\t", m1.matrix[i][j] | m2.matrix[i][j]);
            }
            System.out.println("");
        }
    }
    public static void m_umn(BoolMatrix m1, BoolMatrix m2)
    {
        System.out.println("\nЛогическое умножение матриц");
        for (int i=0;i!=m1.n;i++)
        {
            for (int j=0; j!=m1.m; j++)
            {
                System.out.printf("%1b\t", m1.matrix[i][j] & m2.matrix[i][j]);
            }
            System.out.println("");
        }
    }
    public void m_invers()
    {
        System.out.println("\nИнверсия матрицы\nБыло:");
        this.m_print();
        for (int i=0; i!=this.n; i++)
        {
            for (int j=0; j!=this.m; j++)
            {
                this.matrix[i][j] = !this.matrix[i][j];
            }
        }

        System.out.println("Стало:");
        this.tr_count();
        this.m_print();

    }
    public void tr_count()
    {
        this.true_count =0;
        for (int i = 0; i != n; i++) {
            for (int j = 0; j != m; j++) {
                if (this.matrix[i][j])
                {
                    this.true_count++;
                }
            }
        }
    }
    public void b_sort()
    {
        System.out.println("\nСортировка матрицы в лексикографическом порядке\nБыло:");
        this.m_print();
        boolean[] cash = new boolean[this.m];
        int count_1=0, count_2=0;
        for (int ii=0;ii!=this.n;ii++) {
            for (int i = 0; i != this.n - 1; i++) {
                for (int j = 0; j != this.m; j++) {
                    if (this.matrix[i][j]) {
                        count_1 += (int) Math.pow(this.m - j, 2);
                    }
                    if (this.matrix[i + 1][j]) {
                        count_2 += (int) Math.pow(this.m - j, 2);
                    }
                }
                if (count_1 < count_2) {
                    for (int n = 0; n != this.m; n++) {
                        cash[n] = this.matrix[i][n];
                    }
                    for (int n = 0; n != this.m; n++) {
                        this.matrix[i][n] = this.matrix[i + 1][n];
                    }
                    for (int n = 0; n != this.m; n++) {
                        this.matrix[i + 1][n] = cash[n];
                    }
                }
                count_1 = 0;
                count_2 = 0;
            }
        }
        System.out.println("Стало:");
        this.m_print();
    }
}

