package com.company;

public class Main2 {

    public static void main(String[] args) {
      Ensiklopdiya en=new Ensiklopdiya("Термины");
      en.setCntPage(12543);
      en.setAuthor("Симон.К.Р");
      en.setIzd("Санкт Петербург");
      en.setShifr("DC-125");
      en.setYr(1997);
      en.OutDate();
      Guide gd=new Guide("Турист");
      gd.setName("Разговорный краткий ");
      gd.setShifr("AB-124");
      gd.setYr(2005);
      gd.setAuthor("Фаронов.");
      gd.OutDate();
    }
}
