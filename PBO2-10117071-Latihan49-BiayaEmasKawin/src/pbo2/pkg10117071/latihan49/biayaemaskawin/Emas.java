/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan49.biayaemaskawin;

/**
 *
 * @author Destroy Eyes
 */
public class Emas {
    private double harga = 570000;
    private double berat;
    
    public Emas(double berat){
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public double getHarga() {
        return harga;
    }

    public double hitungHargaEmas(double berat, double harga){
        return berat*harga;
    }
}
