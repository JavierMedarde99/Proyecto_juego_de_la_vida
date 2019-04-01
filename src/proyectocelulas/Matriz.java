/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocelulas;

/**
 *
 * @author javi
 */
public class Matriz {
    
    private boolean[][] matrizVida;

    public Matriz(int x) {
        matrizVida = new boolean[x][x];
    }

    public boolean[][] getMatrizVida() {
        return matrizVida;
    }

    public void setMatrizVida(boolean[][] matrizVida) {
        this.matrizVida = matrizVida;
    }

    
    
    
    
}
