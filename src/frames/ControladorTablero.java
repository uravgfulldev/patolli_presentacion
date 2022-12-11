/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frames;

import dibujosG.CnvTablero;
import dominio.Casilla;
import dominio.Ficha;
import dominio.Jugador;
import dominio.Partida;
import java.util.LinkedList;
import socket.ClienteSocket;

/**
 *
 * @author Hugo Rivera
 */
public class ControladorTablero {
    
    private ClienteSocket c;
    public ControladorTablero(Observer observer,ClienteSocket cliente) {
        c=cliente;
        c.agregarObserver(observer);
    }

    public ClienteSocket getC() {
        return c;
    }

    public void setC(ClienteSocket c) {
        this.c = c;
    }

    
    public void enviarPartida(Partida partida){
        c.enviar(partida);
    }
   
}
