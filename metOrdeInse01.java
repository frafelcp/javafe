/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClassVec;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Felix Castro
 */
public class metOrdeInse01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int vector [];
        int nElem;
        
        nElem=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero "
                + "de elementos al vector"));
        
        vector=new int[nElem];
        
        for (int i = 0; i < nElem; i++) {
            System.out.println("Ingresa el numero "+(i+1));
            vector[i]=entrada.nextInt();
        }
        
        for (int i = 1; i < nElem-1; i++) {
            int j=i-1;
            while (j>=0 && vector[j]>vector[j+1]) {                
                
            }
        }
    }
}
