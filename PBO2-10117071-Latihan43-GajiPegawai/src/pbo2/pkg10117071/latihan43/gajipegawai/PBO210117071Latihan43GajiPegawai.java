/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program menghitung gaji pegawai
 */
public class PBO210117071Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("----------------------");
        GajiPegawai pegawai = new GajiPegawai();
        pegawai.setNama("Rizki Adam Kurniawan");
        pegawai.setAlamat("Jalan Semar dalam 4 No 72/66");
        pegawai.setUangTransport(250000);
        pegawai.setUangTunjangan(300000);
        pegawai.setGajiPokok(4500000);
        pegawai.setTotalGaji(pegawai.totalGaji(pegawai.getUangTunjangan(), pegawai.getUangTransport(), pegawai.getGajiPokok()));
        pegawai.tampilData(pegawai.getNama(), pegawai.getAlamat(), pegawai.getUangTunjangan(), pegawai.getUangTransport(), pegawai.getGajiPokok(), pegawai.getTotalGaji());
    }
    
}
