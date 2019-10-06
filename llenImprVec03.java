/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec;

import java.util.Scanner;

/**
 *
 * Llenar y mostrar vector con validacion
 */

/**
 *
 * @author Felix Castro
 */
public class llenImprVec03 {
    public static void main(String[] args) {
        //leer datos del teclado
        Scanner entrada = new Scanner(System.in);
        
        //variables
        int notas[];
        int nElem;
        int num;
        
        //numero de elementos
        System.out.println("Ingrese la cantidad de elemento para el vector");
        nElem = entrada.nextInt();
        
        //vector notas
        notas = new int[nElem];
        
        //ingresamos un numero
        System.out.println("Ingrese un numero");
        num = entrada.nextInt();
        
        //validamos que num sea < nelem
        if (num < nElem) {
            for (int i = 0; i < num; i++) {
                System.out.println("Ingrese el numero "+(i+1));
                notas[i] = entrada.nextInt();
            }
        } else {
            System.out.println("Error");
        }
        
        System.out.println("Notas");
        for (int i = 0; i < nElem; i++) {
            System.out.println(notas[i]);
        }
    }
}
