package com.company;
import java.util.Random;
//Генерируем исключение то где это нужно
public  class Train {
    //Пункт назначения, Номер поезда, Время отправления, Число мест (общих, купе, плацкарт, люкс)
    String arrival;
    int train_no;
    int time_out;
    int total_place, kupe_place, pla_place, luxe_place;
    public Train() {
        String[] arriaval_places = {"Омкс", "Рязань", "Москва", "Питер", "Надым", "Тула", "Колыма"};
        Random r = new Random();
        if(r==null)
            throw new StackOverflowError("Память не хватаеть");
        this.arrival = arriaval_places[r.nextInt(6)];
        this.train_no = r.nextInt(10000) + 1;
        this.time_out = r.nextInt(23) + 1;
        this.kupe_place = r.nextInt(40);
        this.pla_place = r.nextInt(100) + 1;
        this.luxe_place = r.nextInt(25);
        this.total_place = this.kupe_place + this.pla_place + this.luxe_place;

    }

    public void Tr_print() {
        System.out.println("Инфрмация о поезде:");
        System.out.printf("Пункт названчения - %s\nНомер поезда - %d\nЧас отправления - %d\nОбщее число мест - %d\nМеста купе - %d\n" +
                "Места плацкарт - %d\nМеста люкс - %d\n\n", this.arrival, this.train_no, this.time_out, this.total_place, this.kupe_place, this.pla_place, this.luxe_place);

    }

    public static Train[] create_mass(int n) {
        Train[] mass = new Train[n];
        if(mass==null)
            throw new StackOverflowError("Память не хватаеть");
        for (int i = 0; i != n; i++) {
            mass[i] = new Train();
        }
        return mass;
    }
    public static void select(Train[] mass, int n, String arrival, int time_out, int total_place)
    {
        for (int i=0; i!=n; i++)
        {
            if (time_out == 0 && total_place == 0)
            {
                if (mass[i].arrival.equals(arrival))
                {
                    mass[i].Tr_print();
                }
            }else if (time_out > 0 && total_place == 0)
            {
                if (mass[i].time_out > time_out && mass[i].arrival.equals(arrival))
                {
                    mass[i].Tr_print();
                }
            } else
            {
                if (mass[i].total_place > total_place && mass[i].arrival.equals(arrival))
                {
                    mass[i].Tr_print();
                }

            }
        }
    }

}
