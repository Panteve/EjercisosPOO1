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
public class PrimerEjercisio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number1;
        float number2;
        float suma;
        float resta;
        float multiplicacion;
        float division;
        System.out.println("Ingrese el primer numero");
        number1 = input.nextFloat();
        System.out.println("Ingrese el segundo numero");
        number2 = input.nextFloat();
        suma = number1 + number2;
        System.out.println("Suma: "+suma);
        resta = number1 - number2;
        System.out.println("Resta: "+resta);
        multiplicacion = number1 + number2;
        System.out.println("Multiplicacion: "+multiplicacion);
        if( number2 == 0 ){
            System.out.println("NO se puede realizar la division");
        }else{
            division = number1/number2;
            System.out.println("Division: "+division);
        }
           
        

    }

}
