package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Cours {
    int idCours;
    Teach[] teaches = new Teach[2];
    public Cours(int idCours) {
        this.idCours = idCours;
        for (int i = 0; i < 2; i++) {
            teaches[i] = new Teach(i,idCours);
        }
    }
    public void createfile (){
        String pathname = "/Users/Wingo/Downloads/arxivForCours"+idCours+".txt";
        File file = new File(pathname);
        String data = this.toString();
        try {
            Files.write(Paths.get(pathname), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Cours{" +
                "idCours=" + idCours +
                ", teaches=" + Arrays.toString(teaches) +
                '}';
    }
}