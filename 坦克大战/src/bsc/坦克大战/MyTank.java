package bsc.坦克大战;

import java.util.Vector;

public class MyTank extends Tank{
    public Shot shot;
    Vector<Shot> shots = new Vector<>();
    public MyTank(int x, int y) {
        super(x, y);
    }
    public void shotEnemyTank(){
        if (shots.size()==5){
            return;
        }
        switch (getDirect()){
            case 0:
                shot = new Shot(getX()+20,getY(),getDirect());
                break;
            case 1:
                shot = new Shot(getX()+50,getY()+20,getDirect());
                break;
            case 2:
                shot = new Shot(getX()+20,getY()+50,getDirect());
                break;
            case 3:
                shot =new Shot(getX()-1,getY()+20,getDirect());
                break;
        }
        shots.add(shot);
        new Thread(shot).start();
    }
}
