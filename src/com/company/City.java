package com.company;
//Реализуем класс Город
public class City {
    private double area;
    private int population;
    private String name;//Название города
    String []streets;//Названия улиц
    int cntStr;//Количестов улиц
    int cntAvn;//Количество проспектов
    int cntArs;//Количество плошадей

    private class Avenues
    {
        private int width;
        private int length;
        private String name;
        public Avenues()
        {

        }
        public Avenues(int w,int l)
        {
            this.length=l;
            this.width=w;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

        @Override
        public String toString() {
            return String.format("Проспект: %20s | %5d | %5d",name,width,length);
        }
    }

    private class Areas
    {
        private String type;//Тип площади: вокзальные, предзаводские и др.
        private String name;//Наименование
        public Areas()
        {
            this.type="торговые";//По умолчанию
            this.name="Y";
        }
        public Areas(String nam,String tp)
        {
            this.name=nam;
            this.type=tp;
        }
        public void setType(String type) {
            this.type = type;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("Плошадь : %15s | %15s",name,type);
        }
    }
    private Avenues[] avs;//проспекты
    private Areas[]ars;//Плошади
    public City(int cntStreet,int cntAvns,int cntAres)
    {
        this.cntArs=0;
        this.cntAvn=0;
        this.cntStr=0;
        //@cntStreet-количество улиц
        //@cntAvns-количество проспектов в городе
        this.avs=new Avenues[cntAvns+5];
        this.population=10000;//мин для статуса города
        this.area=1230;//
        this.streets=new String[cntStreet+1];
        this.ars=new Areas[cntAres+1];
    }

    public void AddStreet(String strname)
    {
       this.streets[cntStr++]=strname;
    }
    //добавление площадей
    public void AddAreas(String nm,String type)
    {
        if(cntArs<ars.length)
        {
            this.ars[cntArs]=new Areas();
            this.ars[cntArs].setName(nm);
            this.ars[cntArs++].setType(type);
        }
    }
    //добавление проспектов
    public void AddAvenues(String nm,int w,int l)
    {
        //Добавим все
        //
        if(cntAvn<avs.length)
        {
            this.avs[cntAvn]=new Avenues();
            this.avs[cntAvn].setName(nm);
            this.avs[cntAvn].setLength(l);
            this.avs[cntAvn++].setWidth(w);
        }
    }

    public void DisplayStreets()
    {
        System.out.println("*****************Улицы**************");
        for(int i=0;i<cntStr;i++)
        {
            System.out.println(streets[i]);
        }
    }

    public void DisplayAreas()
    {
        System.out.println("*****************Плошади**************");
        for(int i=0;i<cntArs;i++)
        {
            System.out.println(ars[i]);
        }
    }

    public void DisplayPros()
    {
        System.out.println("*****************Улицы**************");
        for(int i=0;i<cntAvn;i++)
        {
            System.out.println(avs[i]);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return String.format("Название: %20s  Население(К-во): %9d   Плошадь: %f",name,population,area);
    }
}
