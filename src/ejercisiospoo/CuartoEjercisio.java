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
public class CuartoEjercisio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number1;
        float number2;
        System.out.println("Ingrese el primer numero");
        number1 = input.nextFloat();
        System.out.println("Ingrese el segundo numero");
        number2 = input.nextFloat();
        if (number1 > number2) {
            System.out.println("El primer numero: "+number1+" es mayor que el segundo: "+number2 );
            return;
        } 
        System.out.println("El segundo numero: "+number2+" es mayor que el primero: "+number1);
        

    }

}
