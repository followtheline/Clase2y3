/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 */
package javaapplication2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba su nombre: ");
       String nombre ;
    Scanner leer = new Scanner(System.in);
      nombre =  leer.next();
      System.out.println("Su nombre es: " +toUpperCase(nombre));
    
    }


   
    
}
