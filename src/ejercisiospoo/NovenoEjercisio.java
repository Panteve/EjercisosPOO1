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
public class NovenoEjercisio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        double descuento;
        double aumento;

        System.out.println("Ingrese el monto en pesos, sin comas, ni puntos");
        number = input.nextDouble();
        
        descuento = number - (number*0.15);
        aumento = number + (number*0.15);
        
        System.out.println("Monto inicial: "+ number);
        System.out.println("Monto con descuento: "+ descuento);
        System.out.println("Monto con aumento: "+ aumento);
      
        
        
        
    }

}
