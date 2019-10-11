/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Realice un Algoritmo que dado N valores, Calcule la suma de los N valores

package vec;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Felix Castro
 */
public class vectSuma {
    public static void main(String[] args) {
        //ingresamos por consola
        Scanner entrada = new  Scanner(System.in);
        
        //variables
        int [] vector;
        int elem;
        int suma = 0;
        
        //el numero de numeros a sumar
        System.out.println("Ingrese cuantos numeros va sumar");
        elem = entrada.nextInt();
        
        //vector que guardar los numeros
        vector = new int[elem];
        
        System.out.println("------------------------------------");
        
        //llenamos el vector y sumamos
        for (int i = 0; i < vector.length; i++) {
            System.out.println((i+1)+".Ingrese un numero");
            vector[i] = entrada.nextInt();
            suma = suma + vector[i];
        }
        
        System.out.println("------------------------------------");
        
        //mostramos el vector
        System.out.println("Numeros ingresados");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        
        System.out.println("------------------------------------");
        
        //mostramos la suma de elemntos del vector
        System.out.println("El  total de la suma de los numeros ingresados:"+suma);
    }
}
