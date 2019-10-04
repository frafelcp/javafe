/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClassVec;

import java.util.Scanner;

/**
 *
 * @author Felix Castro
 */
public class metOrdeBurb01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int vector[];
        int x;
        int nElem;
        
        System.out.println("Ingrese el numero elementos para el vector");        
        nElem=entrada.nextInt();
        
        vector=new int[nElem];
        
        for (int i = 0; i < nElem; i++) {
            System.out.println("Ingrese el numero "+ (i+1));
            vector[i]=entrada.nextInt();
        }
        
        x=nElem-2;
        
        //metodo burbuja
        for (int i = 0; i < nElem; i++) {
            for (int j = 0; j < x; j++) {
                if (vector[j]>vector[j+1]) {
                    int aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }
            }
            x=nElem-1;
        }
        
    }
}
