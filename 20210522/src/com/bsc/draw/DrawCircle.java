package com.bsc.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{
    private MyPanel myPanel;
    public static void main(String[] args) {
            new DrawCircle();
    }
    public DrawCircle(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //g.drawOval(0,0,100,100);
        //g.drawLine(0,0,100,100);
        //g.drawRect(10,10,100,200);
//        g.setColor(Color.BLUE);
//        g.fillRect(10,10,200,300);
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/四级1.png"));
//        g.drawImage(image,10,10,1294,730,this);
//        g.setColor(Color.red);
//        g.setFont(new Font("隶书",Font.BOLD,50));
//        g.drawString("我爱中国",100,100);
        g.setColor(Color.BLUE);
        g.fillRect(10,10,5,40);
        g.fillOval(12,20,20,20);
        g.fillRect(30,10,5,40);
        g.fillRect(12,20,20,20);
    }
}
