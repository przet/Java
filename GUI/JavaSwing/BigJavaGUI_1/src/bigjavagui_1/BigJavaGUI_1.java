/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigjavagui_1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import RectanglePanel.RectanglePanel;


/**
 *
 * @author Philippe Rzetelski
 */
public class BigJavaGUI_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanglePanel rectPanel = new RectanglePanel();
        JFrame appFrame = new JFrame();
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setContentPane(rectPanel);
        appFrame.pack();
        appFrame.setVisible(true);
     
    }
    
}
