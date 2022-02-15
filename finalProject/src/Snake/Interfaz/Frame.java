

package Snake.Interfaz;

import Snake.Comida;
import Snake.Serpiente;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import javax.swing.JFrame;

/**
 *
 * @author marcelinne
 */
public class Frame extends JFrame {
    
    Serpiente serpiente;
    Comida comida;
    Image OSC;
    PointerInfo a = MouseInfo.getPointerInfo();

    public Frame() {
    }

  
        public Frame(String s){
            super(s);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(0, 0, 1200, 1200);
            setLayout(new FlowLayout());
            setBackground(Color.blue);
            //addMouseListener(new MyMouseSensor());
            setVisible(true);
            
        }
        
    @Override
        public void paint(Graphics g) {
            Dimension d = getSize();
            checkOffscreenImage();
            Graphics offG = OSC.getGraphics();
            offG.setColor(Color.BLUE);
            offG.fillRect(0, 0, d.width, d.height);
            paintOffscreen(OSC.getGraphics());
            g.drawImage(OSC, 0, 0, null);
        }

        private void checkOffscreenImage() {
            Dimension d = getSize();
            if (OSC == null || OSC.getWidth(null) != d.width
                    || OSC.getHeight(null) != d.height) {
                OSC = createImage(d.width, d.height);
            }
        }

        public void paintOffscreen(Graphics g) {
            //punto.getSerpiente();
            g.clearRect(0, 0, 900, 900);
            Point first = new Point();
            Point last = getMousePosition();
            g.setColor(Color.black); // color punto
            Graphics2D g2 = (Graphics2D) g;
            //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setStroke(new BasicStroke(9 + (float) serpiente.getSize() /20)); // aumenta el grosor
            for(int i = 1; i < serpiente.getSize(); i++){
                first = serpiente.getPoint(i);
                g2.drawLine(first.x, first.y, last.x, last.y);
                last = new Point(first);
            }
            g2.setColor(Color.GREEN);//color de la comida
            for(int i = 0; i < comida.getSize(); i++){
                g2.fillOval(comida.getPoint(i).x, comida.getPoint(i).y,  20, 20); //ancho y alto de la comida
            }
        }

    @Override
    public void repaint(long time, int x, int y, int width, int height) {
        super.repaint(time, x, y, width, height); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
