/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan44.hukumohm;

/**
 *
 * @author Destroy Eyes
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar \n"
                + "akan berbanding lurus dengan beda potensial \n"
                + "pada ujung-ujung kawat penghantar tersebut \n"
                + "asalkan suhu kawat dijaga konstan \n");
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus=kuatArus;
        this.hambatan=hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus*hambatan;
    }
}
