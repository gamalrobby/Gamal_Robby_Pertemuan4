/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan50.energikinetik;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program menghitung energi kinetik dan usaha
 */
public class PBO210117071Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Energi energi = new Energi();
        energi.setMassa(145);
        energi.setKecepatan(25);
        
        System.out.println("sebuah bola baseball dengan massa "+energi.getMassa()+" g");
        System.out.println("dilempar dengan kecepatan "+energi.getKecepatan()+" m/s");
        
        energi.hitungEnergiKinetik2(energi.getMassa());
        System.out.println("A. Energi Kinetik : "+energi.hitungEnergiKinetik1(energi.getMassa(), energi.getKecepatan()));
        System.out.println("B. Usaha : "+energi.usaha());
        System.out.println("Note : nilai 'USAHA' Tetap, karena dimulai dalam keadaan diam");
    }
    
}
