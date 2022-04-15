package com.company;

import java.io.IOException;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;

import java.util.concurrent.TimeUnit;


public class Var3 {
    public static void main(String[] args) {
        System.out.println("\nВариант 3 №10");  // DONE
        year year2022 = new year(2022);
        for (int i=0; i!=1;i++){
            String name;
            int number, count;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите название месяца - ");
            name = in.nextLine();
            System.out.print("Введите номер месяца - ");
            number = in.nextInt();
            System.out.print("Введите кол-во дней в месяце - ");
            count = in.nextInt();
            month new_month = new month(name, number);
            for (int j=1; j<=count;j++){
                day new_day = new day(j);
                new_month.add_day(new_day);
            }
            year2022.add_new_month(new_month);
        }
        System.out.println(year2022.toString());
        System.out.println("");
        System.out.println("Вывести день неделя заданной даты");
        Scanner in = new Scanner(System.in);
        int m_n, d_n;
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите номер месяца - ");
        m_n = in1.nextInt();
        System.out.print("Число месяца - ");
        d_n = in1.nextInt();
        Calendar show_data = new GregorianCalendar(2022, m_n-1, d_n);
        System.out.println(show_data.getTime());
        Calendar show_data1 = new GregorianCalendar(2022, m_n-1, d_n);
        String begin, end;
        System.out.print("Введите начальную дату формата dd.MM.yyyy - ");
        begin = in.nextLine();
        System.out.print("Введите конечную дату формата dd.MM.yyyy - ");
        end = in.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(begin, formatter);
        LocalDate endDate = LocalDate.parse(end, formatter);
        Period period = Period.between(startDate, endDate);
        System.out.println("Прошло лет - "+period.getYears());
        System.out.println("Прошло месяцев - "+period.getMonths());
        System.out.println("Прошло дней - "+period.getDays());

        System.out.println("------------------------------");
        System.out.println("Вариант 3 №1");  // DONE
        TextFile file = new TextFile("/Users/Wingo/Downloads/files.txt");
        System.out.println(file);
        file.rename();
        System.out.println(file);
        try {
            file.write();
            file.print();
        } catch (IOException e){
            System.out.println("no print/ no write");
        }
        System.out.println(" ");
        file.delFile();
    }

    public static class day{
        int daytime_str;
        String notes;

        public day(int daytime_str) {
            this.daytime_str = daytime_str;
        }

        public day(int daytime_str, String notes) {
            this.daytime_str = daytime_str;
            this.notes = notes;
        }

        public day(){}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            day day = (day) o;
            return daytime_str == day.daytime_str && Objects.equals(notes, day.notes);
        }

        @Override
        public int hashCode() {
            return Objects.hash(daytime_str, notes);
        }

        @Override
        public String toString() {
            return "day{" +
                    "daytime_str=" + daytime_str +
                    ", notes='" + notes + '\'' +
                    '}';
        }
    }
    public static class month extends day{
        String month_name;
        int month_number;
        String notes;
        ArrayList<day> days;

        public month(String month_name, int month_number, String notes, ArrayList<day> days) {
            this.month_name = month_name;
            this.month_number = month_number;
            this.notes = notes;
            this.days = days;
        }

        public month(String month_name, int month_number) {
            this.month_name = month_name;
            this.month_number = month_number;
            this.days = new ArrayList<>();
        }
         public void add_day(day newday){
            this.days.add(newday);
         }


        public month(){}


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            month month = (month) o;
            return Objects.equals(month_name, month.month_name) && Objects.equals(notes, month.notes) && Objects.equals(days, month.days);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), month_name, notes, days);
        }

        @Override
        public String toString() {
            return "\nmonth{" +
                    "month_name='" + month_name + '\'' +
                    ", notes='" + notes + '\'' +
                    ", days=" + days.toString() +
                    '}';
        }
    }
    public static class year extends month{
        int year_number;
        String notes;
        ArrayList<month> monthes;

        public year(int year_number) {
            this.year_number = year_number;
            this.monthes = new ArrayList<>();
        }

        public void add_new_month(month new_month){
            this.monthes.add(new_month);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            year year = (year) o;
            return year_number == year.year_number && Objects.equals(notes, year.notes);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), year_number, notes);
        }

        @Override
        public String toString() {
            return "year{" +
                    "year_number=" + year_number +
                    ", notes='" + notes + '\'' +
                    ", monthes=" + monthes.toString() +
                    '}';
        }
    }
}
