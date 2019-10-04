/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec;

/**
 * Leer n datos numericos
 * Llene un vetor con los n datos leidos
 * Leer un dato numerico
 * Buscar dato numerico en el vector
 * Eliminar el dato numerico si es encontrado
 */

/**
 *
 * @author Felix Castro
 */

//import java.io.*;
import javax.swing.*;
public class buscarElim0 {
    public static void main(String[] args) {
        int n, i = 0, datoe, z,x=6;
        int v[]={1,2,3,4,5,6};
        
        datoe = Integer.parseInt(JOptionPane.showInputDialog("ingrese dato "
                + "que quiere borrar"));
        
        while (datoe != v[i] && i < x) {            
            i = i + 1;
        }
        
        for (z = i+1; z < x; z++) {
            v[z-1]=v[z];
        }
        
        x = x-1;
        
        for (i = 0; i < x; i++) {
            JOptionPane.showMessageDialog(null, v[i]);
        }
    }
}
