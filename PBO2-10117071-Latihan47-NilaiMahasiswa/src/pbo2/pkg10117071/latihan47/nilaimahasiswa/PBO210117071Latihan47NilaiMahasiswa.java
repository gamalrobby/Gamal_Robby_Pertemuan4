/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan47.nilaimahasiswa;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program menghitung nilai mahasiswa dan
 * index nilai
 */
public class PBO210117071Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai mahasiswa = new Nilai(75,45,34);
        System.out.println("QUIZ : "+mahasiswa.getNilaiQuiz());
        System.out.println("UTS : "+mahasiswa.getNilaiUTS());
        System.out.println("UAS : "+mahasiswa.getNilaiUAS());
        System.out.println("");
        System.out.println("Nilai Akhir : "+mahasiswa.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : "+mahasiswa.nilaiIndeks(mahasiswa.hitungNilaiAkhir()));
        System.out.println("Keterangan : "+mahasiswa.indeksKeterangan(mahasiswa.nilaiIndeks(mahasiswa.hitungNilaiAkhir())));
        System.out.println("");
        //
        Nilai mahasiswa2 = new Nilai(60,80,75);
        System.out.println("QUIZ : "+mahasiswa2.getNilaiQuiz());
        System.out.println("UTS : "+mahasiswa2.getNilaiUTS());
        System.out.println("UAS : "+mahasiswa2.getNilaiUAS());
        System.out.println("");
        System.out.println("Nilai Akhir : "+mahasiswa2.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : "+mahasiswa2.nilaiIndeks(mahasiswa2.hitungNilaiAkhir()));
        System.out.println("Keterangan : "+mahasiswa2.indeksKeterangan(mahasiswa2.nilaiIndeks(mahasiswa2.hitungNilaiAkhir())));
        System.out.println("");
        //
        Nilai mahasiswa3 = new Nilai(30,80,40);
        System.out.println("QUIZ : "+mahasiswa3.getNilaiQuiz());
        System.out.println("UTS : "+mahasiswa3.getNilaiUTS());
        System.out.println("UAS : "+mahasiswa3.getNilaiUAS());
        System.out.println("");
        System.out.println("Nilai Akhir : "+mahasiswa3.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : "+mahasiswa3.nilaiIndeks(mahasiswa3.hitungNilaiAkhir()));
        System.out.println("Keterangan : "+mahasiswa3.indeksKeterangan(mahasiswa3.nilaiIndeks(mahasiswa3.hitungNilaiAkhir())));
    
    }
    
}
