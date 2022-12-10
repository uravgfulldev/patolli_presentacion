/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dominio.IServidor;
import dominio.Partida;
import frames.Observer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hugo Rivera
 */
public class ClienteSocket extends Thread implements Observable,IServidor{
    private Socket clienteSocket=null;
    private DataInputStream inputStream;
    private DataOutputStream outputStream;
    private ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    private Partida partida;
    private Observer observer;
    //List<Observer> observers;
    
    public ClienteSocket(){
       
        
    }
    public Partida recibirMensaje() throws ClassNotFoundException{
        Partida partida= null;
        String partidaString="";
        try {      
            partidaString = inputStream.readUTF();
            
            //System.out.println(partidaString);
            if(partidaString!=null){
                return partida=convertirPartida(partidaString);
            }

           
        } catch (IOException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
        return partida;
    }
    @Override
    public void notificar(Partida partida) {
        if (partida != null) {
            observer.update(partida);
        }
    }

    @Override
    public void agregarObserver(frames.Observer observer) {
        this.observer=observer;
    }

    @Override
    public void enviar(Partida partida) {
        try {
            String n=ConvertirObjectoString(partida);
            this.outputStream.writeUTF(n);
        } catch (IOException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     private Partida convertirPartida(String partida) {
        try {
            if(partida!=null) return objectMapper.readValue(partida, Partida.class);
           
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

     private String ConvertirObjectoString(Partida partida) {
        try {
            return objectMapper.writeValueAsString(partida);
        } catch (JsonProcessingException ex) {
            System.out.println("error");
        }
        return "";
    }
     public void conectar() throws IOException, ClassNotFoundException, ConnectException {
        if (clienteSocket == null) {
            clienteSocket = new Socket("localhost", 4444);
            //  out = new PrintWriter(cliente.getOutputStream(), true);
            inputStream = new DataInputStream(clienteSocket.getInputStream());
            outputStream = new DataOutputStream(clienteSocket.getOutputStream());
            Partida partida = null;
            try {
                partida = recibirMensaje();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            notificar(partida);
        }
        while (true) {
            try {
                Partida partida;
                if ((partida = recibirMensaje()) != null) {
                    notificar(partida);
                }
            } catch (Exception e) {

            }
        }
    }
    @Override
    public void run() {
        try {
            conectar();
        } catch (IOException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
