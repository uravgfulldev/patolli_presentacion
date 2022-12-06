/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujosG;

import dominio.Casilla;
import dominio.CasillaSemicirculo;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;

/**
 * Clase que indica que una casilla semicírculo tiene la capacidad de dibujarse.
 *
 */
public class GCasillaSemicirculo extends GraficoCasilla {

    public GCasillaSemicirculo(Casilla casilla, int numCasillasAspa) {
        super(casilla, numCasillasAspa);
    }

    /**
     * Método para dibujar el elemento gráfico.
     * @param g2d Instancia de Graphics2D
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        Shape punta = null;
        int x = casilla.getCoordenadaX();
        int y = casilla.getCoordenadaY();
        g2d.setStroke(new BasicStroke(2));
        if (((CasillaSemicirculo) casilla).getLugar() != null) {
            
           
                switch (((CasillaSemicirculo) casilla).getLugar()) {
                    case TOP:
                        punta = new Arc2D.Double(x, y, ANCHO * 2, ALTO * 2, 0, 180, Arc2D.OPEN);
                        break;
                    case LEFT:
                        punta = new Arc2D.Double(x, y, ANCHO * 2, ALTO * 2, 90, 180, Arc2D.OPEN);
                        break;
                    case BOTTOM:
                        punta = new Arc2D.Double(x, y - ALTO, ANCHO * 2, ALTO * 2, 180, 180, Arc2D.OPEN);
                        break;
                    case RIGHT:
                        punta = new Arc2D.Double(x - ANCHO, y, ANCHO * 2, ALTO * 2, 270, 180, Arc2D.OPEN);
                        break;
                }
            
        }
        if (punta != null) {
//            g2d.setColor(Color.magenta);
//            g2d.fill(punta);
            g2d.setColor(Color.BLACK);
            switch (((CasillaSemicirculo) casilla).getLugar()) {
                    case TOP:
                        g2d.drawLine(x + ANCHO, y, x + ANCHO, y + ALTO);
                        break;
                    case LEFT:
                        g2d.drawLine(x, y + ALTO, x + ANCHO, y + ALTO);
                        break;
                    case BOTTOM:
                        g2d.drawLine(x + ANCHO, y, x + ANCHO, y + ALTO);
                        break;
                    case RIGHT:
                        g2d.drawLine(x, y + ALTO, x + ANCHO, y + ALTO);
                        break;
                }
            
            g2d.draw(punta);
        }
        super.dibujar(g2d);
    }

}
