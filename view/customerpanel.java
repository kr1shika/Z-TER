package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rkc69
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class customerpanel extends JPanel{

    
    public customerpanel (){
        setOpaque(false);

    }

    @Override
    protected void paintComponent(Graphics g) {
Graphics2D g2 = (Graphics2D) g.create();

        // Set rendering hints for smoother drawing
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        // Set a rounded border
        int borderArc = 20; // Adjust the arc size as desired
        g2.setColor(getForeground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderArc, borderArc);

        g2.dispose();
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
    }
    
}
