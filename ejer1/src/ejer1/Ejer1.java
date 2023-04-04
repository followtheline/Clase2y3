/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma

 */
package ejer1;

import java.util.Scanner;
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int resultado;
       Scanner leer = new Scanner(System.in);
       System.out.println("Escriba el primer número");
       num1 = leer.nextInt();
       System.out.println("Escriba el segundo número");
       num2 = leer.nextInt();
        resultado=num1+num2;
       System.out.println("El resultado de la suma de ambos números ingresados es:" + resultado);
    }
    
}
