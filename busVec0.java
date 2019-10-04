/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec;

/**
 *
 * Leer 10 enteros.
 * Llenar un vector.
 * leer un numero n.
 * Buscar n en el vector.
 * mostrar mensaje si se encontro o no
 */

/**
 *
 * @author Felix Castro
 */

//import java.io.*;
import javax.swing.*;
public class busVec0 {
    public static void main(String[] args) {
        
        int numDelete;//numero a buscar y eliminar
        int vec[] = new int[10];//vector numeros con tamaño constante
        
        //llenamos el vector
        JOptionPane.showMessageDialog(null, "Ingrese lo elementos del vector");
        for (int i = 0; i < 10; i++) {
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+""
                    + ". Digite un numero"));
        }
        
        //solicitamos el numero a buscar y eliminar
        numDelete = Integer.parseInt(JOptionPane.showInputDialog("Ingresa "
                + "el numero a buscar"));
        
        //buscamos el numero ingresado
        int i = 0;
        while (i < 10 && vec[i] < numDelete) {           
            i++;
        }
        
        //imprimimos el numero a buscar
        if (i==10) {//si vector fue recorrdio sin encotrar el numero
            JOptionPane.showMessageDialog(null, "Numero no encontrado");
        } else {
            if (vec[i] == numDelete) {
                JOptionPane.showMessageDialog(null, "Numero encotrado en "
                        + "la posicion: "+i);
            } else {
                JOptionPane.showMessageDialog(null, "Numero no encontrado");
            }
        }
    }
}
