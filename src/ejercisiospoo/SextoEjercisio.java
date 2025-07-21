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
public class SextoEjercisio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number;
        float cuadrado;
        float cubo;

        System.out.println("Ingrese un numero");
        number = input.nextFloat();
        cuadrado = number*number;
        cubo = number*number*number;
        System.out.println("Cuadrado: "+ cuadrado);
        System.out.println("Cubo: "+ cubo);
      
        
        
        
    }

}
