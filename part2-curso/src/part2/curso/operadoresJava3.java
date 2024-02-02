package part2.curso;

/**
 *
 * @author juanb
 */
public class operadoresJava3 {
    public operadoresJava3(){
        int x=5, y;
        x++; //x=x+1; x+=1;
        System.out.println(x);
        x--;x--; //x=x-1; x-=1;
        System.out.println(x);
        
        y=x++;
        System.out.println("Y toma el valor actual de x: "+ y);
        System.out.println("x aumenta su valor: "+ x);
        
        y=++x;
        System.out.println("Y.2: "+ y);
        System.out.println("X.2: "+ x);
        
        
    }
}
