package com.juanbermudez.part1.curso;

/**
 *
 * @author juanb
 */
import java.util.Scanner;

public class entradaSalidaDatos {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); //un objeto nuevo
        
        int numero;
        
        System.out.println("Digite un numero: ");
        
        numero = entrada.nextInt();
        
        System.out.println("El numero es " + numero);
        
        //Otro ejemplo
        
        float numeroF;
        
        System.out.println("Digite el 2° numero: ");
        
        numeroF = entrada.nextFloat();
        
        System.out.println("El 2° numero es " + numeroF);
        
        //Otro ejemplo 2
        
        double numeroD;
        
        System.out.println("Digite el 3° numero: ");
        
        numeroD = entrada.nextDouble();
        
        System.out.println("El 3° numero es " + numeroD);
        
        //Cadenas de texto
        
        String aeropuerto;
        
        System.out.println("Digite el nombre de un aeropuerto: ");
        
        aeropuerto = entrada.next(); //no guarda después del espacio a menos que se ponga .nextLine()
        
        System.out.println("El aeropuerto es "+ aeropuerto);
        
        //Caracteres
        
        char letra;
        
        System.out.println("Digite una letra: ");
        letra = entrada.next().charAt(0); //lee el primer caracter
        System.out.println("La letra es "+letra);
    }
    
}
