/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

    import java.awt.*;
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JFrame;
    import javax.swing.*;
    import java.awt.geom.Ellipse2D;

/**
 *
 * @author rifki fikri
 */
public class Cobaa extends JPanel{
    public void kepala(Graphics g){
        super.paintComponent(g);
        Graphics2D se3 = (Graphics2D)g;
        int x[] = {50, 150, 250};
        int y[] ={250, 50, 250};
        se3.setColor(Color.BLACK);
        se3.fill(new Polygon(x,y, x.length));
    }
    
    public void BonekaComponents(Graphics g) {
        kepala(g);
    }
    
     public static void main(String[] args){
        Cobaa panelGambar =new Cobaa();
        JFrame obj = new JFrame();
        
        obj.setSize(650, 350);
        obj.getContentPane().add(panelGambar);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
    
}
