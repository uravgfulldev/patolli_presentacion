/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;


import java.util.LinkedList;

/**
 *
 *
 */
public class Tablero {

    

    private LinkedList<Casilla> casillas;

    public Tablero() {
        casillas = new LinkedList<>();
    }

    public LinkedList<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(LinkedList<Casilla> casillas) {
        this.casillas = casillas;
    }
}
