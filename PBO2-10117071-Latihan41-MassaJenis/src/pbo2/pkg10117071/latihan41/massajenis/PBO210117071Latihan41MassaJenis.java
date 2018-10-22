/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi menghitung volume dan massa jenis kubus
 */
public class PBO210117071Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus kubus = new Kubus(); 
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====Massa Jenis Kubus====");
        System.out.print("Sisi  : ");
        kubus.setSisi(scn.nextInt());
        System.out.print("Massa : ");
        kubus.setMassa(scn.nextInt());
        
        System.out.println("===Hasil Perhitugan===");
        System.out.println("Volume : "+kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : "+kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(0)));
    }
    
}
