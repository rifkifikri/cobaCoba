/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

    import java.awt.Color;
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
/**
 *
 * @author rifki fikri
 */
public class Boneka2 extends JPanel{
    public void kepala(Graphics g){
        super.paintComponent(g);
        Graphics2D se3 = (Graphics2D)g;
        
        se3.setColor(Color.BLACK);
        se3.fillOval(145, 40, 90, 90);
    }
    
     public void mata(Graphics g){
        super.paintComponents(g);
        //mata luar
        Graphics2D se4 = (Graphics2D)g;
        se4.setColor(Color.WHITE);
        se4.fillOval(157, 70, 30, 30);
        se4.setColor(Color.WHITE);
        se4.fillOval(192, 70, 30, 30);
        //mata dalam
        se4.setColor(Color.BLACK);
        se4.fillOval(168, 78, 15, 15);
        se4.setColor(Color.BLACK);
        se4.fillOval(195, 78, 15, 15);
    }
    public void BonekaComponents(Graphics g) {
      
        kepala(g);
        mata(g);
        
    }
    
     public static void main(String[] args){
     Boneka2 panelGambar =new Boneka2();
        JFrame obj = new JFrame();
       obj.setLocationRelativeTo(null);
        obj.setSize(400, 400);
        obj.getContentPane().add(panelGambar);
         
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.setVisible(true);
     }
    
}
