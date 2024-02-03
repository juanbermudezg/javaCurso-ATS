package part3.curso;

import javax.swing.JOptionPane;

/**
 *
 * @author juanb
 */
public class condicionales4 {

    public condicionales4() {
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-5: "));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "Es el numero 1.");
                break;
            case 2: JOptionPane.showMessageDialog(null, "Es el numero 2.");
                break;
            case 3: JOptionPane.showMessageDialog(null, "Es el numero 3.");
                break;
            case 4: JOptionPane.showMessageDialog(null, "Es el numero 4.");
                break;
            case 5: JOptionPane.showMessageDialog(null, "Es el numero 5.");
                break;
            default: JOptionPane.showMessageDialog(null, "Numero fuera de rango");
                break;                
            
    }
        
    }
    
}
