/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec;

/*
 * Llenar un vector
 * Imprimir o mostrar un vector
   Usamos la propiedad .length
 */

/**
 *
 * @author Felix Castro
 */

public class llenImprVec01 {
    public static void main(String[] args) {
        String nombres[] = {"Felix", "Laura", "Marta"};        
       
        
        //llenamos el vector
               
        //imprimir elementos del/o vector
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]+" ");
        }
    }
}
