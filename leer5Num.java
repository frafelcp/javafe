/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec;

import java.util.Scanner;

/**
 *
 * Leer 5 numeros
 * Guardar en un vector
 * mostrar en el orden introducido
 */

/**
 *
 * @author Felix Castro
 */
public class leer5Num {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int [] numeros;
        
        numeros = new int[5];
        
        System.out.println("Ingrese un numero");
        for (int i : numeros) {
            i = entrada.nextInt();
        }
        
        for (int i : numeros) {
            System.out.println(i);
        }
    }
}
