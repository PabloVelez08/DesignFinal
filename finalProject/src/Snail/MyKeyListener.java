package Snail;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MyKeyListener implements KeyListener {
    private Teclado teclado;

    public MyKeyListener(Teclado teclado) {
        this.teclado = teclado;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    
    
    

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //teclado.setE(e);
        teclado.keyPressed(e);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //teclado.setE(e);
        teclado.keyReleased(e);
    }
    
}
