/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y 
la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package ejer5;

import java.util.Scanner;
public class Ejer5 {

 
    public static void main(String[] args) {
    System.out.println("Ingrese un número entero: ");
    Scanner leer= new Scanner(System.in);
    int num;
    num= leer.nextInt();
    System.out.println("El número ingresado es: "+num+ " ,el doble es: "+2*num+ " ,su triple: "+3*num+ " y finalmente la raíz cuadrada es: "+Math.sqrt(num));
    }
    
}
