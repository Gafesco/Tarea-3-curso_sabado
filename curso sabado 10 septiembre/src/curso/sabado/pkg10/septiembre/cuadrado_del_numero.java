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
public class cuadrado_del_numero {
    
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        int a = 0;
        int b = 0;
        
        System.out.println ("Ingrese un numero: ");
        a = dato.nextInt();
        
        while(a >= 0){
            b = a*a;
            System.out.println("El cuadrado de: " + a + " es: " + b);
            System.out.println();
            System.out.println("Ingrese un numero:");
            a = dato.nextInt();
            
            
        }
        
        
        System.out.println("Fin del programa");
        
    }
    
}
