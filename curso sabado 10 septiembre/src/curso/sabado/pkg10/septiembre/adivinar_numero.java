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
public class adivinar_numero {
    
    
    public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);
         int numero;
         System.out.println("Ingrese el numero que usted crea correcto: ");
         numero = ingreso.nextInt();
         
         while (numero != 666){
             
             if (numero > 666){
                 
                 System.out.println("El numero que ingreso es mayor al numero");
             } else {
                 
                 System.out.println("El numero que ingreso es menor al numero");
             }
         System.out.println("Ingrese el numero que usted crea correcto: ");
         numero = ingreso.nextInt();

         }
        
         System.out.println("Felicidades ha encontrado el numero!!");
        
        
        
    }
}
