/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec;

/*
 * Llenar un vector
 * Imprimir o mostrar un vector
 */

/**
 *
 * @author Felix Castro
 */

import javax.swing.*;
public class llenImprVec0 {
    public static void main(String[] args) {
        int tamVec;//tamaño del vector o cantidad de elementos
        
        //solicitamos el tamano del vector
        tamVec = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño"
                + " del vector"));
        
        //definimos el vector
        int vec[] = new int[tamVec];
        
        //llenamos el vector
        JOptionPane.showMessageDialog(null, "Ingrese lo elementos del vector");
        for (int i = 0; i < tamVec; i++) {
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+""
                    + ". Digite un numero"));
        }
        
        //imprimir elementos del/o vector
        for (int i = 0; i < tamVec; i++) {
            System.out.println(vec[i]+" ");
        }
    }
}
