package part3.curso;

import javax.swing.JOptionPane;

/**
 *
 * @author juanb
 */
public class condicionales5 {

    /*
    Hacer un programa que lea un número
    entero y muestre si el número es múltiplo de 10
    */
    
    public condicionales5() {
        
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero entero: "));
        
        if (numero%10==0){
            JOptionPane.showMessageDialog(null, "Es múltiplo de 10.");
            } else {
            JOptionPane.showMessageDialog(null, "No es múltiplo de 10.");
        }
    }
    
}
