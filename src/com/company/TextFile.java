package com.company;
import java.io.File;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class TextFile extends File {
    String pathname;

    //Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
    void create(){
        String data = "Это тестовая строка для записи в файл";
        try {
            Files.write(Paths.get(pathname), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void rename(){
        File renameFile = new File("/Users/Wingo/Downloads/renamefiles.txt");
        if(this.renameTo(renameFile)){
            System.out.println("Файл переименован успешно");;
        }else{
            System.out.println("Файл не был переименован");
        }
        //this.pathname = "/Users/Wingo/Downloads/renamefiles.txt";
    }
    void print () throws IOException {
        FileReader reader = new FileReader(this);
        int c;
        while ((c= reader.read())!=-1){
            System.out.print((char)c);
        }
        reader.close();
    }
    void write() throws IOException{
        FileWriter writer = new FileWriter(this,true);
        String dopText = ". Дополнение файла прошло успешно";
        writer.write(dopText);
        writer.flush();
        writer.close();
        System.out.println("Файл дополнен.");
    }
    void delFile(){
        if(this.delete()){
            System.out.println("Файл удален.");
        }else System.out.println("Файла не удален.");
    }


    public TextFile(String pathname) {
        super(pathname);
        this.pathname = pathname;
        create();
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "pathname='" + pathname +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TextFile)) return false;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(pathname, textFile.pathname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pathname);
    }
}
