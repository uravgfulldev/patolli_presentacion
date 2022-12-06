/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujosG;
import dominio.ColorFicha;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Clase que indica que una ficha tiene la capacidad de dibujarse.
 * @author Hugo Rivera
*/
public class GraficoFicha extends ElementoGrafico{
    
    private int x,y,w,h;
    private ColorFicha color;

    public GraficoFicha(int x, int y, int w, int h, ColorFicha color) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color=color;
    }
    
    
    /**
     * Método para dibujar el elemento gráfico.
     * @param g2d Instancia de Graphics2D
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        switch (this.color) {
            case ROJO:
                g2d.setColor(Color.RED);
                break;
            case AMARILLO:
                g2d.setColor(Color.YELLOW);
                break;
            case VERDE:
                g2d.setColor(Color.GREEN);
                break;
            case AZUL:
                g2d.setColor(Color.BLUE);
                break;
        }
        double x = Double.parseDouble(String.valueOf(this.x));
        double y = Double.parseDouble(String.valueOf(this.y));
        double w = Double.parseDouble(String.valueOf(this.w));
        double h = Double.parseDouble(String.valueOf(this.h));
        Ellipse2D.Double ellipseFicha = new Ellipse2D.Double(x, y, w, h);
        g2d.fill(ellipseFicha);
        g2d.setColor(Color.BLACK);
        g2d.draw(ellipseFicha);
    }
}
