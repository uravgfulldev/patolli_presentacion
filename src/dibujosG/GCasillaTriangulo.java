/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujosG;

import dominio.Casilla;
import dominio.CasillaTriangulo;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

/**
 * Clase que indica que una casilla triangular tiene la capacidad de dibujarse.
 * 
 */
public class GCasillaTriangulo extends GCasillaNormal {

    public GCasillaTriangulo(Casilla casilla, int numCasillasAspa) {
        super(casilla, numCasillasAspa);
    }

    /**
     * Método para dibujar el elemento gráfico.
     * @param g2d Instancia de Graphics2D
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        
        int x = casilla.getCoordenadaX();
        int y = casilla.getCoordenadaY();
        Polygon triangulo = null;
        g2d.setColor(new Color(213, 43, 43));
        
        switch (((CasillaTriangulo) casilla).getLugar()) {
            case TOP_LEFT_A:
                triangulo = new Polygon(new int[]{x, x + ANCHO, x}, new int[]{y + (ALTO/2), y+ALTO, y + (ALTO/2)*3}, 3);
                break;
            case LEFT_TOP_A:
                triangulo = new Polygon(new int[]{x - (ANCHO / 2), x, x + (ANCHO / 2)}, new int[]{y, y + ALTO, y}, 3);
                break;
            case LEFT_BOTTOM_A:
                triangulo = new Polygon(new int[]{x + (ANCHO/2), x+ANCHO, x + (ANCHO / 2)*3}, new int[]{y + ALTO, y, y + (ALTO)}, 3);
                break;
            case BOTTOM_LEFT_A:
                triangulo = new Polygon(new int[]{x, x + ANCHO, x}, new int[]{y + (ALTO/2), y+ALTO, y + (ALTO / 2)*3}, 3);
                break;
            case BOTTOM_RIGHT_A:
                triangulo = new Polygon(new int[]{x + ANCHO, x, x + ANCHO}, new int[]{y - (ALTO / 2), y, y + (ALTO / 2)}, 3);
                break;
            case RIGHT_BOTTOM_A:
                triangulo = new Polygon(new int[]{x + (ANCHO / 2), x+ANCHO, x + (ANCHO / 2)*3}, new int[]{y + (ALTO), y, y + (ALTO)}, 3);
                break;
            case RIGHT_TOP_A:
                triangulo = new Polygon(new int[]{x - (ANCHO / 2), x, x + (ANCHO / 2)}, new int[]{y, y + ALTO, y}, 3);
                break;
            case TOP_RIGHT_A:
                triangulo = new Polygon(new int[]{x + (ANCHO), x, x + (ANCHO)}, new int[]{y - (ALTO / 2), y, y + (ALTO / 2)}, 3);
                break;
        }

        if (triangulo != null) {
            g2d.setColor(new Color(213, 43, 43));
            g2d.drawPolygon(triangulo);
            g2d.fill(triangulo);
            
            
        }
           
             super.dibujar(g2d);
        
        
            
            
        
       
    }

}
