package bsc.坦克大战;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

@SuppressWarnings({"all"})
public class MyPanel extends JPanel implements KeyListener ,Runnable{
    Vector<Bomb> bombs = new Vector<>();
    MyTank myTank;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    Vector<Shot> shots = new Vector<>();
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;
    public MyPanel(){
        myTank = new MyTank(500,100);
        Recorder.setEnemyTanks(enemyTanks);
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bom1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bom2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bom3.png"));
        int enemyTanksSize = 3;
        for (int i = 0; i < enemyTanksSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.setEnemyTanks(enemyTanks);
            enemyTank.setDirect(2);
            new Thread(enemyTank).start();
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 50, enemyTank.getDirect());
            enemyTank.shots.add(shot);
            new Thread(shot).start();
            enemyTanks.add(enemyTank);
        }



    }
    public void hitMyTank(){
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (myTank.isLive&&shot.isLive){
                    hitTank(shot,myTank);
                }
            }
        }
    }
    public  void hitTank(Shot shot,Tank tank){
            switch (tank.getDirect()){
                case 0:
                case 2:
                    if (shot.x>tank.getX()&&shot.x<tank.getX()+40&&shot.y>tank.getY()&&shot.y<tank.getY()+50){
                        shot.isLive = false;
                        tank.isLive = false;
                        if (tank instanceof EnemyTank){
                            Recorder.addAllEmeryTank();
                        }
                        bombs.add(new Bomb(tank.getX(),tank.getY()));
                        enemyTanks.remove(tank);
                    }
                    break;
                case 1:
                case 3:
                    if (shot.x>tank.getX()&&shot.x<tank.getX()+50&&shot.y>tank.getY()&&shot.y<tank.getY()+40){
                        shot.isLive = false;
                        tank.isLive = false;
                        if (tank instanceof EnemyTank){
                            Recorder.addAllEmeryTank();
                        }
                        bombs.add(new Bomb(tank.getX(),tank.getY()));
                        enemyTanks.remove(tank);
                    }
            }
    }
    public void showInfor(Graphics g){
        g.setColor(Color.BLACK);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("您击毁的坦克数量",1050,50);
        drawTank(1030,80,g,0,1);
        g.setColor(Color.BLACK);
        g.drawString(Recorder.getAllEmeryTank()+"",1090,115);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillRect(0,0,1000,750);
        if (myTank!=null&&myTank.isLive) {
            drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 0);
        }
        for (int i = 0; i < myTank.shots.size(); i++) {
            Shot shot = myTank.shots.get(i);
            if (shot!=null&&shot.isLive){
                g.fillOval(shot.x-3,shot.y-3,5,5);
            }else {
                myTank.shots.remove(shot);
            }
        }
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if (bomb.life>6){
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);
            }else if (bomb.life>3){
                g.drawImage(image2,bomb.x,bomb.y,60,60,this);
            }else {
                g.drawImage(image3,bomb.x,bomb.y,60,60,this);
            }
            bomb.lifeDown();
            if (bomb.life==0){
                bombs.remove(bomb);
            }
        }
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.isLive){
                drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
            }

            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (shot.isLive){
                    g.fillOval(shot.x-3,shot.y-3,5,5);
                }else {
                    enemyTank.shots.remove(shot);
                }
            }
        }
        showInfor(g);
    }
    public void shotTank(){
        for (int i = 0; i < myTank.shots.size(); i++) {
            Shot shot = myTank.shots.get(i);
            if (shot!=null&&shot.isLive ){
                for (int j = 0; j < enemyTanks.size(); j++) {
                    EnemyTank enemyTank = enemyTanks.get(j);
                    hitTank(shot,enemyTank);
                }
            }
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
                if (myTank.getY()>0) {
                    myTank.moveUp();
                }
                myTank.setDirect(0);
            } else if (e.getKeyCode()==KeyEvent.VK_D){
                if (myTank.getX()+50<1000) {
                    myTank.moveRight();
                }
                myTank.setDirect(1);
            } else if (e.getKeyCode()==KeyEvent.VK_S){
                if (myTank.getY()+50<750) {
                    myTank.moveDown();
                }
                myTank.setDirect(2);
            }else if (e.getKeyCode()==KeyEvent.VK_A){
                if (myTank.getX()>0) {
                    myTank.moveLeft();
                }
                myTank.setDirect(3);
            }

                if (e.getKeyCode()==KeyEvent.VK_J){
                    myTank.shotEnemyTank();
                }


        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            shotTank();
            hitMyTank();
            this.repaint();
        }
    }
}
