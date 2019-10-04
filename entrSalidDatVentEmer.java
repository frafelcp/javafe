/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import javax.swing.JOptionPane;

/**
 *
 * Entrada de datos por ventana emergente
 * salida de datos por ventana emergente
 */

/**
 *
 * @Felix castro
 */
public class entrSalidDatVentEmer {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un "
                + "numero"));
        
        JOptionPane.showMessageDialog(null, "El numero es : "+numero);
    }
}
