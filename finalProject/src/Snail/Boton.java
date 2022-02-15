package Snail;


import java.awt.Graphics;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Boton extends ElementoDeJuego {
    
    private Obstaculo obstaculo;

    public Boton(Posicion posicion, int ancho, int largo) {
        super(posicion, ancho, largo);
    }
    
    private void activar(){
        
    }
    
    private void desactivar(){
        
    }


    @Override
    public void dibujar(Graphics grafico, int ancho, int largo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mover(int xFinal, int yFinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
