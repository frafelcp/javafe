
import java.util.Vector;
import javax.swing.*;

public class andyexamen {

    public static void main(String[] args) {
        double num_est = 0, num;
        int i, a;

        double not_deso[] = new double[10];
        double not_orden[] = new double[10];

        num_est = Double.parseDouble(JOptionPane.showInputDialog("numeros de estudiantes"));
        for (i = 0; i <= num_est - 1; i++) {
            not_deso[i] = Double.parseDouble(JOptionPane.showInputDialog("notas" + (i + 1) + "de estudiantes"));
        }

        for (a = 0; a <= num_est - 1; a++) {
            if (not_deso[a] > not_deso[a + 1]) {
                num = not_deso[a];
                not_deso[a] = not_deso[a + 1];
                not_deso[a + 1] = num;
                a = -1;
            }
        }

        JOptionPane.showMessageDialog(null, "la nota  " + not_deso + "estudiantes");
       
        String  x="";
        double array[]=new double[10];
        for ( i = 0; i < 10; i++) {
            x=x+","+array[i];
            
        }
        x=JOptionPane.showInputDialog("");
         
        
        int qbusco = 0;
        int cantidad=0;
          for (i = 0; i <= num_est - 1; i++) {
        if (qbusco == not_deso[i]) {
            cantidad = cantidad + 1;
        }
    }
     JOptionPane.showMessageDialog(null, "el numero de estudiantes que obtuvieron esta nota:" +cantidad);
    
     int n_mas=0;
     n_mas=Integer.parseInt(JOptionPane.showInputDialog("Cuantos numero quiere agregar"));
     int num1=0;
     for (i = (int) num_est; i <= (num_est+n_mas) - 1; i++) {
        not_deso[i] = Double.parseDouble("Nota del " + (i-num_est+1) + " Estudiante: ");
    }
     num_est = num_est + /*parseInt*/(n_mas);
    for (a = 0; a <= num_est - 1; a++) {
        if (not_deso[a] > not_deso[a+1]) {
            num = not_deso[a];
            not_deso[a] = not_deso[a+1];
            not_deso[a+1] = num;
            a = -1;
        }
    }
          JOptionPane.showMessageDialog(null, "la nota  " + not_deso + "estudiantes");
    }
}


