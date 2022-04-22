package com.company;

public class Main1 {

    public static void main(String[] args) {
        City ct=new City(5,5,2);
        ct.setArea(125444);
        ct.setName("Moscow");
        ct.setPopulation(12000000);
        ct.AddAreas("Kreml","Обший");
        ct.AddAvenues("Centre",12,2000);
        ct.AddStreet("Арбат");
        System.out.println(ct);
        ct.DisplayAreas();
        ct.DisplayPros();
        ct.DisplayStreets();
    }
}
