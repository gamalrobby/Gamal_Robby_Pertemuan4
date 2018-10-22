/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan44.hukumohm;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program menghitung hasil tegangan
 * dari kuat arus dan hambatan
 */
public class PBO210117071Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai btr = new Baterai();
        Baterai baterai = new Baterai(3,12);
        System.out.println("Kuat Arus : "+baterai.getKuatArus()+ " ampere");
        System.out.println("Hambatan : "+baterai.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : "+baterai.hitungTegangan()+" volt");
    }
    
}
