/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Scanner;

/**
 *
 * Entrada de datos
 * Salida de datos
 */

/**
 *
 * @author Felix Castro
 */
public class entrSaliDatConsola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Ingrese un numero: ");
        
        numero = entrada.nextInt();
        
        System.out.println("El numero es : "+numero);
    }
}
