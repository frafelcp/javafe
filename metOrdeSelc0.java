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
public class metOrdeSelc0 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int nElem;
        int vector[];
        
        nElem=entrada.nextInt();
        
        vector=new int[nElem];
        
        //metodo por seleccion
        for (int i = 0; i < nElem-1; i++) {
            for (int j = i+1; j < nElem; j++) {
                if (vector[i]>vector[j]) {
                    int aux = vector[i];
                    vector[i]=vector[j];
                    vector[j]=aux;
                }
            }
        }
    }
}
