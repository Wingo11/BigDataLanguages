package com.company;

import java.util.*;

public class Main2_10 {

    public static void main(String[] args) {
        int n = 5;
        int road_lenght =  (int)(Math.random()*2000+1000);
        System.out.println("Длина трассы = "+ road_lenght);
        ArrayList<Car> car_mass = new ArrayList<>();
        for (int i=0; i!=n; i++){
            car_mass.add(new Car((int)(Math.random()*16+100),(int)(Math.random()*2+10),(int)(Math.random()*2+20), road_lenght));
        }
        System.out.println(car_mass);
        int count =0;
        for (int i=0; i!=n; i++){
            for (int j=0; j!=n; j++){
                if (car_mass.get(i).time_for_road > car_mass.get(j).time_for_road){
                    count++;
                }
            }
        }
        System.out.println("Кол-во обгонов = "+ count);
    }

    public static class Car{
        int speed;
        int length;
        int leng_from_start;
        double time_for_road;

        public Car(int speed, int length, int leng_from_start, int road_lenght) {
            this.speed = speed;
            this.length = length;
            this.leng_from_start = length + leng_from_start;
            this.time_for_road = time_count(this.speed, road_lenght);
        }

        public double time_count(int speed, int road_lenght){
            return (double) road_lenght/ (double)speed;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "speed=" + speed +
                    ", length=" + length +
                    ", leng_from_start=" + leng_from_start +
                    ", time_for_road=" + time_for_road +
                    '}';
        }
    }
}
