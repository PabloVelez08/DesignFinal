/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snake;

import Snake.Frame;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author marcelinne
 */
public class Punto extends Thread {
    
    int velocidad = 10 ; 
    Frame frame;
    Serpiente serpiente;
    Comida comidas;
    PointerInfo a = MouseInfo.getPointerInfo();
    
    int size = 10;
    int speed = 10;
    
    Random r;
        public void run(){
            comidas.agregarComida();
            while(true){            
                if(comidas.getSize() < 500){
                    comidas.agregarComida();
                }
                a = MouseInfo.getPointerInfo();
                Point p = a.getLocation();
                Point last = serpiente.getPosicion();
                Point n = new Point();
                if(last.distance(p) > 1){
                    n = calcCoor(last, p);
                    serpiente.agregar(n);
                    if(serpiente.getSize() >= size){
                        for(int i = 0; i < serpiente.getSize() - size; i++){
                            serpiente.eliminar(i);
                        }
                    }
                    System.out.println(n+"prueba");
                }
                
                Iterator<Point> i = comidas.comidas.iterator();
                while(i.hasNext()){
                    Point food = i.next();
                    if(food.distance(n) < 20){
                        i.remove();
                        size++;
                    }
                }
                frame.repaint();
            }
             
        }       
    
      public Point calcCoor(Point last, Point mouse){
            double degree = 0;
            if(last.x < mouse.x && last.y < mouse.y){
                degree = 360 - Math.toDegrees(Math.atan((double) (mouse.y - last.y) / (mouse.x - last.x)));
            }else if(last.x > mouse.x && last.y > mouse.y){
                degree = 180 - Math.toDegrees(Math.atan((double) (last.y - mouse.y) / (last.x - mouse.x)));
            }else if(last.y > mouse.y && last.x < mouse.x){
                degree = Math.toDegrees(Math.atan((double) (last.y - mouse.y) / (mouse.x - last.x)));
            }else if(last.y < mouse.y && last.x > mouse.x){
                degree = 180 + Math.toDegrees(Math.atan((double) (mouse.y - last.y) / (last.x - mouse.x)));
            }
            Point p = new Point((int) 
                    (last.x + Math.cos(Math.toRadians(degree)) * velocidad), (int) 
                    (last.y - Math.sin(Math.toRadians(degree)) * velocidad));
            return p;
        }
    
    
    
    
}
