/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec;

/*
 * Llenar un vector
 * Imprimir o mostrar un vector
   Usamos el for loop o each
 */

/**
 *
 * @author Felix Castro
 */

public class llenImprVec02 {
    public static void main(String[] args) {
        String nombres[] = {"Felix", "Laura", "Marta", "Jose"};        
       
        
        //llenamos el vector
        //imprimir elementos del/o vector
        for (String i : nombres) {
            System.out.println(i + " ");
        }
    }
}
