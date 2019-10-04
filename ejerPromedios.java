/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec;

import java.util.Scanner;

/**
 *
 * Leer 5 numeros.
 * Guardar en un vector
 * promedio de numeros positivos
 * promedio de numeros negativos
 * contar el numeros de ceros
 */

/**
 *
 * Felix Castro
 */
public class ejerPromedios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float vector[];
        float sumNumPos;
        float sumNumNeg;
        int conNumPos;
        int conNumNeg;
        int conCero;
        
        vector = new float[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero "+(i+1));
            vector[i] = entrada.nextFloat();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(vector[i]);
        }
    }
}
