/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * 
 */
public class CasillaTriangulo extends Casilla{

    

    private LugarTriangulo lugar;
    
    public CasillaTriangulo() {
    }

    public CasillaTriangulo(int coordenadaX, int coordenadaY, int numero, LugarTriangulo lugar) {
        super(coordenadaX, coordenadaY, numero);
        this.lugar=lugar;
    }

    public LugarTriangulo getLugar() {
        return lugar;
    }
}
