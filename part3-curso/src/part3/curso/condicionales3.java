package part3.curso;

import javax.swing.JOptionPane;

/**
 *
 * @author juanb
 */
public class condicionales3 {

    public condicionales3() {
        
        /*
        La sentencia if else
        */
        
        int numero, dato=5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero>dato){
            JOptionPane.showMessageDialog(null, "El numero es mayor de 5!");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es menor que 5!");
        }
        /*
        == Igualdad
        != Diferencia
        > Mayor que
        < Menor que
        >= Mayor o igual que
        <= Menor o igual que
        */
        
    }
   
}
