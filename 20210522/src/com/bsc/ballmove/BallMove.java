package com.bsc.ballmove;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{
    MyPanel myPanel;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
    public BallMove(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(300,400);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,10,10);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_DOWN){
                y++;
            }else if (e.getKeyCode()==KeyEvent.VK_UP){
                y--;
            }else if (e.getKeyCode()==KeyEvent.VK_LEFT){
                x--;
            }else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                x++;
            }
            repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
