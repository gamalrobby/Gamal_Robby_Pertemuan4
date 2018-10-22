/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program penarikan uang
 */
public class PBO210117071Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlah;
        Scanner scn = new Scanner(System.in);
        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan saldo awal : ");
        Tabungan tabungan = new Tabungan(scn.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = scn.nextInt();
        System.out.println("Saldo anda Sekarang :  " +tabungan.ambilUang(jumlah));
    }
    
}
