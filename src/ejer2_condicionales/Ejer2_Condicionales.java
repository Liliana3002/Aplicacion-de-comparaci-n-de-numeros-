/*Pedir dos números y decir cuál es el mayor o si son iguales.*/
package ejer2_condicionales;

import static java.lang.ProcessBuilder.Redirect.to;
import javax.swing.JOptionPane;

public class Ejer2_Condicionales {

    public static void main(String[] args) {
        int  numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite número 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite número 2: "));
        
        if (numero1 > numero2) {                
            JOptionPane.showMessageDialog (null, "El número uno es mayor que el número dos");
        }
        
        else if (numero1 < numero2) {                
            JOptionPane.showMessageDialog (null, "El número uno es menor que el número dos");
        }
                      
        else{
           JOptionPane.showMessageDialog (null, "Los números son iguales"); 
        }
    }    
    
}
