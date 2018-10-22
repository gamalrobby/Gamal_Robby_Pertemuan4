/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan49.biayaemaskawin;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program menghitung biaya emas kawin
 */
public class PBO210117071Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas emas = new Emas(15.7);
        System.out.println("===BIAYA EMAS KAWIN===");  
        System.out.println("Harga Emas Saat ini : Rp. "+emas.getHarga()+" per gram");
        System.out.println("Emas yang ingin dibeli : "+emas.getBerat()+" gram");
        System.out.println("Total biaya : Rp. "+emas.hitungHargaEmas(emas.getBerat(), emas.getHarga()));
    }
    
}
