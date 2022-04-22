package com.company;

public abstract class Book {
    private String shifr;
    private String author;
    private String name;
    private int yr;
    private String izd;

    //Установка значений
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIzd(String izd) {
        this.izd = izd;
    }

    public void setYr(int yr) {
        this.yr = yr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
    }
    //Получение значений

    public String getName() {
        return name;
    }

    public int getYr() {
        return yr;
    }

    public String getAuthor() {
        return author;
    }

    public String getIzd() {
        return izd;
    }

    public String getShifr() {
        return shifr;
    }
    //Метод вывода абстрактно
    public abstract void OutDate();
}
