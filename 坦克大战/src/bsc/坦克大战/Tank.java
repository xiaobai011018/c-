package bsc.坦克大战;

public class Tank {
    private int x;
    private int y;
    private int direct;
    public boolean isLive = true;
    public void moveRight(){
        x+=2;
    }
    public void moveUp(){
        y-=2;
    }
    public void moveDown(){
        y+=2;
    }public void moveLeft(){
        x-=2;
    }


    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
