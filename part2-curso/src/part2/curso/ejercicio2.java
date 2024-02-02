package part2.curso;

import java.util.Scanner;

/**
 *
 * @author juanb inspired by @programacionATS
 */
public class ejercicio2 {

    /*
    Hacer un programa que calcule e imprima el salario semanal de 
    un empleado a partir de sus horas semanales trabajadas y de su salario
    por hora
    */
    
    public ejercicio2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al ejercicio #2.\nPor favor digite cuanto gana por hora en dolares.");
        double salario = entrada.nextDouble();
        System.out.println("Ahora cuantas horas trabajó esta semana.");
        short horasTrabajadas = entrada.nextShort();
        double totalSueldo = salario*horasTrabajadas;
        System.out.println("El total de su salario semanal es de "+ totalSueldo+ " USD.");
    }
        
}
