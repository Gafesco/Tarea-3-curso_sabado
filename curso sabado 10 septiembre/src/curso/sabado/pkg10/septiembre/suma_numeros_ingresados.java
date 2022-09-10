/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.sabado.pkg10.septiembre;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class suma_numeros_ingresados {
    
    
         public static void main(String[] args) {
             Scanner dato = new Scanner (System.in);
             int numero = 0;
             int sumanumeros = 0;
             
             do{
                 
                 System.out.println("Ingrese un numero: ");
                 numero = dato.nextInt();
                 sumanumeros = sumanumeros+numero;
                 
             }while(numero != 0);
             
             System.out.println("Fin del ciclo, la suma de todos los numeros es: " + sumanumeros);
             
         }
    
}
