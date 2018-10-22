/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan47.nilaimahasiswa;

/**
 *
 * @author Destroy Eyes
 */
public class Nilai {
    private double nilaiQuiz;
    private double nilaiUTS;
    private double nilaiUAS;
    private String indeks;
    private String keterangan;
    
    public Nilai(double nilaiQuiz, double nilaiUTS, double nilaiUAS){
    this.nilaiQuiz =nilaiQuiz;
    this.nilaiUTS = nilaiUTS;
    this.nilaiUAS = nilaiUAS;
    }

    public double getNilaiQuiz() {
        return nilaiQuiz;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public double getNilaiUAS() {
        return nilaiUAS;
    }
    

    

    
    public double hitungNilaiAkhir(){
    return (nilaiQuiz*0.2)+(nilaiUTS*0.3)+(nilaiUAS*0.5);
    }
    
    public String nilaiIndeks(double parNilaiAkhir){
        if(parNilaiAkhir >= 80 && parNilaiAkhir <= 100){
            indeks = "A";
        }else if(parNilaiAkhir >= 68 && parNilaiAkhir < 80){
            indeks = "B";
        }else if(parNilaiAkhir >= 56 && parNilaiAkhir < 68){
            indeks = "C";
        }else if(parNilaiAkhir >= 45 && parNilaiAkhir < 56){
            indeks = "D";
        }else if(parNilaiAkhir >= 0 && parNilaiAkhir < 45){
            indeks = "E";
        }
        return indeks;
    }
    
    public String indeksKeterangan(String parIndeks){
        if(parIndeks.equals("A")){
            keterangan = "Sangat Baik";
        }else if(parIndeks.equals("B")){
            keterangan = "Baik";
        }else if(parIndeks.equals("C")){
            keterangan = "Cukup";
        }else if(parIndeks.equals("D")){
            keterangan = "Kurang";
        }else if(parIndeks.equals("E")){
            keterangan = "Sangat Kurang";
        }
        return keterangan;
    }
}
