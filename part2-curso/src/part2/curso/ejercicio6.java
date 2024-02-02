package part2.curso;

import java.util.Scanner;

/**
 *
 * @author juanb inspired by @programacionATS
 */
public class ejercicio6 {
    
    /*
    Hacer un programa que calcule el cuadrado de una suma
    (a+b)^2 = a^2+b^2+2ab
    */
    
    public ejercicio6() {
        Scanner entrada = new Scanner(System.in);
        
        double a,b,resultado;
        
        System.out.println("Digite a: ");
        a = entrada.nextFloat();
        System.out.println("Digite b: ");
        b = entrada.nextFloat();
        resultado = Math.pow((a+b), 2);
        System.out.println("El resultado es: "+resultado);
        
    }
    
    
}
