/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujosG;

import java.awt.Graphics2D;

/**
 * Clase que indica que un elemento tiene la capacidad de dibujarse.
 * 
 */
abstract class ElementoGrafico {
    protected final int ANCHO=50;
    protected final int ALTO=50;
    /**
     * Método para dibujar el elemento gráfico.
     * @param g2d Instancia de Graphics2D
     */
    public abstract void dibujar(Graphics2D g2d);
}
