package Snail;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bryan
 */
public class Nivel extends JPanel {

    ElementoDeJuego elemento;
    MyKeyListener listener;
    Teclado teclado;
   
    
    public Nivel(ElementoDeJuego elemento, Teclado teclado) {
        this.elemento = elemento;
        this.teclado = teclado;
        this.listener = new MyKeyListener(teclado);
        addKeyListener(listener);
        setFocusable(true);
        
    }
    
    void actualizar(){
        
        elemento.mover();
    }

    public void paint(Graphics g) {
        super.paint(g);
        elemento.dibujar(g, this.elemento.getAncho(), this.elemento.getLargo());
    }

}
