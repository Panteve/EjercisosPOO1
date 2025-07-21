/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisiospoo;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class SeptimoEjercisio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number;
        float km;
        float hm;
        float dc;
        float dm;
        float cm;
        float mm;
        
        System.out.println("Ingrese un numero en metros(m)");
        number = input.nextFloat();
        
        km = number / 1000;
        hm = number / 100;
        dc = number / 10;
        dm = number * 10;
        cm = number * 100;
        mm = number * 1000;
        
        System.out.println("\nEquivalencias:");
        System.out.println("Kilómetros (km): " + km);
        System.out.println("Hectómetros (hm): " + hm);
        System.out.println("Decámetros (dam): " + dc);
        System.out.println("Decímetros (dm): " + dm);
        System.out.println("Centímetros (cm): " + cm);
        System.out.println("Milímetros (mm): " + mm);

    }

}
