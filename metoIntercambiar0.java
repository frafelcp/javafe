/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec;

import java.util.Scanner;

/**
 *
 * @author Felix Castro
 */
public class metoIntercambiar0 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //definimos variables
        int [] num;
        int elem;
        
        //ingresar cantidad de numeros
        System.out.println("ingrese cuantos numeros va guardar");
        elem = entrada.nextInt();
        
        //vector
        num = new int[elem];
        
        //ingresar numeros
        System.out.println("Ingreso de numeros");
        for (int i = 0; i < num.length; i++) {
            System.out.println((i+1)+".Ingrese un numero ");
            num[i] = entrada.nextInt();
        }
        
        //ordenamos por intercambio
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
        
        //mostramos
        System.out.println("Vector ordenado");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
