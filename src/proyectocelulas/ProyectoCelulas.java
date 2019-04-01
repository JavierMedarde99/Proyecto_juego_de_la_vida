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
        int dimension, porcentaje, eleccion, celulasVivas;

        System.out.println("Inserte las dimensiones del tablero de Vida");
        do {
            dimension = teclado.nextInt();
        } while (dimension > 25 || dimension < 0);
        Matriz m1 = new Matriz(dimension);
        System.out.println("Inserte el porcentaje de celulas vida en el Tablero");
        do {
            porcentaje = teclado.nextInt();
        } while (porcentaje > 100 || porcentaje < 0);
        celulasVivas = m1.calculoDeCelulasVivas(porcentaje);
        System.out.println("Inserte 1 si desea hacerlo manualmente");
        System.out.println("Inserte 2 si desea que lo haga aleatoriamente");
        do {
            eleccion = teclado.nextInt();
        } while (eleccion > 3 || eleccion < 0);
        switch (eleccion) {
            case 1:
                int cont = 0;
                do {
                    m1.darVida();
                    cont++;
                } while (celulasVivas > cont);
                break;
            case 2:
                cont = 0;
                do {
                    m1.darVidaAleatoriamente();
                    cont++;
                } while (celulasVivas > cont);
                break;
        }
    }

}
