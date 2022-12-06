/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Hugo Rivera
 */
public class Jugador {
   
    private byte numJugador;
    private String nombre;
    private int numFrijoles;
    private ColorFicha color;
    private ArrayList<Ficha> fichas;
    private ArrayList<Ficha> fichasGanadoras;
    //private ArrayList<Apuesta> apuestas;
    private Queue<Ficha> colaFichas;
    private CasillaPropia casillaPropia;
    private boolean haMetidoFicha;
    private boolean perdio;
    private boolean puedeMeter;
    private boolean meterFicha;
    private boolean asignado;

    public Jugador(){
        this.asignado=false;
        this.puedeMeter=false;
        this.haMetidoFicha=false;
        this.fichas=new ArrayList<>();
        this.colaFichas=new LinkedList<>();
        this.fichasGanadoras=new ArrayList<>();
        
    }

    public byte getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(byte numJugador) {
        this.numJugador = numJugador;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumFrijoles() {
        return numFrijoles;
    }

    public void setNumFrijoles(int numFrijoles) {
        this.numFrijoles = numFrijoles;
    }

    
    
    public ColorFicha getColor() {
        return color;
    }

    public void setColor(ColorFicha color) {
        this.color = color;
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    public CasillaPropia getCasillaPropia() {
        return casillaPropia;
    }

    public void setCasillaPropia(CasillaPropia casillaPropia) {
        this.casillaPropia = casillaPropia;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    public Queue<Ficha> getColaFichas() {
        return colaFichas;
    }

    public void setColaFichas(Queue<Ficha> colaFichas) {
        this.colaFichas = colaFichas;
    }

    public ArrayList<Ficha> getFichasGanadoras() {
        return fichasGanadoras;
    }

    public void setFichasGanadoras(ArrayList<Ficha> fichasGanadoras) {
        this.fichasGanadoras = fichasGanadoras;
    }

    public boolean haMetidoFicha() {
        return haMetidoFicha;
    }

    public void setHaMetidoFicha(boolean haMetidoFicha) {
        this.haMetidoFicha = haMetidoFicha;
    }

    public boolean isMeterFicha() {
        return meterFicha;
    }

    public void setMeterFicha(boolean meterFicha) {
        this.meterFicha = meterFicha;
    }

    public boolean puedeMeter() {
        return puedeMeter;
    }

    public void setPuedeMeter(boolean puedeMeter) {
        this.puedeMeter = puedeMeter;
    }

    public boolean perdio() {
        return perdio;
    }

    public void setPerdio(boolean perdio) {
        this.perdio = perdio;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (this.numJugador != other.numJugador) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Jugador{" + "numJugador=" + numJugador + ", nombre=" + nombre + ", color=" + color + ", asignado=" + asignado + '}';
    }

    
}
