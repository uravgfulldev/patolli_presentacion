/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frames;

import dominio.Partida;

/**
 *
 * @author Hugo Rivera
 */
public class ControladorConfiguracion {
    
    public int numCasillas;
    public int numFichas;
    public int fondoApuesta;
    public int montoApuesta;
    
    FrmConfigurarPartida frame;

    public ControladorConfiguracion() {
        
    }
    
    
    public void obtenValores(){
        
    }
    
    public Partida configurarPartida(Partida partida){
        partida.setNumCasillasAspa(numCasillas);
        partida.setNumFichasJugador(numFichas);
        partida.setFondoApuesta(fondoApuesta);
        partida.setValorApuesta(montoApuesta);
        return partida;
    }
    
}
