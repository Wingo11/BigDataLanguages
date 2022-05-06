package com.company;
import java.util.Random;

public class Library {
    private static final int PHONE_NUMBER_LENGTH = 11;
    private static final int PHONE_CARD_LENGTH = 16;
    public static String[] first_name = {"Denis", "Kirill", "Nikolay", "Danil", "Nasty", "Elena", "Lukas", "Garry", "Luk"};
    public static String[] last_name = {"Buksha", "Golikov", "Alimov"};
    public static String[] patronymic_name = {"AndreeWitch", "AlexeeWitch"};
    public static String[] faculty = {"Faculty of Computer Science", "Faculty of History", "Faculty of Economics", "Faculty of Linguistics"};

    public static void print_array(int[][] mas_int){
        for (int i=0;i < mas_int.length;i++,System.out.println(" ")){
            for (int j=0;j < mas_int[i].length;j++){
                if (mas_int [i][j] >= 0)
                    System.out.print(" "+mas_int [i][j]+" ");
                else
                    System.out.print(mas_int [i][j]+" ");
            }
        }
    }
    public static void print_array(String[][] mas_int){
        for (int i=0;i < mas_int.length;i++,System.out.println(" ")){
            for (int j=0;j < mas_int[i].length;j++){
                System.out.print(mas_int[i][j]);
            }
        }
    }
    public static String getDate(){
        int month, year, day;
        Random call = new Random();
        month = call.nextInt(11)+1;
        year = 1990 + (int) (Math.random() * 20);
        day  = call.nextInt(28)+1;

        String calendar = day+"."+month+"."+year;
        return calendar;
    }
    public static String getRandomPhone() {
        String s = "123456789";
        StringBuffer phoneNumber = new StringBuffer();

        for (int i = 0; i < PHONE_NUMBER_LENGTH; i++) {
            phoneNumber.append(s.charAt(new Random().nextInt(s.length())));
        }
        return phoneNumber.toString();
    }
    public static String getRandomCard() {
        String s = "123456789";
        StringBuffer phoneNumber = new StringBuffer();
        for (int i = 0; i < PHONE_CARD_LENGTH; i++) {
            phoneNumber.append(s.charAt(new Random().nextInt(s.length())));
        }
        return phoneNumber.toString();
    }


}
