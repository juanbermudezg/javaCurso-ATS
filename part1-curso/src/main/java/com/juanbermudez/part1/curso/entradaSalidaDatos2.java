package com.juanbermudez.part1.curso;

import javax.swing.JOptionPane;

/**
 *
 * @author juanb
 */
public class entradaSalidaDatos2 {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una nombre de ciudad: "); //genera una ventana emergente
        
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero")); //pasando de string a integer
        
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de pi: ")); //ahora con punto, no coma.
        
        JOptionPane.showMessageDialog(null, "La ciudad es: "+cadena);
        JOptionPane.showMessageDialog(null, "El entero es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "La decimal es: "+decimal);
        
    }
    
}
