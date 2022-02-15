/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snake;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author marcelinne
 */
public class Comida implements Celda {

    ArrayList<Point> comidas;
    Random r; // auxiliar
    
    
    public Comida(){
        //COMPOSICION: 
        this.comidas=new ArrayList<Point>();
    }
    
    
    
    public void agregarComida(){
         comidas.add(new Point(r.nextInt(900), r.nextInt(900))); //Randómico de coordenadas
    }
    
    
    @Override
    public void dibujar() {
       
    }

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public int getSize(){
        return this.comidas.size();
    }

   public Point  getPoint(int i ){
        Point t = this.comidas.get(i);
                return t;
    }
    
    
}
