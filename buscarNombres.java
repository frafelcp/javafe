/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Realice un algoritmo que dados N nombres de personas en un vector, 
//Muestre si Un nombre de una persona dada se encuentra en el listado

package vec;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Felix Castro
 */
public class buscarNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //variables
        String [] listNombres;
        int cantNombres;        
        
        System.out.println("CREAR LISTA DE NOMBRES");
        System.out.println("------------------------------");
        
        //ingresamos a cantidad de nombres que va guardar la lista
        cantNombres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese "
                + "cuantos nombres desea guardar en una lista"));
        
        listNombres = new String[cantNombres];
        
//        System.out.println("------------------------------");
        
        //agregar nombres a la lista
        System.out.println("Agregar nombres a la lista");
        for (int i = 0; i < listNombres.length; i++) {
            System.out.println((i+1)+".Agrega un nombre");
            listNombres[i] = entrada.next();
        }
        
        //variables
        int inicio = 0;
        String buscNombre;
        
        //ingresar un nombre para buscarlo
        buscNombre = String.valueOf(JOptionPane.showInputDialog("Ingresar nombre"
                + " a buscar en la lista"));
        
        //busqueda del nombre ingresado
        while (inicio < listNombres.length && !listNombres[inicio].equals(buscNombre)) {            
            inicio++;
        }
        
        //comprobamos el numero buscado
        if (inicio < listNombres.length) {
            System.out.println("El nombre "+listNombres[inicio]+" fue encontrado "
                    + "en la posicion: "+(inicio));
        } else {
            System.out.println("El nombre "+buscNombre+"no fue encontrado en "
                    + "la lista");
        }
    }
}
