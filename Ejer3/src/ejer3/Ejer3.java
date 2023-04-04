/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 

 */
package ejer3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Ingrese una frase: ");
    Scanner leer = new Scanner(System.in);
    String frase;
    frase= leer.nextLine();
    System.out.println("La frase ingresada es: "+frase);
    System.out.println("La frase ingresada en Mayúsculas es: "+ toUpperCase(frase));
    System.out.println("La frase ingresada en Minúsculas es: "+ toLowerCase(frase) );
    
    }
    
}
