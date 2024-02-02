package part2.curso;
/**
 *
 * @author juanb
 */
public class claseMathJava {
    public claseMathJava(){
        
        double raiz = Math.sqrt(9); //retorna valor double, sacar raíz cuadrada
        int raiz2 = (int)Math.sqrt(81);//manera de castear a int
        
        System.out.println("Raices:\n"+raiz);
        System.out.println(raiz2);
        
        double base=5, exponente=2;
        double resultado = Math.pow(base, exponente); //potencias, recibe valores double y devuelve un double
        
        System.out.println("Potencias:\n"+resultado);
        
        double numero=4.56;
        long resultado2=Math.round(numero); //dependiendo del tipo de valor que enviemos, puede ser int o long
        float numero2=6.56f;
        int resultado3=Math.round(numero2);
        
        System.out.println("Redondeos:\n"+resultado2);
        System.out.println(resultado3);
        
        double numero3 = Math.random(); //entrega de tipo double
        
        System.out.println(numero3);
    }
}
