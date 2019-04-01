/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocelulas;

import java.util.Scanner;

/**
 *
 * @author javi
 */
public class ProyectoCelulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         int dimension,porcentaje;
         
        System.out.println("Inserte las dimensiones del tablero de Vida");
        do{
        dimension = teclado.nextInt();
        }while(dimension>25 || dimension<0 );
        Matriz m1= new Matriz(dimension);
         System.out.println("Inserte el porcentaje de elulas vida en el Tablero");
         porcentaje = teclado.nextInt();
         System.out.println(m1.calculoDeCelulasVivas(porcentaje));
    }
    
}
