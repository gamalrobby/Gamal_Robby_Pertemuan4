/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan48.kalkulator;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program kalkulator add,minus,multiple
 * dan division
 */
public class PBO210117071Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalkulator =  new Kalkulator();
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        System.out.println("VALUE 1 = "+kalkulator.getValue1());
        System.out.println("VALUE 2 = "+kalkulator.getValue2());
        kalkulator.setNameProject();
        kalkulator.setNoteProject(null);
        System.out.println("Result Add is = "+kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Minus is = "+kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Multiplication is = "+kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Division is = "+kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));
    }
    
}
