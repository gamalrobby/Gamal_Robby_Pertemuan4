/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan50.energikinetik;

/**
 *
 * @author Destroy Eyes
 */
public class Energi {
    private double massa;
    private double kecepatan;
    private double energiKinetik1;
    private double energiKinetik2;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double hitungEnergiKinetik1(double massa, double kecepatan) {
        energiKinetik1=0.5*massa*(kecepatan*kecepatan);
        return energiKinetik1;
    }


    public double hitungEnergiKinetik2(double massa) {
        energiKinetik2 = 0.5*massa*0;
        return energiKinetik2;
    }
    
    public double usaha(){
        return energiKinetik1 - energiKinetik2;
    }

    
    
}
