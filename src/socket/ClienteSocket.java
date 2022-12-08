/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;

import dominio.IServidor;
import dominio.Partida;
import java.net.ServerSocket;
import java.util.List;
import java.util.Observer;

/**
 *
 * @author Hugo Rivera
 */
public class ClienteSocket implements Observable,IServidor{
    private ServerSocket serverSocket;
    private Partida partida;
    List<Observer> observers;
    
    
    @Override
    public void notificar() {
        
    }

    @Override
    public void agregarObserver(frames.Observer observer) {
        
    }

    @Override
    public void enviar(Partida partida) {
        
    }
    
}
