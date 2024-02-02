package com.juanbermudez.part1.curso;

/**
 *
 * @author juanb
 */
public class tiposVariables {
    public static void main(String[] args) {
        //enteros
        byte enteroByte = -12;  //de -128 a 127 || 8 bit
        short enteroShort = 32760; //de -32768 a 32767 || 16 bit
        int enteroInt = 2147483647;//de -2147483648 a 2147483647 || 32 bit
        long enteroLong = Long.MAX_VALUE;// 9223372036854775807 || 64 bit
        
        //decimal
        float decimalFloat = 3.45f; //32 bit, es necesario colocar la 'f' al final
        double decimalDouble = 3.14165858; //64 bit
        
        //caracter
        char caracterChar='a'; //caracter, con un valor asociado a el código ASCII
        
        //boolean
        boolean bandera_A = true;
        boolean bandera_B = false;
    
    }
}
