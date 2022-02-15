package Snail;


import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Caracol extends ElementoDeJuego {

    private int velocidad;
    private final ImageIcon imagen;
    int xFinal = 1;
    int yFinal = 1;

    public int getxFinal() {
        return xFinal;
    }

    public int getyFinal() {
        return yFinal;
    }

    
    public void setxFinal(int xFinal) {
        this.xFinal = xFinal;
    }

    public void setyFinal(int yFinal) {
        this.yFinal = yFinal;
    }
    

    
    public Caracol(int velocidad, Posicion posicion, int ancho, int largo) throws IOException {
        super(posicion, ancho, largo);
        this.velocidad = velocidad;
        this.imagen = new ImageIcon(getClass().getResource("Imagenes/caracol.png"));
    }
    
    @Override
    public void dibujar(Graphics grafico, int ancho, int largo) {
        ancho = this.ancho;
        largo = this.largo;
        int posicionX = this.posicion.getX();
        int posicionY = this.posicion.getY();
        grafico.setColor(Color.red);
        grafico.drawImage(this.imagen.getImage(), posicionX, posicionY, ancho, largo, null);
        
    }

    @Override
    public void mover() {
        
        int x0 = posicion.getX();
        int y0 = posicion.getY();
        
        if ((x0 + this.xFinal > 0) && (x0 + this.xFinal < 600)){
            posicion.setX(x0 + xFinal); 
        }
        
        if((y0 + this.yFinal > 0) && (y0 + this.yFinal < 500)){
            posicion.setY(y0 + yFinal);
        }
    }
    
    public void girar() {

    }

    public void acelerar() {

    }

}
