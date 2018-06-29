/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RectanglePanel;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Philippe Rzeteslki
 * 
 * 
 */
public class RectanglePanel extends JPanel {
    //Constructs a rectangular panel with the rectangle at a default location.
   public RectanglePanel()
   {
       setPreferredSize(new Dimension (PANEL_WIDTH, PANEL_HEIGHT));
       
       //the rectangle that the paint method draws
       box = new Rectangle (BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
       
       //add mouse listener press listener event
       class MousePressListener implements MouseListener
       {
           public void mousePressed(MouseEvent event)
           {
               int x = event.getX();
               int y = event.getY();
               box.setLocation(x,y);
               repaint();
           }
           
           //do-nothing methods
           public void mouseReleased(MouseEvent event){}
           public void mouseClicked(MouseEvent event) {}
           public void mouseEntered(MouseEvent event) {}
           public void mouseExited(MouseEvent event) {}
       }
       
       MouseListener listener = new MousePressListener();
       addMouseListener(listener);
    }
   
   public void paintComponenet(Graphics g)
   {
       super.paintComponent(g); //calls the superclass, JPanel in this case
       Graphics2D g2 = (Graphics2D)g; //looks like a cast...?
       g2.draw(box);
                      
   }
   private Rectangle box;
   private static final int BOX_X = 100;
   private static final int BOX_Y = 100;
   private static final int BOX_WIDTH = 20;
   private static final int BOX_HEIGHT = 30;
   private static final int PANEL_WIDTH = 300;
   private static final int PANEL_HEIGHT = 300;


}

