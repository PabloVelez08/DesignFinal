/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snake;

import java.awt.Frame;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author marcelinne
 */
public class Juego {
    Frame frame;
    Serpiente serpiente;
    Comida comidas;
    Punto punto;
    //Punto foods;
    Random r;
    public void startGame(){
        //punto = new Punto();
        r = new Random();
        frame = new Frame("slitherio");
        serpiente= new Serpiente();
        comidas= new Comida();
        serpiente.serpiente.add(new Point (500,500));
        Punto s = new Punto();
        s.start();
    }
}
