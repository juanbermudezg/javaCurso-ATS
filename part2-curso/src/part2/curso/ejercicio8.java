package part2.curso;

import java.util.Scanner;

/**
 *
 * @author juanb inspired by @programacionATS
 */
public class ejercicio8 {
    
    /*
    Construir un programa que calcule y muestre
    por pantalla las raíces de la ecuación de
    segundo grado de coeficientes reales.
    ax^2+bx+c=0
    */
    public ejercicio8() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la ecuación de la forma ax^2+bx+c=0");
        String ecuacion;
        ecuacion = entrada.nextLine();
        ecuacion=ecuacion.replaceAll("\\s+","");
        ecuacion=ecuacion.toLowerCase();
        ecuacion=ecuacion.replace(",",".");
        double a, b, c, x_1, x_2;
        ecuacion = ecuacion.substring(0, ecuacion.indexOf("=")+2);
        if (ecuacion.contains("x^2")){
            String a_text = ecuacion.substring(0, ecuacion.indexOf("x^2"));
            if (a_text.isEmpty()){
                a=1;
            }
            else if(a_text.equals("-")){
                a=-1;
            }
            else{
                a = Double.valueOf(a_text);
            } 
            ecuacion = ecuacion.substring(ecuacion.indexOf("x^2")+3, ecuacion.length());
            if (ecuacion.contains("x")){
                
                String b_text = ecuacion.substring(0, ecuacion.indexOf("x"));
                ecuacion = ecuacion.substring(ecuacion.indexOf("x")+1, ecuacion.length());
                if (b_text.isEmpty()){
                    b=1;
                }
                else if(b_text.equals("-")){
                    b=-1;
                }
                else{
                    b = Double.valueOf(b_text);
                } 
                
            }
            else{
                b=0;
            }
        }
        else{
            a=0;
            if (ecuacion.contains("x")){
                String b_text = ecuacion.substring(0, ecuacion.indexOf("x"));
                ecuacion = ecuacion.substring(ecuacion.indexOf("x")+1, ecuacion.length());
                if (b_text.isEmpty()){
                    b=1;
                }
                else if(b_text.equals("-")){
                    b=-1;
                }
                else{
                    b = Double.valueOf(b_text);
                } 
            }
            else{
                b=0;
            }
        }
        if (ecuacion.contains("-")){

            ecuacion = ecuacion.substring(0, ecuacion.indexOf("="));

            c=Double.valueOf(ecuacion);
        }else if (ecuacion.contains("-")){
            ecuacion = ecuacion.substring(1, ecuacion.indexOf("="));
            c=Double.valueOf(ecuacion);
        } else {
            c=0;
        }
        x_1=(-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
        x_2=(-b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
        System.out.println("X_1: "+x_1);
        System.out.println("X_2: "+x_2); 
    } 
}
