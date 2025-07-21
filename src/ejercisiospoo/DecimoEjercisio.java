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
public class DecimoEjercisio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number;
        float area;

        System.out.println("Ingrese la longitud de un lado del cuadrado");
        number = input.nextFloat();
        
        area = number*number;
        
        System.out.println("El area del cuadrado: "+ area);
        
      
        
        
        
    }

}
