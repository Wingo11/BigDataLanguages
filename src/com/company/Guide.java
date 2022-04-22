package com.company;

public class Guide extends Book{
    private String type;//Онлайн или бумажный

    @Override
    public void OutDate() {
        System.out.println(String.format("Справочник: %15s | Тип: %12s| Шифр:%7s  Год:%5d  Назначено: %s  Издательство: " +
                "%15s",type,getShifr(),getShifr(),getYr(),getName(),getIzd()));
    }

    Guide(String nm)
    {
        //@nm-Наименование справочника
        this.setName(nm);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
