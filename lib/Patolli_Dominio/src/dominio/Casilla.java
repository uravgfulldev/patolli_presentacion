/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.awt.geom.Ellipse2D;
import java.io.Serializable;

/**
 * Clase con los datos necesarios para todas las casillas.
 * 
 */
public class Casilla{

   
    private int coordenadaX;
    private int coordenadaY;
    private int numero;
   

    public Casilla() {
    }

    public Casilla(int coordenadaX, int coordenadaY, int numero) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.numero=numero;
    }
    
    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Casilla{" + "numero=" + numero ;
    }
}
