package part2.curso;

import java.util.Scanner;

/**
 *
 * @author juanb inspired by @programacionATS
 */
public class ejercicio7 {
    
    /*
    Construir un programa que, dado un número total de horas,
    devuelve el número de semanas, días y horas equivalentes.
    Por ejemplo, dado un total de 1000 horas debe mostrar 5
    semanas, 6 días y 16 horas.
    */
    
    public ejercicio7() {
        
        Scanner entrada = new Scanner(System.in);
        int horasTotales, semanas, dias, horasResiduo, temp;
        
        System.out.println("Ingrese la cantidad de horas: ");
        
        horasTotales = entrada.nextInt();
        semanas = horasTotales/168;
        temp = horasTotales%168;
        dias = temp/24;
        temp %=24;
        horasResiduo = temp;
        
        System.out.println("El total de semanas es "+ semanas +".\nEl total de días es de "+ dias+".\nFinalmente las horas residuo son "+horasResiduo+".");
        
    }
    
}
