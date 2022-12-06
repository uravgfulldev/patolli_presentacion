/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujosG;

import dominio.Casilla;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Clase que indica que una casilla propia tiene la capacidad de dibujarse.
 * @author alfonsofelix
 */
public class GCasillaPropia extends GCasillaNormal{

    public GCasillaPropia(Casilla casilla, int numCasillasAspa) {
        super(casilla, numCasillasAspa);
    }

    /**
     * Método para dibujar el elemento gráfico.
     * @param g2d Instancia de Graphics2D
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        super.dibujar(g2d);
        Rectangle rect = new Rectangle();
        g2d.setColor(Color.ORANGE);
        rect.setBounds(casilla.getCoordenadaX(), casilla.getCoordenadaY(), ANCHO, ALTO);
        g2d.fill(rect);
        g2d.setColor(Color.BLACK);
        g2d.draw(rect);
        
    }
    
}
