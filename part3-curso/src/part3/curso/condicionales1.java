package part3.curso;

import javax.swing.JOptionPane;

/**
 *
 * @author juanb
 */
public class condicionales1 {

    public condicionales1() {
        
        /*
        La sentencia if else
        */
        
        int numero, dato=5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero==dato){
            JOptionPane.showMessageDialog(null, "El numero es 5!");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no es 5!");
        }
        
    }
   
}
