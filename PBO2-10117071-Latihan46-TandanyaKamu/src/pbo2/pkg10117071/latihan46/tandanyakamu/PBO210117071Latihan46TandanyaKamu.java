/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program mengetahui keterangan dari 
 * umur dan menghitung umur
 */
public class PBO210117071Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Age age = new Age(2018);
        System.out.print("Masukkan Tahun Lahir : ");
        age.setYearBirth(scn.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda : "+age.getYearBirth());
        System.out.println("Hari ini Tahun : "+age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur()+ " Tahun");
        age.tandanyaKamu(age.hitungUmur());
    }
    
}
