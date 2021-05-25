package com.bsc.tankegame02;

import javax.swing.*;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

@SuppressWarnings({"all"})
public class MyPanel extends JPanel implements KeyListener {
    MyTank myTank;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    public MyPanel(){
        myTank = new MyTank(100,100);

        int enemyTanksSize = 3;
        for (int i = 0; i < enemyTanksSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.setDirect(2);
            enemyTanks.add(enemyTank);
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        drawTank(myTank.getX(),myTank.getY(),g,myTank.getDirect(),0);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
        }
    }
    public void drawTank(int x,int y,Graphics g,int direct,int type){
        switch (type){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.red);
                break;
        }
        switch (direct){
            case 0://向上
                g.fill3DRect(x,y,10,50,false);
                g.fill3DRect(x+10,y+10,20,25,false);
                g.fill3DRect(x+30,y,10,50,false);
                g.fillOval(x+9,y+11,20,20);
                g.drawLine(x+20,y+15,x+20,y);
                break;
            case 1://向右
                g.fill3DRect(x,y,50,10,false);
                g.fill3DRect(x+10,y+10,25,20,false);
                g.fill3DRect(x,y+30,50,10,false);
                g.fillOval(x+11,y+9,20,20);
                g.drawLine(x+20,y+20,x+50,y+20);
                break;
            case 2://向下
                g.fill3DRect(x,y,10,50,false);
                g.fill3DRect(x+10,y+10,20,25,false);
                g.fill3DRect(x+30,y,10,50,false);
                g.fillOval(x+9,y+11,20,20);
                g.drawLine(x+20,y+15,x+20,y+50);
                break;
            case 3://向左
                g.fill3DRect(x,y,50,10,false);
                g.fill3DRect(x+10,y+10,25,20,false);
                g.fill3DRect(x,y+30,50,10,false);
                g.fillOval(x+11,y+9,20,20);
                g.drawLine(x+20,y+20,x-7,y+20);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_W){
                myTank.moveTank(0);
                myTank.setDirect(0);
            } else if (e.getKeyCode()==KeyEvent.VK_D){
                myTank.moveTank(1);
                myTank.setDirect(1);
            } else if (e.getKeyCode()==KeyEvent.VK_S){
                myTank.moveTank(2);
                myTank.setDirect(2);
            }else if (e.getKeyCode()==KeyEvent.VK_A){
                myTank.moveTank(3);
                myTank.setDirect(3);
            }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
