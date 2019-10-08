/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Felix Castro
 */
public class metOrdeInse01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int [] vector;
        int nElem, aux;
        
        nElem=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero "
                + "de elementos al vector"));
        
        vector=new int[nElem];
        
        //llenar vector
        for (int i = 0; i < nElem; i++) {
            System.out.println("Ingresa el numero "+(i+1));
            vector[i]=entrada.nextInt();
        }
        
        //metodo insercion
        for (int i = 1; i < nElem; i++) {
            //buscamos la posicion correecta del elemento destino
            int j=i;
            aux = vector[i];
            //localizamos el punto de insercion buscando hacia abajo
            while (j>0 && aux<vector[j-1]) {                
                vector[j] = vector[j-1];
                j--;
            }
            vector[j] = aux;
        }
        
        System.out.println("Vector en orden ascendente");
        for (int i = 0; i < nElem; i++) {
            System.out.println(vector[i]);
        }
        
        System.out.println("Vector en orden descendente");
        for (int i = (nElem-1); i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}
