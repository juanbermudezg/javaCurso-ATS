package part2.curso;

import java.util.Scanner;

/**
 *
 * @author juanb
 */
public class operadoresJava {

    public operadoresJava(){
        
        Scanner entrada = new Scanner(System.in);
        
        float numero1, numero2, suma, resta, mult, div, resto;
        
        System.out.println("Digita 2 números: ");
        
        numero1 = entrada.nextFloat();
        numero2= entrada.nextFloat();
        
        suma=numero1+numero2;
        resta= numero1-numero2;
        mult=numero1*numero2;
        div=numero1/numero2;
        resto=numero1%numero2;
        
        System.out.println("La suma es "+suma+"\nLa resta es "+resta+"\nLa multiplicación es "+mult+"\nLa división es "+div+"\nY el residuo de esta es "+resto);

    }

}
