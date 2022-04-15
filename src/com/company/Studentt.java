package com.company;

public class Studentt {
    int idStudent,idTeach, idCours, score;
    String FIO;
    public Studentt(int idCours, int idTeach, int idStudent) {
        this.idStudent = idStudent;
        this.idTeach = idCours;
        this.idTeach = idTeach;
        this.FIO = idTeach+" "+idStudent+" "+idStudent;
        this.score = (int)(Math.random()*6);
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", idTeach=" + idTeach +
                ", idCours=" + idCours +
                ", score=" + score +
                ", FIO='" + FIO + '\'' +
                '}';
    }
}
