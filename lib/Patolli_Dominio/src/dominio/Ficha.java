/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;


import java.util.Objects;

/**
 *
 * @author Hugo Rivera
 */
public class Ficha {


    private int numero;
    private Jugador jugador;
    private boolean enJuego;

    public Ficha(int numero, Jugador jugador, boolean enJuego) {
        this.numero=numero;
        this.jugador = jugador;
        this.enJuego = enJuego;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public boolean isEnJuego() {
        return enJuego;
    }

    public void setEnJuego(boolean enJuego) {
        this.enJuego = enJuego;
    }

    public int getNumero() {
        return numero;
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
        final Ficha other = (Ficha) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.jugador, other.jugador)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Ficha{" + "numero=" + numero + ", jugador=" + jugador + ", enJuego=" + enJuego + '}';
    }
}
