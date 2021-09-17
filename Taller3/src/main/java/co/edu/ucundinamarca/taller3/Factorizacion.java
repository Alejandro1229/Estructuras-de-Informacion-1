
package co.edu.ucundinamarca.taller3;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Factorizacion {
    
    Registro de registrador estático = Logger.getLogger (Main.class.getName ());
    
    public static void main (String [] args) {
    
        Entrada del escáner = nuevo escáner (System.in);
        log.info ("Ingrese el número para calcular su factorial:");
        
        int numero = entrada.nextInt ();
        Funciones funciones = new Funciones ();
        
        
        int FactorialA = funciones.fact (numero);
        log.info ("el factorial de" + numero + "es" + FactorialA);
        
        
}
