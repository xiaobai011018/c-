package bsc.坦克大战;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable{
    Vector<Shot> shots = new Vector<>();
    Vector<EnemyTank> enemyTanks = new Vector<>();
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }
    public boolean isTouch(){
        switch (this.getDirect()){
            case 0:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank!=this){
                        switch (enemyTank.getDirect()){
                            case 0:
                            case 2:
                                if (this.getX()>=enemyTank.getX()
                                        &&this.getX()<=enemyTank.getX()+40
                                        &&this.getY()<=enemyTank.getY()+50
                                        &&this.getY()>=enemyTank.getY()){
                                    return true;
                                }
                                if (this.getX()+40>=enemyTank.getX()
                                        &&this.getX()+40<=enemyTank.getX()+40
                                        &&this.getY()<=enemyTank.getY()+50
                                        &&this.getY()>=enemyTank.getY()){
                                    return true;
                                }
                                break;
                            case 1:
                            case 3:
                                if (this.getX()>=enemyTank.getX()
                                        &&this.getX()<=enemyTank.getX()+50
                                        &&this.getY()<=enemyTank.getY()+40
                                        &&this.getY()>=enemyTank.getY()){
                                    return true;
                                }
                                if (this.getX()+40>=enemyTank.getX()
                                        &&this.getX()+40<=enemyTank.getX()+50
                                        &&this.getY()<=enemyTank.getY()+40
                                        &&this.getY()>=enemyTank.getY()){
                                    return true;
                                }
                                break;

                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank!=this){
                        switch (enemyTank.getDirect()){
                            case 0:
                            case 2:
                                if (this.getX()+50>=enemyTank.getX()
                                        &&this.getX()+50<=enemyTank.getX()+40
                                        &&this.getY()<=enemyTank.getY()+50
                                        &&this.getY()>=enemyTank.getY()){
                                    return true;
                                }
                                if (this.getX()+50>=enemyTank.getX()
                                        &&this.getX()+50<=enemyTank.getX()+40
                                        &&this.getY()+40<=enemyTank.getY()+50
                                        &&this.getY()+40>=enemyTank.getY()){
                                    return true;
                                }
                                break;
                            case 1:
                            case 3:
                                if (this.getX()+50>=enemyTank.getX()
                                        &&this.getX()+50<=enemyTank.getX()+50
                                        &&this.getY()<=enemyTank.getY()+40
                                        &&this.getY()>=enemyTank.getY()){
                                    return true;
                                }
                                if (this.getX()+50>=enemyTank.getX()
                                        &&this.getX()+50<=enemyTank.getX()+50
                                        &&this.getY()+40<=enemyTank.getY()+40
                                        &&this.getY()+40>=enemyTank.getY()){
                                    return true;
                                }
                                break;

                        }
                    }
                }

                break;
            case 2:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank!=this){
                        switch (enemyTank.getDirect()){
                            case 0:
                            case 2:
                                if (this.getX()>=enemyTank.getX()
                                        &&this.getX()<=enemyTank.getX()+40
                                        &&this.getY()+50<=enemyTank.getY()+50
                                        &&this.getY()+50>=enemyTank.getY()){
                                    return true;
                                }
                                if (this.getX()+40>=enemyTank.getX()
                                        &&this.getX()+40<=enemyTank.getX()+40
                                        &&this.getY()+50<=enemyTank.getY()+50
                                        &&this.getY()+50>=enemyTank.getY()){
                                    return true;
                                }
                                break;
                            case 1:
                            case 3:
                                if (this.getX()>=enemyTank.getX()
                                        &&this.getX()<=enemyTank.getX()+50
                                        &&this.getY()+50<=enemyTank.getY()+40
                                        &&this.getY()+50>=enemyTank.getY()){
                                    return true;
                                }
                                if (this.getX()+40>=enemyTank.getX()
                                        &&this.getX()+40<=enemyTank.getX()+50
                                        &&this.getY()+50<=enemyTank.getY()+40
                                        &&this.getY()+50>=enemyTank.getY()){
                                    return true;
                                }
                                break;

                        }
                    }
                }
                break;
            case 3:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank!=this){
                        switch (enemyTank.getDirect()){
                            case 0:
                            case 2:
                                if (this.getX()>=enemyTank.getX()
                                        &&this.getX()<=enemyTank.getX()+40
                                        &&this.getY()<=enemyTank.getY()+50
                                        &&this.getY()>=enemyTank.getY()){
                                    return true;
                                }
                                if (this.getX()>=enemyTank.getX()
                                        &&this.getX()<=enemyTank.getX()+40
                                        &&this.getY()+40<=enemyTank.getY()+50
                                        &&this.getY()+40>=enemyTank.getY()){
                                    return true;
                                }
                                break;
                            case 1:
                            case 3:
                                if (this.getX()>=enemyTank.getX()
                                        &&this.getX()<=enemyTank.getX()+50
                                        &&this.getY()<=enemyTank.getY()+40
                                        &&this.getY()>=enemyTank.getY()){
                                    return true;
                                }
                                if (this.getX()>=enemyTank.getX()
                                        &&this.getX()<=enemyTank.getX()+50
                                        &&this.getY()+40<=enemyTank.getY()+40
                                        &&this.getY()+40>=enemyTank.getY()){
                                    return true;
                                }
                                break;

                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override
    public void run() {
        while(true){
            if (isLive&&shots.size()<3){
                Shot shot = null;
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
            switch (getDirect()){
                case 0:
                    for (int i = 0; i < (int)(Math.random()*200+1); i++) {
                        if (getY()>0&&!isTouch()) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < (int)(Math.random()*200+1); i++) {
                        if (getX()+50<750&&!isTouch()) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < (int)(Math.random()*200+1); i++) {
                        if (getY()+50<1000&&!isTouch()) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < (int)(Math.random()*200+1); i++) {
                        if (getX()>0&&!isTouch()) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            setDirect((int)(Math.random()*4));
        }
    }
}
