package Snail;


import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
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
public class Teclado {
    private Caracol caracol;

    public Teclado(Caracol caracol) {
        this.caracol = caracol;
    }
    
    public void keyReleased(KeyEvent e){
         caracol.setxFinal(0);
         caracol.setyFinal(0);
         //caracol.xFinal = 0;
         //caracol.yFinal = 0;
    };
    
    public void keyPressed(KeyEvent e){
        
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    //return 1;
                    caracol.setxFinal(1);
                    //caracol.xFinal = 1;
                }
			
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    //return -1;
                    caracol.setxFinal(-1);
                    //caracol.xFinal = -1;
                }
			
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    //return -1;
                    caracol.setyFinal(-1);
                    //caracol.yFinal = -1;
                }
                        
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    //return 1;
                    caracol.setyFinal(1);
                    //caracol.yFinal = -1;

                }
                
    };
}
