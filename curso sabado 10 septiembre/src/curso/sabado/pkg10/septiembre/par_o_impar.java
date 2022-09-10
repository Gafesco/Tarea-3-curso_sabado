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
public class par_o_impar {
    
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner (System.in);
         int numero;
         System.out.println("Ingrese un numero para operar: ");
         numero = ingreso.nextInt();
         
         while (numero != 0){
             
             if (numero %2 == 0){
                 
                 System.out.println("El numero ingresado es par ");
             }else {
                 
                 System.out.println("El numero ingresado es impar");
             }
             System.out.println("Ingrese un numero para operar: ");
             numero = ingreso.nextInt();
         }
        
        System.out.println("Fin del programa");
        
        
    }
}
