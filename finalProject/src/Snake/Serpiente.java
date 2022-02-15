/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snake;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.util.ArrayList;

/**
 *
 * @author marcelinne
 */

    public class Serpiente implements Celda {
    
    // Creacion de las partes de la serpientes 
    Color miColor;  
    int tamano = 10;
    ArrayList<Point> serpiente;
    
    // Construcctor de la serpiente con linkedlist
    public Serpiente(){
        //COMPOSICION: 
        this.serpiente=new ArrayList<Point>();
    }
    

    public Serpiente(Color miColor,  ArrayList<Point> cuerpoSerpiente) {
        this.miColor = miColor;
        this.serpiente = cuerpoSerpiente;
    }
    
    public void agregar(Point n){
        this.serpiente.add(n);
    }
    
   
    
    // Método para dibujar la serpiente sobre el tablero 
    @Override
    public void dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    // Método para mover la serpiente segun el click del mouse 
    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Point getPosicion(){
        Point last = this.serpiente.get(this.serpiente.size() - 1);
        return last;
    }
    
    
    //Agregar a al cuerpo de la serpiente una cabeza 
    public void crecer(){
        PointerInfo a = MouseInfo.getPointerInfo();
        Point p = a.getLocation();
        Punto punto= new Punto();
        Point last = this.serpiente.get(this.serpiente.size() - 1);
                Point n = new Point();
                if(last.distance(p) > 1){
                    n = punto.calcCoor(last, p);
                    serpiente.add(n);
                    if(serpiente.size() >=  tamano){
                        for(int i = 0; i < serpiente.size() - tamano; i++){
                            serpiente.remove(i);
                        }
                    }
                    System.out.println(n+"prueba");
      } 
                
   // Eliminar Serpiente 
    }
    public void morir(){
        
         if(this.serpiente.size() >= tamano){
                        for(int i = 0; i < serpiente.size() - tamano; i++){
                            serpiente.remove(i);
                        }
                    }
    }
    
    public void eliminar(int i){
        this.serpiente.remove(i);
    }
    
    public int getSize(){
        return this.serpiente.size();
    }

   public Point  getPoint(int i ){
        Point t = this.serpiente.get(i);
                return t;
    }
    
    
}
