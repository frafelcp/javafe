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
public class buscarElim1 {
    public static void main(String[] args) {
        
        int numDelete;//numero a buscar y eliminar
        int tamVec;//tamaño del vector
        int vec[];//vector numeros
        
        //solicitamos el tamano del vector
        tamVec = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño"
                + " del vector"));
        
        //crear un vector
        vec = new int[tamVec];
        
        //llenamos el vector
        JOptionPane.showMessageDialog(null, "Ingrese lo elementos del vector");
        for (int i = 0; i < tamVec; i++) {
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+""
                    + ". Digite un numero"));
        }
        
        //solicitamos el numero a buscar y eliminar
        numDelete = Integer.parseInt(JOptionPane.showInputDialog("Ingresa "
                + "el numero a buscar"));
        
        //buscamos el numero ingresado
        int i = 0;
        while (i < tamVec && vec[i] < numDelete) {           
            i++;
        }
        
        //eliminamos el dato si se encontro
        for (int j = i+1; j < numDelete; j++) {
            vec[j-1] = vec[j];
        }
        
        numDelete = numDelete - 1;
        
        //imprimimos el numero a buscar
        if (i==10) {//si vector fue recorrdio sin encotrar el numero
            JOptionPane.showMessageDialog(null, "Numero no encontrado");
        } else {
            if (vec[i] == numDelete) {
                JOptionPane.showMessageDialog(null, "Numero encontrado en "
                        + "la posicion: "+i);
            } else {
                JOptionPane.showMessageDialog(null, "Numero no encontrado");
            }
        }
    }
}
