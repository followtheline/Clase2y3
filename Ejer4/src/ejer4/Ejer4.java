/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package ejer4;

import java.util.Scanner;
public class Ejer4 {

  
    public static void main(String[] args) {
       System.out.println("Ingrese la temperatura en grados centígrados: ");
       Scanner leer = new Scanner(System.in);
       double temp, fahr;
       temp= leer.nextInt();
       fahr= 32 + ((9* temp) / 5);
       System.out.println("La temperatura ingresada,convertida a grados Fahrenheit es: "+fahr);
               
    }
    
}
