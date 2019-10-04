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
public class busBinaria {
    public static void main(String[] args) {
        //objeto para leer datos
        Scanner entrada = new Scanner(System.in);
        
        //variables
        int vector[];
        int datBus;
        int nElm;
        int sw;
        int posInf;
        int posSupe;
        
        //solicitamos el numero de elementos para el vector
        nElm=Integer.parseInt(JOptionPane.showInputDialog("Ingresar elementos "
                + "del vector"));
        
        //creamos un vector
        vector=new int[nElm];
        
        //inicializar contadores y acumuladores
        sw=1;
        posInf=0;
        posSupe=nElm-1;
        
        //leer datos y guardalos en un vector
        for (int i = 0; i < nElm; i++) {
            System.out.println("Ingrese el numero "+(i+1));
            vector[i]=entrada.nextInt();
        }
        
        //mostramos vector sin metodo de ordenamiento
        System.out.println("Datos en el orden ingresado");
        for (int i = 0; i < nElm; i++) {
            System.out.println(vector[i]);
        }
        
        
    }
}
