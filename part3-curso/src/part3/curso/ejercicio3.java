package part3.curso;

import javax.swing.JOptionPane;

/**
 *
 * @author juanb
 */
public class ejercicio3 {

    /*
    Hacer un programa que lea un carácter
    por teclado y compruebe si es una letra
    mayúscula
    */
    
    public ejercicio3() {
        
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if (letra >=65 && letra <=90){
            JOptionPane.showMessageDialog(null, "Es una mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "No es mayuscula");
        }
        
        
    }
    
}
