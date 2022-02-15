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
public abstract class ElementoDeJuego{

    Posicion posicion;
    int ancho;
    int largo;

    public ElementoDeJuego(Posicion posicion, int ancho, int largo) {
        this.posicion = posicion;
        this.ancho = ancho;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getLargo() {
        return largo;
    }


    public abstract void dibujar(Graphics grafico,int ancho, int largo);

    public abstract void mover();
}
