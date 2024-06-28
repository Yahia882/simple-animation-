/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animatoin;

import javax.swing.*;
import java.awt.*;


public class Animatoin {

    int x = 50;
    int y =50 ;
    
    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        drawanimation draw = new drawanimation();
        frame.getContentPane().add(draw);
        
        for(int i=0;i<150 ;i++ ){
        x++;
        y++;
        draw.repaint();
        try{
        Thread.sleep(50);}
         catch(Exception e){}       
        }
    
    }
    class drawanimation extends JPanel{
    public void paintComponent(Graphics g){
    g.setColor(Color.red);
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    g.setColor(Color.BLUE);
    g.fillOval(x, y, 50, 50);
    }
    
    }
    public static void main(String[] args) {
        Animatoin a = new Animatoin();
        a.go();
    }
    
}
