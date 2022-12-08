/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.corba.se.spi.activation.ServerManager;
import dominio.IServidor;
import dominio.Partida;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hugo Rivera
 */
public class ClienteSocket implements Observable,IServidor{
    private Socket clienteSocket;
    private DataInputStream inputStream;
    private DataOutputStream outputStream;
    private ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    private Partida partida;
    List<Observer> observers;
    
    public ClienteSocket(){
        try {
            this.clienteSocket=new Socket("localhost",4444);
            this.inputStream=new DataInputStream(this.clienteSocket.getInputStream());
            this.outputStream=new DataOutputStream(this.clienteSocket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public Partida recibirMensaje() throws ClassNotFoundException{
        Partida partida= null;
        try {
            
            //this.outputStream.writeUTF();
            partida=convertirPartida(this.inputStream.readUTF());
            
        } catch (IOException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
        return partida;
    }
    @Override
    public void notificar() {
        
    }

    @Override
    public void agregarObserver(frames.Observer observer) {
        
    }

    @Override
    public void enviar(Partida partida) {
        try {
            this.outputStream.writeUTF(ConvertirObjectoString(partida));
        } catch (IOException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public Partida convertirPartida(String partida) {
        try {
            return objectMapper.readValue(partida, Partida.class);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }
     private String ConvertirObjectoString(Partida partida) {
        try {
            return objectMapper.writeValueAsString(partida);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ServerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
}
