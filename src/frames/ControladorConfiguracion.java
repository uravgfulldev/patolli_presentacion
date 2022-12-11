/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frames;

import dominio.Partida;
import socket.ClienteSocket;

/**
 *
 * @author Hugo Rivera
 */
public class ControladorConfiguracion {
    
    private ClienteSocket c;
    FrmConfigurarPartida frame;

    public ControladorConfiguracion(Observer observer) {
        c=new ClienteSocket();
        new Thread(c).start();
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
