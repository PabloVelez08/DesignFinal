package Snail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Juego {
    private boolean estado;
    private Jugador jugador;
    private Nivel nivel;

    public Juego(boolean estado, Jugador jugador, Nivel nivel) {
        this.estado = estado;
        this.jugador = jugador;
        this.nivel = nivel;
    }
    
    public void iniciarJuego(){
        this.estado = true;
    }
    
    public void actualizarEstado(boolean estadoActual){
        this.estado = estadoActual;
    }
    
    public void terminarJuego(){
        this.estado = false;
    }
}
