/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso.sabado.pkg10.septiembre;

import java.util.Scanner;

/**
 *
 * @author HP
 */

public class CursoSabado10Septiembre {



     public static void main(String[] args) {
  int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el numero que desea su tabla: ");
        n = in.nextInt();
        
        for(int i=1; i<=10; i++)
        {
            System.out.printf("%d X %d = %d \n", n,i, (n*i));
        } 
    
}
}