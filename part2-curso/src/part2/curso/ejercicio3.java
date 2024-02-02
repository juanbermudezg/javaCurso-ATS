package part2.curso;

import java.util.Scanner;

/**
 *
 * @author juanb inspired by @programacionATS
 */
public class ejercicio3 {

    /*
    Guillermo tiene N dólares. Luis
    tiene la mitad de lo que posee Guillermo.
    Juan tiene la mitad de lo que posee Luis y Guillermo juntos.
    Hacer un programa que calcule e imprima la cantidad
    de dinero que tienen entre los tres.
    */
    
    public ejercicio3() {
        
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;
        
        System.out.println("Ingrese la cantidad N de dólares: ");
        
        float n_USD = entrada.nextFloat();
        guillermo = n_USD;
        luis = guillermo/2;
        juan= (guillermo+luis)/2;
        total=guillermo+luis+juan;
        
        System.out.println("Guillermo tiene: "+guillermo+ " USD.\nLuis tiene: "+luis+" USD.\nJuan tiene: "+juan+" USD.\nFinalmente en total los tres tienen: "+total+" USD.");
        
        
    }
    
}
