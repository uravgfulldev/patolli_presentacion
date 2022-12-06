package dominio;

import dominio.Ficha;
import dominio.Jugador;
import dominio.Tablero;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Hugo Rivera
 */
public class Partida {

    private Tablero tablero;
    private ArrayList<Jugador> jugadores;
    private Queue<Jugador> turnos;
    private Jugador jugadorTurno;
    private Jugador ganador;
    private EstadoPartida estado;
    private Ficha fichaMovimiento;
    private boolean avanzaPagando;
    private boolean repiteTurno;
    private boolean pagaTodos;
    private boolean recibeTodos;
    private boolean saliendo;
    private int cuantasApuestas;
    private int numCasillasAspa;
    private int numFichasJugador;
    private int fondoApuesta;
    private int valorApuesta;
    private int cantidadDado;
    private int cuantasMueve;

    public Partida() {
        jugadores=new ArrayList<>();
        turnos=new LinkedList<>();
        tablero=new Tablero();
        this.estado=EstadoPartida.VACIA;
        this.valorApuesta=1;
        this.cantidadDado=-1;
        this.repiteTurno=false;
        this.pagaTodos=false;
        this.recibeTodos=false;
        this.saliendo=false;
    }
    
    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Jugador getJugadorTurno() {
        return jugadorTurno;
    }

    public void setJugadorTurno(Jugador jugadorTurno) {
        this.jugadorTurno = jugadorTurno;
    }

    public EstadoPartida getEstado() {
        return estado;
    }

    public void setEstado(EstadoPartida estado) {
        this.estado = estado;
    }

    public int getNumCasillasAspa() {
        return numCasillasAspa;
    }

    public void setNumCasillasAspa(int numCasillasAspa) {
        this.numCasillasAspa = numCasillasAspa;
    }

    public int getNumFichasJugador() {
        return numFichasJugador;
    }

    public void setNumFichasJugador(int numFichasJugador) {
        this.numFichasJugador = numFichasJugador;
    }

    public int getFondoApuesta() {
        return fondoApuesta;
    }

    public void setFondoApuesta(int fondoApuesta) {
        this.fondoApuesta = fondoApuesta;
    }

    public int getValorApuesta() {
        return valorApuesta;
    }

    public void setValorApuesta(int valorApuesta) {
        this.valorApuesta = valorApuesta;
    }

    public Ficha getFichaMovimiento() {
        return fichaMovimiento;
    }

    public void setFichaMovimiento(Ficha fichaMovimiento) {
        this.fichaMovimiento = fichaMovimiento;
    }

    public boolean avanzaPagando() {
        return avanzaPagando;
    }

    public void setAvanzaPagando(boolean avanzaPagando) {
        this.avanzaPagando = avanzaPagando;
    }

    public int getCuantasApuestas() {
        return cuantasApuestas;
    }

    public void setCuantasApuestas(int cuantasApuestas) {
        this.cuantasApuestas = cuantasApuestas;
    }

    

    public Queue<Jugador> getTurnos() {
        return turnos;
    }

    public void setTurnos(Queue<Jugador> turnos) {
        this.turnos = turnos;
    }

    public int getCantidadDado() {
        return cantidadDado;
    }

    public void setCantidadDado(int cantidadDado) {
        this.cantidadDado = cantidadDado;
    }

    public int getCuantasMueve() {
        return cuantasMueve;
    }

    public void setCuantasMueve(int cuantasMueve) {
        this.cuantasMueve = cuantasMueve;
    }

    public Jugador getGanador() {
        return ganador;
    }

    public void setGanador(Jugador ganador) {
        this.ganador = ganador;
    }

    public boolean repiteTurno() {
        return repiteTurno;
    }

    public void setRepiteTurno(boolean repiteTurno) {
        this.repiteTurno = repiteTurno;
    }

    public boolean pagaTodos() {
        return pagaTodos;
    }

    public void setPagaTodos(boolean pagaTodos) {
        this.pagaTodos = pagaTodos;
    }

    public boolean recibeTodos() {
        return recibeTodos;
    }

    public void setRecibeTodos(boolean recibeTodos) {
        this.recibeTodos = recibeTodos;
    }

    public boolean saliendo() {
        return saliendo;
    }

    public void setSaliendo(boolean saliendo) {
        this.saliendo = saliendo;
    }
    
    @Override
    public String toString() {
        return "Partida{" + "estado=" + estado + ", numCasillasAspa=" + numCasillasAspa + ", numFichasJugador=" + numFichasJugador + ", fondoApuesta=" + fondoApuesta + '}';
    }
}
