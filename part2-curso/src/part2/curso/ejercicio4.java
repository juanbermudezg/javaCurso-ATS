package part2.curso;

import java.util.Scanner;

/**
 *
 * @author juanb inspired by @programacionATS
 */
public class ejercicio4 {

    /*
    Una compañía de venta de carros usados, paga a su personal
    de ventas un salario de 1000 USD mensuales, más una comisión
    de 150 USD por cada carro vendido, más el 5% del valor de la
    centa por carro. Cada mes el capturista de la empresa ingresa
    en la computadora los datos pertinentes. Hacer un programa que
    calcule e imprima el salario mensual de un vendedor dado.
    */
    
    public ejercicio4() {
        
        Scanner entrada = new Scanner(System.in);
        double base, totalSueldo, bonificacionBase, bonificacionPorcentual;
        int cantidadCarros;
        String nombreEmpleado;
        
        System.out.println("Bienvenido a un nuevo ejercicio, por favor digite el nombre del empleado: ");
        nombreEmpleado = entrada.nextLine();
        System.out.println("Ahora, ¿cuál es el sueldo base en USD?: ");
        base = entrada.nextDouble();
        System.out.println("Continuemos con la bonificación por carro vendido en USD: ");
        bonificacionBase = entrada.nextDouble();
        System.out.println("Ahora la bonificación por venta de cada carro de manera porcentual: ");
        bonificacionPorcentual = entrada.nextDouble();
        System.out.println("Se prosigue la cantidad de carros vendidos: ");
        
        cantidadCarros = entrada.nextInt();
        
        double valorVenta = 0;
        
        System.out.println("Finalmente colocar el valor de venta de cada carro: ");
        
        for (int i=0; i<cantidadCarros; i++){
            System.out.println("Digite el valor de venta del carro #"+(i+1));
            valorVenta+=entrada.nextDouble()*bonificacionPorcentual;
        }
        totalSueldo=base+cantidadCarros*bonificacionBase+valorVenta;
        System.out.println("El total del sueldo mensual de "+ nombreEmpleado+ " es de "+ totalSueldo + " USD.");
    }
    
}
