/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socket;

import dominio.Partida;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hugo Rivera
 */
public class pruebasSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClienteSocket c=new ClienteSocket();
        try {
           Partida partidaEnviada=new Partida();
           partidaEnviada.setNumCasillasAspa(20);
           c.enviar(partidaEnviada);
           Partida partidaString=c.recibirMensaje();
            System.out.println("Numero de casillas por aspa: "+partidaString.getNumCasillasAspa());
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pruebasSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    } 
}
