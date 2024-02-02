package part2.curso;

import java.util.Scanner;

/**
 *
 * @author juanb inspired by @programacionATS
 */
public class ejercicio1 {

    public ejercicio1() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido al primer ejercicio, by juanbermudezg.\n¿Cuántas materias vió este semestre?");
        
        short cantidadMaterias = entrada.nextShort();
        
        double notas[];
        notas = new double[cantidadMaterias];
        
        for (int i=0; i<cantidadMaterias; i++){
            System.out.println("Ingrese la nota para la materia #"+(i+1));
            notas[i]=entrada.nextDouble();
        }
        double suma=0;
        
        for (int j=0; j<cantidadMaterias; j++){
            suma+=notas[j];
        }
        System.out.println("El total es "+ suma);
    }
    
}
