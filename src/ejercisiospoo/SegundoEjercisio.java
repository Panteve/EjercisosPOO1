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
public class SegundoEjercisio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number;
        
        System.out.println("Ingrese un numero");
        number = input.nextFloat();
        if(number>0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }
       
        
           
        

    }

}
