/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program mencetak nama
 */
public class PBO210117071Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Printer printer = new Printer();
        System.out.println("=== Aplikasi Pencetak Nama===");
        System.out.print("Masukkan Nama Anda : ");
        printer.setNama(scn.nextLine());
        System.out.print("Mau Cetak Berapa Kali? : ");
        printer.setJmlCetak(scn.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
