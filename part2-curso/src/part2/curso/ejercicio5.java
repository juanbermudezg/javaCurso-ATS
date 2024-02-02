package part2.curso;

import java.util.Scanner;

/**
 *
 * @author juanb inspired by @programacionATS
 */
public class ejercicio5 {

    /*
    La calificación final de un estudiante de Informática
    se calcula con base a las calificaciones de cuatro
    aspectos de su rendimiento académico: participación,
    primer examen parcial, segundo examen parcial y
    examen final. Sabiendo que las calificaciones anteriores
    entran a la calificación final con ponderaciones
    del 10%, 25%, 25% y 40%. Hacer un programa que
    calcule e imprima la calificación final obtenida por un estudiante.
    */
    
    public ejercicio5() {
        Scanner entrada = new Scanner(System.in);
        float participacion, primerParcial, segundoParcial, finalParcial, notaFinal;
        
        System.out.println("Digite la nota de participación: ");
        participacion = entrada.nextFloat();
        
        System.out.println("Digite la nota del primer parcial: ");
        primerParcial = entrada.nextFloat();
        
        System.out.println("Digite la nota del segundo parcial: ");
        segundoParcial = entrada.nextFloat();
        
        System.out.println("Digite la nota del parcial final: ");
        finalParcial = entrada.nextFloat();
        
        notaFinal = participacion*0.1f + primerParcial*0.25f + segundoParcial*0.25f + finalParcial*0.4f;
        System.out.println("La nota final es de "+notaFinal);
    }
        
}
