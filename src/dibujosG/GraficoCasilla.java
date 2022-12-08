/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujosG;

import dominio.Casilla;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 * Clase que indica que una casilla tiene la capacidad de dibujarse.
 *
 */
abstract class GraficoCasilla extends ElementoGrafico {

    protected Casilla casilla;
    protected int numCasillasAspa;

    public GraficoCasilla(Casilla casilla, int numCasillasAspa) {
        this.casilla = casilla;
        this.numCasillasAspa = numCasillasAspa;
    }

    /**
     * Método para dibujar el elemento gráfico.
     * @param g2d Instancia de Graphics2D
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(2));
        if (casilla.getFicha() != null) {
            (new GraficoFicha(casilla.getCoordenadaX(), casilla.getCoordenadaY(), ANCHO, ALTO, casilla.getFicha().getJugador().getColor())).dibujar(g2d);
        }
    }
}
