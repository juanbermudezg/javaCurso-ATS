package part3.curso;

import javax.swing.JOptionPane;

/**
 *
 * @author juanb
 */
public class condicionales2 {

    public condicionales2() {
        
        /*
        La sentencia if else
        */
        
        int numero, dato=5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero!=dato){
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5!");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es 5!");
        }
        
    }
   
}
