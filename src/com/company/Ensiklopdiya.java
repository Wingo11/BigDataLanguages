package com.company;

public class Ensiklopdiya extends Book{
  private int cntPage;//Количество страниц
    @Override
    public void OutDate() {
        System.out.println(String.format("Энциклопедия: %15s  Шифр:%7s  Год:%5d  Назначено: %s  Издательство: " +
                "%15s  Количество страниц: %5d",getShifr(),getShifr(),getYr(),getName(),getIzd(),getCntPage()));
    }
    public Ensiklopdiya()
    {
        //Пустой конструктор
    }
    public  Ensiklopdiya(String name)
    {
        //@name-Наименование
        this.setName(name);
    }
    public int getCntPage() {
        return cntPage;
    }

    public void setCntPage(int cntPage) {
        this.cntPage = cntPage;
    }
}
