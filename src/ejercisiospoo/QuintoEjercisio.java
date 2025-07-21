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
public class QuintoEjercisio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] notas;
        float promedio;
        float suma;
        suma = 0;
        notas = new float[4];
        
        for(int i= 0;i<notas.length;i++){
            System.out.println("Ingrese la "+ (i+1) +" nota");
            notas[i]= input.nextFloat();
            if(notas[i] > 5 || notas[i] < 0){
                System.out.println("Nota no valida");
                i = i-1;
            }
            suma += notas[i];
        }
        promedio = suma/notas.length;
        for(int i= 0;i<notas.length;i++){
            System.out.println("Nota "+ (i+1) +": "+ notas[i]);
        } 
        System.out.println("Promedio: "+promedio);
    }
}
